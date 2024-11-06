package ejerciciosjavaanexo1.PrincipiosPOOEJER.Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    // Atributos
    protected int cilindrada;

    // Constructor
    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    // Getters
    public int getCilindrada() {
        return cilindrada;
    }

    // Método de sobre esritura
    @Override
    public String mostrarDatos() {
        return "Deportivo: \nMATRICULA: " + getMatricula() + "\nMARCA: " + getMarca() + "\nMODELO: " + getModelo() + 
        "\nCILINDRADA: " + cilindrada;
    }
    
}
