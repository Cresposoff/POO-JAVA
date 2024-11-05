package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a2;

/**
 * 
 * @author Cresposoff
 */

public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    // Constructor con parámetros
    public Programador(String nombre, String dni, int edad, boolean casado, double salario, 
                       int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    // Constructor sin parámetros
    public Programador() {}

    // Getters y Setters
    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    // Método para calcular el salario del programador
    public double calculaSalario() {
        return 10 * lineasDeCodigoPorHora;
    }

    // Sobrescribimos el método toString() para añadir información específica del programador
    @Override
    public String toString() {
        return super.toString() +
               "Lineas de código por hora: " + lineasDeCodigoPorHora + "\n" +
               "Lenguaje dominante: " + lenguajeDominante + "\n" +
               "Salario calculado del programador: " + calculaSalario() + "\n";
    }
}
