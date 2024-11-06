package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

 public interface IGarage {
    double calcularIngresos();
    int calcularOcupacionPorTipoVehiculo(Class<? extends Vehiculo> tipo);
}
