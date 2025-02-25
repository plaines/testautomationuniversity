package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DieGameRoll {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        final int maxSpaces = 20;
        final int rolls = 5;
        int currentSpace = 0;

        System.out.println("You need 20 spaces to win");


        for (int roll = 1; roll <= rolls; roll++) {
            System.out.println("Rolling #" + roll);
            int die = random.nextInt(6) + 1;
            System.out.println("You got " + die);
            currentSpace += die;
            if (currentSpace == maxSpaces) {
                System.out.println("Great, you got 20!");
                return;
            } else if (currentSpace > maxSpaces) {
                System.out.println("You got more than 20, you are on the: " + currentSpace);
                return;
            } else {
                int spacesLeft = maxSpaces - currentSpace;
                System.out.println("Current space " + currentSpace + ". You need " + spacesLeft + " to get the 20");
            }

        }
        if (currentSpace < maxSpaces) {
            System.out.println("No more rollings, you are on the space " + currentSpace);
        }

        scanner.close();
    }
}
