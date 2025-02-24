package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        //1. Get th number of hours worked
        System.out.println("Enter the hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the pay rate per hour: ");
        double payRate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double total = hours * payRate;

        //4. Display result
        System.out.println("The gross payment is: $" + total);

    }
}
