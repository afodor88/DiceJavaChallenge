package com.company;

public class Dice {
    private int valueAfterRoll;


    public void roll(){
        this.valueAfterRoll = 1 + (int)(Math.random() * 6);
    }

    public int getValueAfterRoll() {
        return valueAfterRoll;
    }
}
