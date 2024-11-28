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

    public void ingresarVehiculo(Vehiculo vehiculo) throws MaximoCamionesException, MaximoMotosException, EspaciosInsuficientesException, VehiculoYaRegistradoException {
        if (espacios.size() >= maxEspacios) {
            throw new EspaciosInsuficientesException("No hay espacios disponibles en este garaje.");
        }

        if (vehiculo.getPlaca() == null) {
            System.out.println("El vehículo no tiene matrícula asignada.");
        }

        long camiones = espacios.stream().filter(v -> v instanceof Camion).count();
        long motos = espacios.stream().filter(v -> v instanceof Moto).count();

        if (vehiculo instanceof Camion) {
            int maxCamiones = (maxEspacios < 100) ? 10 : 20;
            if (camiones >= maxCamiones) {
                throw new MaximoCamionesException("Se ha alcanzado el máximo permitido de camiones en este garaje.");
            }
        }

        if (vehiculo instanceof Moto) {
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

    public String generarDesgloseOcupacion() {
        int motos = 0, autos = 0, camiones = 0, camionetas = 0;

        for (Vehiculo v : espacios) {
            if (v instanceof Moto) {
                motos++;
            } else if (v instanceof Auto) {
                autos++;
            } else if (v instanceof Camion) {
                camiones++;
            } else if (v instanceof Camioneta) {
                camionetas++;
            }
        }

        StringBuilder desglose = new StringBuilder();
        if (motos > 0) desglose.append("Moto: ").append(motos);
        if (autos > 0) {
            if (desglose.length() > 0) desglose.append(", ");
            desglose.append("Auto: ").append(autos);
        }
        if (camiones > 0) {
            if (desglose.length() > 0) desglose.append(", ");
            desglose.append("Camion: ").append(camiones);
        }
        if (camionetas > 0) {
            if (desglose.length() > 0) desglose.append(", ");
            desglose.append("Camioneta: ").append(camionetas);
        }

        return desglose.toString();
    }

    public void mostrarInformacionGaraje() {
        System.out.println("=== Información del Garaje ===");
        System.out.println("Ubicación: " + this.getDepartamento() + ", " + this.getCiudad());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Email: " + this.email);
        System.out.println("Administrador: " + this.nombreAdministrador);
        System.out.println("Capacidad de Espacios: " + this.maxEspacios);
        System.out.println("Ocupación actual: " + this.getOcupacionActual() + " vehículos.");
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
