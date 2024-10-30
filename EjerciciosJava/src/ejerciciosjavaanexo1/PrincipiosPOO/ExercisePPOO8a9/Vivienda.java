package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a9;

public abstract class Vivienda implements IViviendas, java.io.Serializable {
    protected String calle;
    protected int superficieEnMetros;

    // Constructor
    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
    }

    // Método para calcular el precio (ajustado en Chalet)
    public double calcularPrecio() {
        return superficieEnMetros * 1000;
    }

    // Método abstracto para el impuesto municipal
    public abstract double impuestoMunicipal();

    // Implementación de la interfaz IViviendas
    @Override
    public void aumentarPrecio(int aumento) {
        this.superficieEnMetros += aumento;
    }

    public void mostrarInformacion() {
        System.out.println("Calle: " + calle);
        System.out.println("Superficie: " + superficieEnMetros + " m²");
        System.out.println("Precio: " + calcularPrecio());
        System.out.println("Impuesto Municipal: " + impuestoMunicipal());
    }
}
