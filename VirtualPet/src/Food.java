// Part B

public class Food {
    private String name;
    private int energy;
    private int happy;
    private int weight;
    public Food(String foodName, int energyInc, int happyInc, int weightInc){
        name = foodName;
        energy = energyInc;
        happy = happyInc;
        weight = weightInc;

    }
    public String getName(){
        return name;
    }
    public int getEnergy(){
        return energy;
    }
    public int getHappy(){
        return happy;
    }
    public int getWeight(){
        return weight;
    }
    public void setName(String n){
        name = n;
    }
    public void setEnergy(int e){
        energy = e;
    }
    public void setHappy(int h){
        happy = h;
    }
    public void setWeight(int w){
        weight = w;
    }

}
