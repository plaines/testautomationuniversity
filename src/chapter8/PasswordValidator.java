package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    public static boolean isValidPassword(String username, String actualPassword, String newPassword) {
        // 1. Longitud mínima de 8 caracteres
        if (newPassword.length() < 8) {
            System.out.println("El password debe tener al menos 8 caracteres.");
            return false;
        }

        // 2. Al menos una letra mayúscula
        if (!newPassword.matches(".*[A-Z].*")) {
            System.out.println("El password debe contener al menos una letra mayúscula.");
            return false;
        }

        // 3. Al menos un carácter especial
        if (!newPassword.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>?/].*")) {
            System.out.println("El password debe contener al menos un carácter especial.");
            return false;
        }

        // 4. No debe contener el username
        if (newPassword.toLowerCase().contains(username.toLowerCase())) {
            System.out.println("El password no debe contener el username.");
            return false;
        }

        // 5. No debe ser igual al actualPassword
        if (newPassword.equals(actualPassword)) {
            System.out.println("El password no puede ser igual al actual.");
            return false;
        }


        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese su username: ");
        String username = scanner.nextLine();

        System.out.print("Ingrese su contraseña actual: ");
        String actualPassword = scanner.nextLine();

        System.out.print("Ingrese su nueva contraseña: ");
        String newPassword = scanner.nextLine();

        scanner.close();

        // Validar el nuevo password
        if (isValidPassword(username, actualPassword, newPassword)) {
            System.out.println("Contraseña válida y actualizada correctamente.");
        } else {
            System.out.println("La nueva contraseña no cumple con los requisitos.");
        }
    }
}
