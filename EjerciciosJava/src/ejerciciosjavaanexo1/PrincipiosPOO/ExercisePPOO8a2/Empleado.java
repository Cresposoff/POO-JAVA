package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a2;

/**
 * 
 * @author Cresposoff
 */

public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    // Constructor con todos los parámetros
    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        setEdad(edad); // Validación de edad
        this.casado = casado;
        this.salario = salario;
    }

    // Constructor sin parámetros
    public Empleado() {}

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 45) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("Edad debe estar entre 18 y 45 años");
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método clasifica() según la edad
    public String clasifica() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    // Método para aumentar el salario en un porcentaje
    public void subirSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100.0;
    }

    // Método toString() para imprimir los datos del empleado
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "DNI: " + dni + "\n" +
               "Edad: " + edad + "\n" +
               "Casado: " + (casado ? "Sí" : "No") + "\n" +
               "Salario: " + salario + "\n" +
               "Clasificación: " + clasifica() + "\n";
    }
}
