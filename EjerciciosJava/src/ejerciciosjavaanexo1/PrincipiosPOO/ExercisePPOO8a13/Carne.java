package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a13;

public abstract class Carne extends Producto {
    protected String origen; // "vacuno" o "avícola"

    public Carne(String nombre, double peso, double precioKilo, String origen) {
        super(nombre, peso, precioKilo);
        this.origen = origen;
    }
}
