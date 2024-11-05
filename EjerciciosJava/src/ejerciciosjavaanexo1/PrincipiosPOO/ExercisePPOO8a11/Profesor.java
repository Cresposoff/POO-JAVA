package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a11;

/**
 * 
 * @author Cresposoff
 */

public class Profesor {
    protected String nombre;
    protected int edad;
    protected int añosConsolidados;

    // Constructor de la superclase
    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }
}
