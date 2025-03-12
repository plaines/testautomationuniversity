package chapter6;

public class HomaAreaCalculator {
    public static void main(String[] args) {
        //Rectangle 1
        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setAltura(25);
        room1.setAncho(50);
        double areaRoom1 = room1.calcularArea();
        double perimetroRoom1 = room1.calcularPerimetro();

        //Rectangle2
        //Create intance of Rectangle class

        Rectangle room2 = new Rectangle(30, 75);
        double areaRoom2 = room2.calcularArea();
        double perimetroRoom2 = room2.calcularPerimetro();

        double totalArea = areaRoom1 + areaRoom2;
        System.out.println("Total Area: " + totalArea);
        System.out.println("Perimeter Room1: " + perimetroRoom1);
        System.out.println("Perimeter Room2: " + perimetroRoom2);
    }
}
