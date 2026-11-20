// Part A

public class VirtualPet {
    private String name;
    private int weight;
    private int energy = 0;
    private int happy = 0;
    private int years = 0;
    private int months = 0;
    public VirtualPet(String n){
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
    public void feed(){
        energy++;
        weight++;
        if(energy > 10){
            energy = 10;
        }
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
    public void play(){
        happy++;
        weight --;
        check();


    }
    public void updateStatus(){
        happy--;
        energy--;
        months ++;
        check();
    }





}
