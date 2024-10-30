package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a9;

import java.util.ArrayList;
import java.util.List;

public class Urbanizacion {
    private List<Vivienda> viviendas;

    public Urbanizacion() {
        viviendas = new ArrayList<>();
    }

    public void agregarVivienda(Vivienda vivienda) {
        viviendas.add(vivienda);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vivienda vivienda : viviendas) {
            total += vivienda.calcularPrecio();
        }
        return total;
    }

    public double calcularPrecioChalets() {
        double total = 0;
        for (Vivienda vivienda : viviendas) {
            if (vivienda instanceof Chalet) {
                total += vivienda.calcularPrecio();
            }
        }
        return total;
    }

    public List<Vivienda> getViviendas() {
        return viviendas;
    }
}
