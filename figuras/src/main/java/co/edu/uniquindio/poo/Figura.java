package co.edu.uniquindio.poo;

import java.util.Comparator;
import java.util.List;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {

        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public static List<Figura> ordenarPorArea(List<Figura> figuras) {

        figuras.sort(Comparator.comparingDouble(Figura::calcularArea));

        return figuras;
    }
}
