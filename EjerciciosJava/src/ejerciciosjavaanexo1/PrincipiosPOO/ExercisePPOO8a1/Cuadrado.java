package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

/**
 * 
 * @author Cresposoff
 */

public class Cuadrado extends Forma implements IFormas {
    private double lado;

    public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
