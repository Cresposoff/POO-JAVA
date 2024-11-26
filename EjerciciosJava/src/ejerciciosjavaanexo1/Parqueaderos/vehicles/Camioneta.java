package ejerciciosjavaanexo1.Parqueaderos.vehicles;

public class Camioneta extends Vehiculo {
    private String tipoServicio;
    private int numeroPasajeros;
    private boolean tieneRemolque;

    public Camioneta(String marca, double precio, int cilindraje, String tipoServicio, int numeroPasajeros, boolean tieneRemolque) {
        super(marca, precio, cilindraje);
        this.tipoServicio = tipoServicio;
        this.numeroPasajeros = numeroPasajeros;
        this.tieneRemolque = tieneRemolque;

        if (tipoServicio.equalsIgnoreCase("Pickup") || tipoServicio.equalsIgnoreCase("Carga") || tipoServicio.equalsIgnoreCase("Otro")) {
            this.cuotaMesGaraje *= 1.45;
        } else if (tipoServicio.equalsIgnoreCase("SUV")) {
            this.cuotaMesGaraje *= 1.1;
        }

        if (numeroPasajeros == 2) {
            this.cuotaMesGaraje *= 1.5;
        } else if (numeroPasajeros > 2) {
            this.cuotaMesGaraje *= 1.6;
        }

        if (tieneRemolque) {
            this.cuotaMesGaraje *= 1.1;
        }

        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.05;
    }
}