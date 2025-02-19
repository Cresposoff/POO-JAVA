package ejerciciosjava.Parqueaderos.vehicles;

public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        if (cilindraje > 2499) {
            this.cuotaMesGaraje *= 1.2;
        }
        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
        if (tieneRadio) {
            this.impuestoCirculacion += this.precio * 0.01;
        }
        if (tieneNavegador) {
            this.impuestoCirculacion += this.precio * 0.02;
        }
    }
}