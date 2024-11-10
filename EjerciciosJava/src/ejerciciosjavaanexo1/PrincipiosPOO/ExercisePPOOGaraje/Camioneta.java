package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

public class Camioneta extends Vehiculo {
    private String tipoServicio;
    private int numPasajeros;
    private boolean tieneRemolque;

    public Camioneta(String matricula, double precio, String tipoServicio, int numPasajeros, boolean tieneRemolque) {
        super(tipoServicio, precio, numPasajeros);

        // Validaciones
        if (!tipoServicio.equals("SUV") && !tipoServicio.equals("Pickup") &&
            !tipoServicio.equals("Carga") && !tipoServicio.equals("Otro")) {
            throw new IllegalArgumentException("Tipo de servicio inválido. Debe ser SUV, Pickup, Carga u Otro.");
        }
        if (numPasajeros > 5) {
            throw new IllegalArgumentException("El número máximo de pasajeros es 5.");
        }
        if ((tipoServicio.equals("Pickup") || tipoServicio.equals("Carga")) && numPasajeros > 2) {
            throw new IllegalArgumentException("Las camionetas Pickup y Carga solo pueden tener hasta 2 pasajeros.");
        }

        this.tipoServicio = tipoServicio;
        
        this.numPasajeros = numPasajeros;
        this.tieneRemolque = tieneRemolque;
    }

    @Override
    public double calcularImpuestoCirculacion() {
        return getPrecio() * 0.05; // 5% del precio como impuesto
    }

    @Override
    public double calcularCuotaMensual() {
        double cuota = getPrecio();

        // Aumentos según el tipo de servicio
        if (tipoServicio.equals("Pickup") || tipoServicio.equals("Carga") || tipoServicio.equals("Otro")) {
            cuota *= 1.45;  // Aumento del 45%
        } else if (tipoServicio.equals("SUV")) {
            cuota *= 1.10;  // Aumento del 10%
        }

        // Aumento adicional si hay más de 2 pasajeros
        if (numPasajeros > 2) {
            cuota *= 1.10;  // Aumento adicional del 10%
        }

        return cuota;
    }

    // Getters para integrarse con el Garaje
    public String getTipoServicio() {
        return tipoServicio;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "matricula='" + getPlaca() + '\'' +
                ", precio=" + getPrecio() +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", numPasajeros=" + numPasajeros +
                ", tieneRemolque=" + tieneRemolque +
                '}';
    }
}
