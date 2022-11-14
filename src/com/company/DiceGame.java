package com.company;

public class DiceGame {
    private int winCount;
    private int loseCount;

    public int getWinCount() {
        return winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void play(int simulations, Dice dice) {
        if (simulations <= 0) {
            System.out.println("Can't play. Nr. of simulations needs to be > 0");
            return;
        }

        while (simulations > 0) {
            System.out.println("Simulation nr: " + simulations);
            boolean won = false;
            int sumOfRollNumbers = 0;
            for (int i = 1; i <= 4; i++) {
                int rolledValue = dice.roll();
                sumOfRollNumbers += rolledValue;
                System.out.println("Roll number: " + i + " rolled value: " + rolledValue);

                if (rolledValue == 6) {
                    won = true;
                    winCount++;
                    System.out.println("Win! Win count: " + getWinCount() + "$");
                    System.out.println("Mean: " + String.format("%.2f", (double) sumOfRollNumbers/i));
                    break;
                }
            }
            if (!won) {
                loseCount++;
                System.out.println("You lost! Lost count: " + getLoseCount() + "$");

            }

            simulations--;
        }
        System.out.println("Final score: Won: " + getWinCount() + "$" + " Lost: " + getLoseCount() + "$");
    }

    public void play(int simulations, Dice dice1, Dice dice2) {
        if (simulations <= 0) {
            System.out.println("Can't play. Nr. of simulations needs to be > 0");
            return;
        }

        while (simulations > 0) {
            System.out.println("Simulation nr: " + simulations);
            boolean won = false;
            int sumOfRollNumbers = 0;
            for (int i = 1; i <= 24; i++) {
                int rolledValue1 = dice1.roll();
                int rolledValue2 = dice2.roll();
                sumOfRollNumbers += rolledValue1;
                sumOfRollNumbers += rolledValue2;

                System.out.println("Roll number: " + i + " rolled value: " + rolledValue1 + " " + rolledValue2);

                if (rolledValue1 == 6 && rolledValue2 == 6) {
                    won = true;
                    winCount++;
                    System.out.println("Win! New Win count: " + getWinCount() + "$");
                    System.out.println("Mean: " + String.format("%.2f", (double) sumOfRollNumbers/(i*2)));
                    break;
                }
            }
            if(!won){
                loseCount++;
                System.out.println("You lost! Lost count: " + getLoseCount()+ "$");
            }

            simulations--;


        }

        System.out.println("Final score: Won: " + getWinCount() + "$" + " Lost: " + getLoseCount() + "$");
    }
}
