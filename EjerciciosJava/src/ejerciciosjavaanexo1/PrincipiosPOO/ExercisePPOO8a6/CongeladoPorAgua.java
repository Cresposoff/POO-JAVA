package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a6;

/**
 * 
 * @author Cresposoff
 */

import java.util.Date;

public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAgua;

    public CongeladoPorAgua(Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen, 
                            double temperaturaRecomendada, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salinidad del agua: " + salinidadAgua + " g/L");
    }
}
