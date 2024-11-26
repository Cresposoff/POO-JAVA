package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGarajecopyCamion;

/**
 * 
 * @author Cresposoff
 */

public interface IGaraje {
    double calcularIngresos();

    int calcularOcupacionPorTipoVehiculo(Class<?> tipo);

    int buscarVehiculoPorMatricula(String matricula);

    int calcularPlazasDisponibles();
}