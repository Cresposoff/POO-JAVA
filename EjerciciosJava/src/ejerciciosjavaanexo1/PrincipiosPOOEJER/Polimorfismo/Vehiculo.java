package ejerciciosjavaanexo1.PrincipiosPOOEJER.Polimorfismo;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método mostrar datos
    public String mostrarDatos() {
        return "Vehiculo general: \nMATRICULA: " + matricula + "\nMARCA: " + marca + "\nMODELO: " + modelo;
    }
    
}
