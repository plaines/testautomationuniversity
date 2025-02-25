package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        //salary per hour
        int payRate = 15;
        //max hours
        int maxHours = 40;

        System.out.println("Enter the hours worked this week: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //while loop to validate the input
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid inut, you reach the max hours per week");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double groosPay = payRate * hoursWorked;
        System.out.println("Gross pay: $" + groosPay);
    }
}
