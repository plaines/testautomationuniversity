package chapter4;

import java.util.Scanner;

public class CashierForLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number of items: ");
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();
        double total = 0;

        for (var i = 0; i < items; i++) {
            System.out.println("enter the cost of the " + i + " item: ");
            double price = scanner.nextDouble();
            total = total + price;

        }
        scanner.close();
        System.out.println("The total is: " + total);
    }
}
