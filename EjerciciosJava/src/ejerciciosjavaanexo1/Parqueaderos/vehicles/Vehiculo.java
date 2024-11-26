package ejerciciosjavaanexo1.Parqueaderos.vehicles;

public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected double precio;
    protected int cilindraje;
    protected double impuestoCirculacion;
    protected double cuotaMesGaraje;
    public static final double CUOTA_BASE = 100.0;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.placa = null;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CUOTA_BASE;
        calcularImpuestoCirculacion();
    }

    public void setCuotaMesGaraje(double cuota) {
        if (cuota > 0) {
            this.cuotaMesGaraje = cuota;
        }
    }

    public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            this.placa = matricula;
            return true;
        }
        return false;
    }

    public abstract void calcularImpuestoCirculacion();

    public String getPlaca() {
        return placa;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
