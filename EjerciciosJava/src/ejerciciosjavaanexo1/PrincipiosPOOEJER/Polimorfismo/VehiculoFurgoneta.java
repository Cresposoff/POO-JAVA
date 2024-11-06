package ejerciciosjavaanexo1.PrincipiosPOOEJER.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
    // Atributos
    private int carga;

    // Constructor
    public VehiculoFurgoneta(String matricula,  String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    // Getters
    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "Furgoneta: \nMATRICULA: " + getMatricula() + "\nMARCA: " + getMarca() + "\nMODELO: " + getModelo() +
        "\nCARGA: " + carga;
    }
    

}
