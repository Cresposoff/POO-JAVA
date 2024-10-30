package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a13;

public class CarneCongeladaPiezaTroceada extends CarneCongelada {
    private int numMedioPiezas;

    public CarneCongeladaPiezaTroceada(String nombre, double peso, double precioKilo, String origen,
                                       String empresaDistribuidora, int numMedioPiezas) {
        super(nombre, peso, precioKilo, origen, empresaDistribuidora);
        this.numMedioPiezas = numMedioPiezas;
    }
}
