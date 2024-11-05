package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a6;

/**
 * 
 * @author Cresposoff
 */

import java.util.Date;

public class CongeladoPorAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public CongeladoPorAire(Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen, 
                            double temperaturaRecomendada, double porcentajeNitrogeno, double porcentajeOxigeno, 
                            double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Composición del aire:");
        System.out.println("  Nitrógeno: " + porcentajeNitrogeno + "%");
        System.out.println("  Oxígeno: " + porcentajeOxigeno + "%");
        System.out.println("  Dióxido de carbono: " + porcentajeDioxidoCarbono + "%");
        System.out.println("  Vapor de agua: " + porcentajeVaporAgua + "%");
    }
}
