package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

public class Moto extends Vehiculo {
    /*Crear clase Moto que hereda de Vehiculo. Esta clase tiene además las siguientes características atributo:
• Un atributo; boolean tieneSidecar que se asigna en el constructor
• Además para una moto, el impuestoCirculacion se incrementa en un 10% más al precio de la cuota normal de moto si tiene sidecar.
• El atributo cuotaMesGarage se aumenta en 50 % si tiene sidecar.*/
    //Atributos
    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
    }

    //• Además para una moto, el impuestoCirculacion se incrementa en un 10% más al precio de la cuota normal de moto si tiene sidecar.
    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneSidecar) {
            impuestoCirculacion += precio * 0.1;
        }
    }

    /*• El atributo cuotaMesGarage se aumenta en 50 % si tiene sidecar.*/
    @Override
    public void setCuotaMesGarage(double cuotaMesGarage) {
        super.setCuotaMesGarage(cuotaMesGarage);
        if (tieneSidecar) {
            cuotaMesGarage *= 1.5;
        }
    }
}
