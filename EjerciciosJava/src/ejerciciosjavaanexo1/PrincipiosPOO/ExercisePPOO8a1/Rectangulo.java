package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

/**
 * 
 * @author Cresposoff
 */

public class Rectangulo extends Forma implements IFormas {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
