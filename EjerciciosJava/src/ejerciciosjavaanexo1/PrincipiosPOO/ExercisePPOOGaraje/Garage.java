package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

public class Garage implements IGarage {
/*Crear una clase Garaje que tiene una colección (arreglo) de espacios de Vehículos. El número de espacios es una constante de la clase. Esta clase debe cumplir con la interfaz iGarage, que tiene estos métodos definidos:
•   void agregarVehiculo(Vehículo v); Agrega un vehículo a la colección de espacios de vehículos.
•   int calcularOcupacionPorTipoVehiculo(Vehículo v); Indica cuantos vehículos hay del tipo pasado por parámetro en el garaje. */
//Atributos
    final int espaGarage = 10;
    private Vehiculo[] espaciosGarage = new Vehiculo[espaGarage];


    @Override
    public double calcularIngresos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularIngresos'");
    }
    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularOcupacionPorTipoVehiculo'");
    }
}