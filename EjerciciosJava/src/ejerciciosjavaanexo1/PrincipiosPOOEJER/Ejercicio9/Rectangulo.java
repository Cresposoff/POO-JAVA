package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio9;

public class Rectangulo extends Poligono {
    //Atributos
    private double lado1;
    private double lado2;

    // Constructor
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    // Método sobre escritura de la clase padre + sobreescritura de la clase hija
    @Override
    public String toString() {
        return " RECTANGULO: \n" + super.toString() + "\nlado1: " + lado1 + "\nlado2: " + lado2;
    }

    // Método para implementar el método abstracto + Override por que se está implementando el método abstracto de la clase padre
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}
