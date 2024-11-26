package ejerciciosjavaanexo1.Parqueaderos.garages;

import java.util.ArrayList;
import ejerciciosjavaanexo1.Parqueaderos.vehicles.*;
import ejerciciosjavaanexo1.Parqueaderos.exceptions.*;

public class Garage {
    private String departamento;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private String nombreAdministrador;
    private int maxEspacios;
    private ArrayList<Vehiculo> espacios;

    public Garage(String departamento, String ciudad, String direccion, String telefono,
                  String email, String nombreAdministrador, int maxEspacios) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.nombreAdministrador = nombreAdministrador;
        this.maxEspacios = maxEspacios;
        this.espacios = new ArrayList<>();
    }

    public void ingresarVehiculo(Vehiculo vehiculo) throws MaximoCamionesException, MaximoMotosException, EspaciosInsuficientesException {
        if (espacios.size() >= maxEspacios) {
            throw new EspaciosInsuficientesException("No hay espacios disponibles en este garaje.");
        }

        long camiones = espacios.stream().filter(v -> v instanceof vehicles.Camion).count();
        long motos = espacios.stream().filter(v -> v instanceof vehicles.Moto).count();

        if (vehiculo instanceof vehicles.Camion) {
            int maxCamiones = (maxEspacios < 100) ? 10 : 20;
            if (camiones >= maxCamiones) {
                throw new MaximoCamionesException("Se ha alcanzado el máximo permitido de camiones en este garaje.");
            }
        }

        if (vehiculo instanceof vehicles.Moto) {
            int maxMotos = (int) (maxEspacios * 0.2);
            if (motos >= maxMotos) {
                throw new MaximoMotosException("Se ha alcanzado el máximo permitido de motos en este garaje.");
            }
        }

        espacios.add(vehiculo);
    }

    public void retirarVehiculo(String matricula) throws GarajeNoEncontradoException {
        Vehiculo vehiculo = buscarVehiculo(matricula);
        if (vehiculo == null) {
            throw new GarajeNoEncontradoException("Vehículo no encontrado en este garaje.");
        }
        espacios.remove(vehiculo);
    }

    public Vehiculo buscarVehiculo(String matricula) {
        return espacios.stream().filter(v -> v.getPlaca().equals(matricula)).findFirst().orElse(null);
    }

    public double calcularRecaudoMensual() {
        return espacios.stream().mapToDouble(Vehiculo::getCuotaMesGaraje).sum();
    }

    public int getOcupacionActual() {
        return espacios.size();
    }

    public int getMaxEspacios() {
        return maxEspacios;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }
}