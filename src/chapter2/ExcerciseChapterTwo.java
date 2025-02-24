package chapter2;

import java.util.Scanner;

public class ExcerciseChapterTwo {

    public static void main(String[] args) {
        //1. Get th number of hours worked
        System.out.println("Enter an adjective: ");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        System.out.println("Enter a season: ");
        String season = scanner.next();

        System.out.println("Enter a number: ");
        int coffe = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + "day, I drink a minimun of " + coffe + " cups of coffe");


    }
}
