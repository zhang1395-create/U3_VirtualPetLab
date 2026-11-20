// Part B


public class VirtualPetB {
    private String name;
    private int weight;
    private int energy = 0;
    private int happy = 0;
    private int years = 0;
    private int months = 0;
    public VirtualPetB(String n){
        name = n;
        weight = 5;


    }
    public String getName(){
        return name;
    }
    public String toString(){
        String out = name + "'s Information:\nEnergy: " + energy + "\nHappiness: " + happy + "\nWeight: " + weight + "g\nAge: ";
        out += months%12 + " months and " + years + " years";
        return out;
    }
    public void feed(Food f){

        energy += f.getEnergy();
        happy += f.getHappy();
        weight += f.getWeight();
        check();
    }
    public int getEnergyLevel(){
        return energy;
    }
    public int getHappinessLevel(){
        return happy;
    }
    public void check(){
        if(happy > 10){
            happy = 10;
        }
        if(energy > 10){
            energy = 10;
        }
        if(weight < 5){
            weight = 5;
        }
        if(happy < 0){
            happy = 0;
        }
        if(energy<0){
            energy = 0;
        }
        if(months >= 12){
            years += months/12;
            months -= 12;
        }
    }
    public boolean play(Game g){

        boolean won = g.isWinner();
        if(won == true){
            happy++;
        }
        else{
            happy --;
        }

        weight -= g.getWeightDecr();
        check();
        return won;


    }
    public void updateStatus(){
        happy--;
        energy--;
        months ++;
        check();
    }





}
