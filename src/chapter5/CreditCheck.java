package chapter5;

import java.util.Scanner;

public class CreditCheck {

    //what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified = userQualified(creditScore, salary);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Etner your salary: ");
        double salary = scanner.nextDouble();
        return salary;

    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean userQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats you've been apporved");
        } else {
            System.out.println("Sorry you are not qualified");
        }

    }


}
