package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

public interface IGarage {
    //Debe calcular la suma de ingresos mensuales de todos los vehículos existentes en el garaje
    double calcularIngresos();
    //Indica cuantos vehículos hay del tipo pasado por parámetro en el garaje.
    int calcularOcupacionPorTipoVehiculo(Vehiculo v);

}
