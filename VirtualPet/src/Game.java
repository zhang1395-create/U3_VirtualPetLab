// Part B

public class Game {
    private String name;
    private int happienessIncr;
    private int weightDecr;
    public Game(String n, int happy, int weight){
        name = n;
        happienessIncr = happy;
        weightDecr = weight;
    }
    public String getName(){
        return name;
    }
    public int getHappienessIncr(){
        return happienessIncr;
    }
    public int getWeightDecr(){
        return weightDecr;
    }
    public boolean isWinner(){
        if(Math.random() < 0.5){
            return true;
        }
        return false;
    }

}
