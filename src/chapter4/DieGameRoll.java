package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DieGameRoll {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        final int maxSpaces = 20;
        final int rolls = 5;
        int currentSpace = 0;

        System.out.println("You need 20 spaces to win");

        // Bucle para los lanzamientos del dado
        for (int roll = 1; roll <= rolls; roll++) {
            System.out.println("Rolling #" + roll);

            // Lanzar el dado (generar un número aleatorio entre 1 y 6)
            int die = random.nextInt(6) + 1;
            System.out.println("You got " + die);

            // Avanzar en el tablero
            currentSpace += die;

            // Verificar si el jugador ha ganado o perdido
            if (currentSpace == maxSpaces) {
                System.out.println("Great, you got 20!");
                return; // Terminar el juego
            } else if (currentSpace > maxSpaces) {
                System.out.println("You got more than 20, you are on the: " + currentSpace);
                return; // Terminar el juego
            } else {
                // Mostrar la posición actual y cuántos espacios faltan
                int spacesLeft = maxSpaces - currentSpace;
                System.out.println("Current space " + currentSpace + ". You need " + spacesLeft + " to get the 20");
            }

        }


        if (currentSpace < maxSpaces) {
            System.out.println("No more rollings, you are on the space " + currentSpace);
        }

        scanner.close();
    }
}
