package chapter4;

import java.util.Scanner;

public class AverageTestScore {
    public static void main(String[] args) {
        int stuedentsNumber = 5;
        int testsNumber = 4;

        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < stuedentsNumber; i++) {
            double total = 0;
            for (var j = 0; j < testsNumber; j++) {
                System.out.println("Enter the score for test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;


            }
            double average = total / testsNumber;
            System.out.println("The test average for the student #" + (i + 1) + " is: " + average);

        }
        scanner.close();
    }
}
