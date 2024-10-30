package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a13;

public class CarneCongeladaPiezaEntera extends CarneCongelada {
    private boolean vieneEnBandeja;

    public CarneCongeladaPiezaEntera(String nombre, double peso, double precioKilo, String origen,
                                     String empresaDistribuidora, boolean vieneEnBandeja) {
        super(nombre, peso, precioKilo, origen, empresaDistribuidora);
        this.vieneEnBandeja = vieneEnBandeja;
    }

    public boolean isVieneEnBandeja() {
        return vieneEnBandeja;
    }
}
