package ejerciciosjava.Parqueaderos.vehicles;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        if (tieneSidecar) {
            this.cuotaMesGaraje *= 1.5;
        }
        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
        if (tieneSidecar) {
            this.impuestoCirculacion *= 1.1;
        }
    }
}
