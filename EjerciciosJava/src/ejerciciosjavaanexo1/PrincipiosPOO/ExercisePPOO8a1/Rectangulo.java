package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

public class Rectangulo extends Forma{
    //Atributos
    private double ancho;
    private double alto;

    //Constructor
    public Rectangulo(String nombre, double posicionX, double posicionY, String color, double ancho, double alto) {
        super(nombre, posicionX, posicionY, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    //Métodos
    //Método para calcular el área del Rectangulo
    public double calcularArea(){
        System.out.println("Método desarrollado en Rectangulo para área");
        return ancho * alto;
    }

    //Método para calcular el perímetro del Rectangulo
    public double calcularPerimetro(){
        System.out.println("Método desarrollado en Rectangulo para perímetro");
        return (ancho + alto) * 2;
    }
}
