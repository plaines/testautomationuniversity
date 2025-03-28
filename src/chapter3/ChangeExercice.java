package chapter3;

import java.util.Scanner;

public class ChangeExercice {
    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the exaclty change to get 1 dollar");

        System.out.println("Number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if (total < dollar) {
            double amountShort = dollar - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        } else if (total > dollar) {
            double amountOver = total - dollar;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        } else {
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }

}
