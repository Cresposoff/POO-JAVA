package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGarajecopyCamion;

/**
 * 
 * @author Cresposoff
 */

import java.util.ArrayList;
import java.util.List;

public class Garaje implements IGaraje {
    private static final int ESPACIOS_MAXIMOS = 10; // Número máximo de espacios
    private static final double PORCENTAJE_MAX_CAMIONES = 0.1; // 10% de los espacios pueden ser para camiones
    private List<Vehiculo> vehiculos;

    public Garaje() {
        vehiculos = new ArrayList<>();
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        // Limita la ocupación del garaje a su capacidad máxima
        if (vehiculos.size() >= ESPACIOS_MAXIMOS) {
            System.out.println("Garaje lleno. No se pueden alquilar más espacios.");
            return false;
        }

        // Limita la ocupación para camiones al 10%
        long cantidadCamiones = vehiculos.stream().filter(v -> v instanceof Camion).count();
        if (vehiculo instanceof Camion && cantidadCamiones >= (ESPACIOS_MAXIMOS * PORCENTAJE_MAX_CAMIONES)) {
            System.out.println("No se pueden alquilar más espacios para camiones.");
            return false;
        }

        // Verifica si el vehículo tiene matrícula antes de alquilar
        if (vehiculo.getPlaca() == null || vehiculo.getPlaca().length() != 6) {
            System.out.println("No se puede alquilar un vehículo sin matrícula.");
            return false;
        }

        vehiculos.add(vehiculo);
        return true;
    }

    public boolean retirarVehiculo(String placa) {
        return vehiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    public int buscarVehiculoPorMatricula(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getPlaca().equals(matricula)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double calcularIngresos() {
        return vehiculos.stream().mapToDouble(Vehiculo::getCuotaMesGaraje).sum();
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Class<?> tipo) {
        return (int) vehiculos.stream().filter(tipo::isInstance).count();
    }

    public int calcularPlazasDisponibles() {
        return ESPACIOS_MAXIMOS - vehiculos.size();
    }

    public List<Vehiculo> getListaVehiculos() {
        return vehiculos;
    }
}