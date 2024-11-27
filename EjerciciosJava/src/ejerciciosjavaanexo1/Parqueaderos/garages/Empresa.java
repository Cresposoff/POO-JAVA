package ejerciciosjavaanexo1.Parqueaderos.garages;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Garage> garajes; // Corregido: Lista de garajes

    // Constructor
    public Empresa(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.garajes = new ArrayList<>(); // Inicializamos la lista
    }

    // Método para añadir un garaje a la empresa
    public void agregarGaraje(Garage garaje) {
        garajes.add(garaje);
    }

    // Método para mostrar la información de todos los garajes
    public void mostrarGarajes() {
        if (garajes.isEmpty()) {
            System.out.println("No hay garajes registrados en la empresa.");
            return;
        }

        System.out.println("=== Garajes de la Empresa ===");
        for (Garage garaje : garajes) {
            garaje.mostrarInformacionGaraje();
            System.out.println("-----------------------------");
        }
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Garage> getGarajes() {
        return garajes;
    }
}
