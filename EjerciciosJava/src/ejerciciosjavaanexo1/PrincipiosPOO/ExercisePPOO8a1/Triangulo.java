package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

public class Triangulo extends Forma{
    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }
    
    public Triangulo() {
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Métodos
    //Método para calcular el área del Triángulo
    public double calcularArea(){
        System.out.println("Método desarrollado en Triangulo para área");
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + ", getBase()=" + getBase() + ", getAltura()="
                + getAltura() + ", getNombre()=" + getNombre() + ", getPosicionX()=" + getPosicionX()
                + ", getPosicionY()=" + getPosicionY() + ", getColor()=" + getColor() + "]";
    }


}
