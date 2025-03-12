package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
        calculator.scanner.close();

    }

    public Rectangle getRoom() {
        System.out.println("Ingresa la altura de tu cuarto: ");
        double altura = scanner.nextDouble();

        System.out.println("Ingresa el ancho de tu cuarto: ");
        double ancho = scanner.nextDouble();

        return new Rectangle(altura, ancho);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calcularArea() + rectangle2.calcularArea();
    }

}
