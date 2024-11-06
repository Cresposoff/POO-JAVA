package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

import java.util.ArrayList;

public class Garaje implements IGarage {
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
