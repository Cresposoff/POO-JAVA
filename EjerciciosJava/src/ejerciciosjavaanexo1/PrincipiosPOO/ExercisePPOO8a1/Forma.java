package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

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

    public Forma() {
    }

    //Método para calcular Area
    public double calcularArea() {
        return (posicionX * posicionY);
    }

    //getters y setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Forma [nombre=" + nombre + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", color=" + color
                + "]";
    }
    

}
