package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a7;

/**
 * 
 * @author Cresposoff
 */

public class Empleado {
    private String nombre;
    private String telefono;
    private static int numeroEmpleados = 0;

    // Constructor
    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroEmpleados++;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método estático para obtener el número de empleados instanciados
    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    // Método para mostrar información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}
