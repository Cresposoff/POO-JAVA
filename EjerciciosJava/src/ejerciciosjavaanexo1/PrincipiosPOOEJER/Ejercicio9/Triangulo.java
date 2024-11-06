package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio9;

public class Triangulo extends Poligono{
    //Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Método para implementar el método abstracto + Override por que se está implementando el método abstracto de la clase padre
    @Override
    public String toString() {
    return " TRIANGULO: \n" + super.toString() + "\nlado1: " + lado1 + "\nlado2: " + lado2 + "\nlado3: " + lado3;
    }

    // Método sobre escritura de la clase padre + sobreescritura de la clase hija
    @Override
    public double calcularArea() {
        double p = (lado1 + lado2 + lado3)/2;
        return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));
    }

    
}
