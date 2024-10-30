package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a6;

import java.util.Date;

public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public CongeladoPorNitrogeno(Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen,
            double temperaturaRecomendada, String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de exposición al nitrógeno: " + tiempoExposicion + " segundos");
    }
}
