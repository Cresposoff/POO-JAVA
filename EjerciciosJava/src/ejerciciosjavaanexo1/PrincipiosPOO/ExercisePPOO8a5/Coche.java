package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a5;

public class Coche extends Vehiculo {
    private int puertas;

    // Constructor
    public Coche(double precioCompra, String marca, int puertas) {
        super(precioCompra, marca);
        this.puertas = puertas;
    }

    // Implementación del método precioVenta
    @Override
    public double precioVenta() {
        return getPrecioCompra() * 1.6; // Incremento del 60%
    }

    @Override
    public String toString() {
        return super.toString() + "\nPuertas: " + puertas + "\nPrecio de Venta: " + precioVenta();
    }
}
