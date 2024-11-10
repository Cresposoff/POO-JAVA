package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 * 
 *         public interface IGaraje {
 * 
 *         double calcularIngresos();
 * 
 *         int calcularOcupacionPorTipoVehiculo(Class<? extends Vehiculo> tipo);
 * 
 *         }
 */

public interface IGaraje {
    boolean alquilarEspacio(Vehiculo vehiculo); // Alquilar un espacio para un vehículo

    boolean retirarVehiculo(String matricula); // Retirar un vehículo según la matrícula

    int buscarVehiculoPorMatricula(String matricula); // Buscar vehículo por matrícula

    int contarVehiculosPorTipo(Class<?> tipo); // Contar vehículos por tipo (Auto, Moto, Camioneta)

    void calcularProporcionVehiculos(); // Calcular proporción de tipos de vehículos

    void contarCamionetasPorTipo(); // Contar camionetas por tipo de servicio
}
