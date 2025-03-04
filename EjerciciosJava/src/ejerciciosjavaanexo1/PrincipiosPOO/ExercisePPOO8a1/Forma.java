package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

/**
 * 
 * @author Cresposoff
 */

public abstract class Forma {
    private String nombre;
    private double posicionX;
    private double posicionY;
    private String color;

    public Forma(String nombre, double posicionX, double posicionY, String color) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método abstracto que deben implementar las subclases
    public abstract double calcularArea();
    
    // Método abstracto agregado por Mejora 4
    public abstract double calcularPerimetro();
}
