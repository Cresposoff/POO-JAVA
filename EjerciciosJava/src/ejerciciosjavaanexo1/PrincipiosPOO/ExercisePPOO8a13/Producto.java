package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a13;

/**
 * 
 * @author Cresposoff
 */

public abstract class Producto implements IProducto {
    protected String nombre;
    protected double peso;
    protected double precioKilo;

    public Producto(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }

    public String getNombre() {
        return nombre;
    }
}
