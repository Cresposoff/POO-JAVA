package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a3;

/**
 * 
 * @author Cresposoff
 */

public class Persona {
    private String nombre;
    private String nif;

    // Constructor parametrizado
    public Persona(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNIF: " + nif;
    }
}

