package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    //Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    
    public String mostrarDatos() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
    }

    
    
}
