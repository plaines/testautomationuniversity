package chapter3;

import java.util.Scanner;

public class QuoataCalculator {
    public static void main(String[] args) {

        int expected = 10;

        System.out.println("How many sales did the employee did?: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if (sales >= 10) {
            System.out.println("Congratulation!! keep in the track");
        } else {
            int missing = expected - sales;
            System.out.println("You are short " + missing + " " + "sales short");
        }


    }
}
