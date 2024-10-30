package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a13;

public class Pescado extends Producto {
    private String tipoPescado;

    public Pescado(String nombre, double peso, double precioKilo, String tipoPescado) {
        super(nombre, peso, precioKilo);
        this.tipoPescado = tipoPescado;
    }
}
