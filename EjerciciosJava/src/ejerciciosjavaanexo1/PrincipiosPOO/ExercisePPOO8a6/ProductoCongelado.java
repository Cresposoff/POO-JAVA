package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a6;

/**
 * 
 * @author Cresposoff
 */

import java.util.Date;

public class ProductoCongelado extends ProductoFresco {
    private double temperaturaRecomendada;

    public ProductoCongelado(Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen, 
                             double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada + "°C");
    }
}
