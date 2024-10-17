package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo {

    private double lado;

    public Cuadrado(String nombre, double ancho, double alto, double lado) {
        super(nombre, ancho, alto);

        this.lado = lado;

    }

    @Override
    public double calcularArea() {

        double area = lado * lado;

        return area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
