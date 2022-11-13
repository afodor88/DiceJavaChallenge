package com.company;

public class DiceGame {
    private int winCount;

    public int getWinCount() {
        return winCount;
    }

    public void play(int simulations, Dice dice){
        if(simulations <= 0){
            System.out.println("Can't play. Nr. of simulations needs to be > 0");
            return;
        }

        while(simulations > 0){
            System.out.println("Simulation nr: " + simulations);
            for(int i=0; i<4;i++){
                System.out.println("Roll number: " + (i + 1));
                dice.roll();
                int rolledValue = dice.getValueAfterRoll();
                if(rolledValue == 6){
                    winCount++;
                    System.out.println("Win! New Win count: " + getWinCount());
                    break;
                }
            }
            simulations--;


        }
    }

    public void play(int simulations, Dice dice1, Dice dice2){
        if(simulations <= 0){
            System.out.println("Can't play. Nr. of simulations needs to be > 0");
            return;
        }

        while(simulations > 0){
            System.out.println("Simulation nr: " + simulations);
            for(int i=0; i<24;i++){
                System.out.println("Roll number: " + (i + 1));
                dice1.roll();
                dice2.roll();
                int rolledValue1 = dice1.getValueAfterRoll();
                int rolledValue2 = dice2.getValueAfterRoll();

                if(rolledValue1 == 6 && rolledValue2 == 6){
                    winCount++;
                    System.out.println("Win! New Win count: " + getWinCount());
                    break;
                }
            }
            simulations--;


        }
    }
}
