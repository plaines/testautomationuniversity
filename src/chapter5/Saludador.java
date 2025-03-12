package chapter5;

public class Saludador {

    //static int x = 11;

    //Metodo que no devuelve nada (void) y no recibe parámetros
    public void saludar() {
        System.out.println("¡Hola, mundo!");
        int x = 10; //Variable con alcance local
    }

    public int sumar(int a, int b) {
        return a + b; // Devuelve la suma de a y b
    }

    public static void main(String[] args) {
        Saludador saludo = new Saludador(); // Crear un objeto de la clase
        saludo.saludar(); // Llamar al metodo
        //System.out.println(x); //Falla al llamar

        Saludador calc = new Saludador();

        int resultado = calc.sumar(5, 3);
        System.out.println("El resultado es: " + resultado);
    }
}

/*
 bloques de código que realizan
 una tarea específica. Puedes pensar en ellos
 como acciones o comportamientos que un objeto puede realizar.

Modificador de acceso: Define desde dónde se puede acceder al metodo (por ejemplo, public, private, protected).
Tipo de retorno: Especifica el tipo de dato que el metodo devuelve (por ejemplo, int, String, void si no devuelve nada).
Nombre del metodo: Es el identificador del metodo. Debe ser descriptivo.
Parámetros: Son valores que se pasan al metodo para que los use (opcional).
Cuerpo del metodo: Contiene las instrucciones que se ejecutan cuando se llama al metodo.
return: Devuelve un valor (si el tipo de retorno no es void).
*/
