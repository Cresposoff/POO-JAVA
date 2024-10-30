package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a5;

public class Furgoneta extends Vehiculo {
    private double capacidadCarga; // en metros cúbicos

    // Constructor
    public Furgoneta(double precioCompra, String marca, double capacidadCarga) {
        super(precioCompra, marca);
        this.capacidadCarga = capacidadCarga;
    }

    // Implementación del método precioVenta
    @Override
    public double precioVenta() {
        double precioInicial = getPrecioCompra() * 1.6; // Incremento del 60%
        if (capacidadCarga > 10) {
            precioInicial *= 1.2; // Incremento adicional del 20% si carga > 10 m³
        }
        return precioInicial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad de Carga: " + capacidadCarga + " m³\nPrecio de Venta: " + precioVenta();
    }
}
