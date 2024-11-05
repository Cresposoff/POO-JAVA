package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a5;

/**
 * 
 * @author Cresposoff
 */

public abstract class Vehiculo {
    private double precioCompra;
    private String marca;

    // Constructor
    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
    }

    // Getters
    public double getPrecioCompra() {
        return precioCompra;
    }

    public String getMarca() {
        return marca;
    }

    // Método abstracto para calcular el precio de venta
    public abstract double precioVenta();

    @Override
    public String toString() {
        return "Marca: " + marca + "\nPrecio de Compra: " + precioCompra;
    }
}
