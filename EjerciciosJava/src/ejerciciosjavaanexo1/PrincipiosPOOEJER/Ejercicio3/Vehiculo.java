package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    // Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "marca: " + marca + "\nmodelo: " + modelo + "\nprecio: $" + precio;
    }

    // Método para que me retorne el indice del array de vehiculos de objetos v, al
    // decidir qué vehículo es más barato
    public int indiceVehiculoBarato(Vehiculo v[]) {
        int indice = 0;
        Double precio = v[0].getPrecio();
        for (int i = 1; i < v.length; i++) {
            if (v[i].getPrecio() < precio) {
                indice = i;
                precio = v[i].getPrecio();
            }
        }
        return indice;
    }

}
