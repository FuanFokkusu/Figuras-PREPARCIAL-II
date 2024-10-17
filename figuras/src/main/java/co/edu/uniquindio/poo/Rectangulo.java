package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {

    private double ancho;

    private double alto;

    public Rectangulo(String nombre, double ancho, double alto) {
        super(nombre);

        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {

        double area = ancho * alto;

        return area;

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

}
