package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

public class Cuadrado extends Forma{
    //Atributos
    private double lado;

    //Constructor
    public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    //Métodos
    //Método para calcular el área del Cuadrado
    public double calcularArea(){
        System.out.println("Método desarrollado en Cuadrado para área");
        return lado * lado;
    }

    //Método para calcular el perímetro del Cuadrado
    public double calcularPerimetro(){
        System.out.println("Método desarrollado en Cuadrado para perímetro");
        return lado * 4;
    }
}
