package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        ajustarImpuestosYCuota();
    }

    private void ajustarImpuestosYCuota() {
        double incrementoImpuesto = 1.0;
        if (tieneRadio)
            incrementoImpuesto += 0.01;
        if (tieneNavegador)
            incrementoImpuesto += 0.02;
        setImpuestoCirculacion(getImpuestoCirculacion() * incrementoImpuesto);

        if (getCilindraje() > 2499) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.2);
        }
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }
}
