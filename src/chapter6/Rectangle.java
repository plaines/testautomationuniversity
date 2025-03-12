package chapter6;

public class Rectangle {

    private double ancho;
    private double altura;

    public Rectangle() {
        altura = 0;
        ancho = 0;
    }

    public Rectangle(double altura, double ancho) {
        setAltura(altura);
        setAncho(ancho);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public double calcularPerimetro() {

        return (2 * ancho) + (2 * altura);
    }

    public double calcularArea() {
        return altura * ancho;
    }
}
