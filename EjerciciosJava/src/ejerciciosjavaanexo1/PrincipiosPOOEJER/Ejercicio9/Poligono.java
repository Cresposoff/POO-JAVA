package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio9;

public abstract class Poligono {
    // Atributos
    private int numeroLados;

    // Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Getters
    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "LADOS: " + numeroLados;
    }

    // (Declaracion) de metodos calcularArea como abstracto
    public abstract double calcularArea();
}
