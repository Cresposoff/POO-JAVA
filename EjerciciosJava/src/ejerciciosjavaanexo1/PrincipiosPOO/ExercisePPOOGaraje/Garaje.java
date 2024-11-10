package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 * 
 * import java.util.ArrayList;

public class Garaje implements IGaraje {
    private ArrayList<Vehiculo> espacios;
    public static final int MAX_ESPACIOS = 100;

    public Garaje() {
        this.espacios = new ArrayList<>();
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (espacios.size() >= MAX_ESPACIOS) return false;
        if (vehiculo.getPlaca() == null) return false;

        long motos = espacios.stream().filter(v -> v instanceof Moto).count();
        if ((motos + 1) > (MAX_ESPACIOS * 0.8) && vehiculo instanceof Moto) return false;

        espacios.add(vehiculo);
        return true;
    }

    public boolean retirarVehiculo(String placa) {
        return espacios.removeIf(vehiculo -> vehiculo.getPlaca().equals(placa));
    }

    @Override
    public double calcularIngresos() {
        return espacios.stream().mapToDouble(Vehiculo::getCuotaMesGaraje).sum();
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Class<? extends Vehiculo> tipo) {
        return (int) espacios.stream().filter(tipo::isInstance).count();
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return new ArrayList<>(espacios);
    }
}
 */

import java.util.ArrayList;

import java.util.List;

public class Garaje {
    private List<Vehiculo> vehiculos;
    private int capacidadMaxima;

    public Garaje(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.vehiculos = new ArrayList<>();
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        long totalCamionetas = vehiculos.stream().filter(v -> v instanceof Camioneta).count();
        long totalMotos = vehiculos.stream().filter(v -> v instanceof Moto).count();

        // Validación de espacio para camionetas y motos
        if (vehiculo instanceof Camioneta && totalCamionetas >= capacidadMaxima * 0.2) {
            System.out.println("No se pueden alquilar más espacios para camionetas.");
            return false;
        }
        if (vehiculo instanceof Moto && totalMotos >= capacidadMaxima * 0.3) {
            System.out.println("No se pueden alquilar más espacios para motos.");
            return false;
        }

        if (vehiculos.size() < capacidadMaxima) {
            vehiculos.add(vehiculo);
            return true;
        } else {
            System.out.println("El garaje está lleno.");
            return false;
        }
    }

    public Vehiculo retirarVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(matricula)) {
                vehiculos.remove(v);
                return v;
            }
        }
        System.out.println("Vehículo no encontrado.");
        return null;
    }

    public int buscarVehiculoPorMatricula(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getPlaca().equals(matricula)) {
                return i;
            }
        }
        return -99;
    }

    public int contarVehiculosPorTipo(String tipo) {
        return (int) vehiculos.stream()
                .filter(v -> v.getClass().getSimpleName().equalsIgnoreCase(tipo))
                .count();
    }

    public void mostrarProporcionVehiculos() {
        long totalAutos = contarVehiculosPorTipo("Auto");
        long totalMotos = contarVehiculosPorTipo("Moto");
        long totalCamionetas = contarVehiculosPorTipo("Camioneta");

        long total = vehiculos.size();
        System.out.printf("Proporción - Autos: %.2f%%, Motos: %.2f%%, Camionetas: %.2f%%%n",
                (double) totalAutos / total * 100,
                (double) totalMotos / total * 100,
                (double) totalCamionetas / total * 100);
    }

    public void mostrarCantidadCamionetasPorTipo() {
        long suv = vehiculos.stream()
                .filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equals("SUV")).count();
        long pickup = vehiculos.stream()
                .filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equals("Pickup")).count();
        long carga = vehiculos.stream()
                .filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equals("Carga")).count();
        long otro = vehiculos.stream()
                .filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equals("Otro")).count();

        System.out.printf("Cantidad de Camionetas - SUV: %d, Pickup: %d, Carga: %d, Otro: %d%n", suv, pickup, carga,
                otro);
    }
}
