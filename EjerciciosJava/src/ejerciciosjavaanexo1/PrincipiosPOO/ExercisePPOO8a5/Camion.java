package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a5;

public class Camion extends Vehiculo {
    private double tamanoRemolque; // en metros
    private int ejes;

    // Constructor
    public Camion(double precioCompra, String marca, double tamanoRemolque, int ejes) {
        super(precioCompra, marca);
        this.tamanoRemolque = tamanoRemolque;
        this.ejes = ejes;
    }

    // Implementación del método precioVenta
    @Override
    public double precioVenta() {
        return getPrecioCompra() * 1.6 * ejes; // Incremento del 60% y multiplicado por el número de ejes
    }

    @Override
    public String toString() {
        return super.toString() + "\nTamaño de Remolque: " + tamanoRemolque + " m\nEjes: " + ejes + "\nPrecio de Venta: " + precioVenta();
    }
}
