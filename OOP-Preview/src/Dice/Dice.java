package Dice;

import java.util.Random;

public class Dice {
    private int sides;
    private String type;

    public Dice(int sides,String type){
        this.sides = sides;
        this.type = type;
    }
    private int getSides(){
        return this.sides;
    }
    private String getType(){
        return this.type;
    }
    protected int roll(){
        Random rnd = new Random();
        int rollResult = rnd.nextInt(this.getSides());
        return rollResult;
    }
    protected StringBuilder diceInformation(){
        StringBuilder builder = new StringBuilder();
        builder.append("Sides ->").append(this.getSides()).append(" Color -> ").append(this.getType());
        System.out.println(builder);
        return builder;
    }
}
