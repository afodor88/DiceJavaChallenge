package com.company;

public class DiceGame {
    private Dice dice;
    private int winCount;

    public DiceGame(Dice dice) {
        this.dice = dice;
    }

    public Dice getDice() {
        return dice;
    }

    public int getWinCount() {
        return winCount;
    }

    public void play(int simulations){
        if(simulations <= 0){
            System.out.println("Can't play. Nr. of simulations needs to be > 0");
            return;
        }

        while(simulations > 0){
            System.out.println("Simulation nr: " + simulations);
            for(int i=0; i<4;i++){
                System.out.println("Roll number: " + (i + 1));
                getDice().roll();
                int rolledValue = dice.getValueAfterRoll();
                if(rolledValue == 6){
                    winCount++;
                    System.out.println("Win! New Win count: " + winCount);
                    break;
                }
            }
            simulations--;


        }
    }
}
