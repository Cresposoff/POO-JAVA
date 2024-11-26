package ejerciciosjavaanexo1.Parqueaderos.garages;

import java.util.ArrayList;
import ejerciciosjavaanexo1.Parqueaderos.exceptions.*;
import ejerciciosjavaanexo1.Parqueaderos.vehicles.Vehiculo;

public class RedDeGarajes {
    private ArrayList<Garage> garajes;

    public RedDeGarajes() {
        this.garajes = new ArrayList<>();
    }

    public void agregarGaraje(Garage garaje) {
        garajes.add(garaje);
    }

    public void eliminarGaraje(String direccion) throws GarajeNoEncontradoException {
        Garage garaje = buscarGaraje(direccion);
        if (garaje == null) {
            throw new GarajeNoEncontradoException("Garaje no encontrado.");
        }
        garajes.remove(garaje);
    }

    public Garage buscarGaraje(String direccion) {
        return garajes.stream().filter(g -> g.getDireccion().equals(direccion)).findFirst().orElse(null);
    }

    public void ingresarVehiculoAGaraje(String direccion, Vehiculo vehiculo) throws VehiculoYaRegistradoException, GarajeNoEncontradoException {
        for (Garage garaje : garajes) {
            if (garaje.buscarVehiculo(vehiculo.getPlaca()) != null) {
                throw new VehiculoYaRegistradoException("El vehículo ya está registrado en otro garaje.");
            }
        }

        Garage garaje = buscarGaraje(direccion);
        if (garaje == null) {
            throw new GarajeNoEncontradoException("Garaje no encontrado.");
        }

        try {
            garaje.ingresarVehiculo(vehiculo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Garage> getGarajes() {
        return garajes;
    }
}