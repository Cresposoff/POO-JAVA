package ejerciciosjava.Parqueaderos.garages;

public interface iGarage {
    double calcularIngresos();
    int calcularOcupacionPorTipoVehiculo(String tipo);
    int buscarVehiculo(String matricula);
    void retirarVehiculo(int posicion);
}
