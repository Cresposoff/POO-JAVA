package ejerciciosjavaanexo1.PrincipiosPOOEJER.Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    // Atributos
    private int numeroPuertas;

    // Constructor
    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // Getters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    // Método de sobre esritura
    @Override
    public String mostrarDatos() {
        return "Turismo: \nMATRICULA: " + getMatricula() + "\nMARCA: " + getMarca() + "\nMODELO: " + getModelo() + 
        "\nNUMERO DE PUERTAS: " + numeroPuertas;
    }

}
