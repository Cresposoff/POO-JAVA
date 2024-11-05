package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a6;

/**
 * 
 * @author Cresposoff
 */

import java.util.Date;

public class ProductoFresco extends Producto {
    private Date fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
    }
}
