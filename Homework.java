package RoboticsTraining2022;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    static final int MAX_TURNS = 7;

    static int intMod(int a, int b) {
        return ((((a % b) + b) % b));
    }

    static int randrange(int min, int max, Random rand) {
        int diff = max - min;
        return intMod(rand.nextInt(), diff + 1) + min;
    }

    static void cool() {
        cool();
    }

    public static void main(String args[]) {
        cool();
        Random random = new Random();
        int inNum = -1;
        int turns = 0;
        Scanner scan = new Scanner(System.in);

        int computerMin = 1;
        int computerMax = 100;
        boolean playerWin = true;

        while (!(inNum >= computerMin && inNum <= computerMax)) {
            System.out.print("Input a number from 0-100 > ");
            inNum = scan.nextInt();
            System.out.print("\n");
        }

        while (turns < MAX_TURNS) {
            int computerGuess = randrange(computerMin, computerMax, random);
            computerGuess = inNum;
            System.out.println("My guess: " + computerGuess);
            if (computerGuess == inNum) {
                System.out.println("I Win!");
                playerWin = false;
                break;
            }

            boolean invalid = true;
            while (invalid) {
                System.out.print("Is it Higher or Lower? > ");
                String hOrL = scan.next().toLowerCase();
                if (hOrL.equals("higher")) {
                    computerMin = computerGuess + 1;
                    invalid = false;
                } else if (hOrL.equals("lower")) {
                    computerMax = computerGuess - 1;
                    invalid = false;
                }
                System.out.print("\n");
            }

            turns++;
        }
        if (playerWin)
            System.out.println("You Win. I am out of guesses.");
        scan.close();
    }
}
