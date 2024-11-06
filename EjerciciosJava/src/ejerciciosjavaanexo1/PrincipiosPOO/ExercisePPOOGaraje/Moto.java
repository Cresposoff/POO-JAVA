package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        ajustarImpuestosYCuota();
    }

    private void ajustarImpuestosYCuota() {
        if (tieneSidecar) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.5);
            this.setImpuestoCirculacion(getImpuestoCirculacion() * 1.1);
        }
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
}
