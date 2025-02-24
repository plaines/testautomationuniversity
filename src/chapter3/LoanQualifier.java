package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {

        int requiredSalary = 30000;
        int timeJob = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer: ");
        double years = scanner.nextDouble();

        if (salary >= requiredSalary) {
            if (years >= timeJob) {
                System.out.println("The loan is approved");
            } else {
                System.out.println("Sorry you don't qualify for the loan");
            }
        } else {
            System.out.println("Sorry you don't qualify for the loan");
        }
    }
}
