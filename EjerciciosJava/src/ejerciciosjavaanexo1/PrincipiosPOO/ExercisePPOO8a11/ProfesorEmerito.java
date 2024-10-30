package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a11;

public class ProfesorEmerito extends Profesor {
    private int añosEmerito;

    // Constructor de la subclase
    public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }

    // Método para calcular el salario base
    public double obtenerSalarioBase() {
        return 925 + (añosConsolidados * 12.25) + (23.40 * añosEmerito);
    }
}
