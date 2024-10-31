package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

public class Auto extends Vehiculo {
    /*
     * Crear clase Auto que hereda de Vehiculo. Esta clase tiene además los
     * atributos:
     * • boolean tieneRadio , que se asigna en el constructor
     * • boolean tieneNavegador , que se asigna en el constructor
     * • Además para un auto, el impuestoCirculacion se incrementa en un 1% más al
     * precio de la cuota normal de vehículo si tiene radio y un 2% más al precio de
     * la cuota normal de vehículo si tiene navegador.
     * • El atributo cuotaMesGarage se aumenta en 20 % si el cilindraje del auto es
     * mayor de 2499.
     */
    // Atributos
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    // • Además para un auto, el impuestoCirculacion se incrementa en un 1% más al
    // precio de la cuota normal de vehículo si tiene radio y un 2% más al precio de
    // la cuota normal de vehículo si tiene navegador.
    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneRadio) {
            impuestoCirculacion += precio * 0.01;
        }
        if (tieneNavegador) {
            impuestoCirculacion += precio * 0.02;
        }
    }

    /*
     * • El atributo cuotaMesGarage se aumenta en 20 % si el cilindraje del auto es
     * mayor de 2499.
     */
    @Override
    public void setCuotaMesGarage(double cuotaMesGarage) {
        super.setCuotaMesGarage(cuotaMesGarage);
        if (cilindraje > 2499) {
            cuotaMesGarage *= 1.2;
        }
    }
}
