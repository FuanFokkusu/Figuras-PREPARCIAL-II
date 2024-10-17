package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FiguraTest {

    @Test
    public void testOrdenarListaVacia() {
        List<Figura> figuras = new ArrayList<>();
        List<Figura> figurasOrdenadas = Figura.ordenarPorArea(figuras);
        assertTrue(figurasOrdenadas.isEmpty(), "La lista ordenada debería estar vacía.");
    }

    @Test
    public void testOrdenarListaConDatos() {
        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado("Cuadrado", 0.00, 0.00, 13.00));
        figuras.add(new Rectangulo("Rectangulo", 40.00, 30.00));

        List<Figura> figurasOrdenadas = Figura.ordenarPorArea(figuras);

        // Verificar que están ordenadas por área ascendente

        assertEquals(169.00, figurasOrdenadas.get(0).calcularArea());
        assertEquals(1200.00, figurasOrdenadas.get(1).calcularArea());
    }

    @Test
    public void testOrdenarListaNula() {
        assertThrows(NullPointerException.class, () -> {Figura.ordenarPorArea(null);});
    }
}
