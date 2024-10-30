package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a6;

import java.util.Date;

public class ProductoRefrigerado extends ProductoFresco {
    private String codigoSupervision;
    private double temperaturaRecomendada;

    public ProductoRefrigerado(Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen, 
                               String codigoSupervision, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.codigoSupervision = codigoSupervision;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código de supervisión: " + codigoSupervision);
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada + "°C");
    }
}
