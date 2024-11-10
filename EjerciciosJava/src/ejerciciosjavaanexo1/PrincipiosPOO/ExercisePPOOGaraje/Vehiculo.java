package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 * public class Vehiculo {
    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    private double cuotaMesGaraje;

    public static final double CUOTA_MES_DEFAULT = 100.0;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.placa = null; // Valor inicial de placa es null
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CUOTA_MES_DEFAULT;
        calcularImpuestoCirculacion();
    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
    }

    public boolean matricular(String placa) {
        if (placa != null && placa.length() == 6) {
            this.placa = placa;
            return true;
        }
        return false;
    }

    // Getters y Setters

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        if (impuestoCirculacion >= 0) {
            this.impuestoCirculacion = impuestoCirculacion;
        }
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;

    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;

        }
    }
}
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    private double cuotaMesGaraje;

    public static final double CUOTA_MES_DEFAULT = 100.0;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.placa = null; // Valor inicial de placa es null
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CUOTA_MES_DEFAULT;
        calcularImpuestoCirculacion();
    }

    public double calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
    }

    public boolean matricular(String placa) {
        if (placa != null && placa.length() == 6) {
            this.placa = placa;
            return true;
        }
        return false;
    }

    // Getters y Setters

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        if (impuestoCirculacion >= 0) {
            this.impuestoCirculacion = impuestoCirculacion;
        }
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;

    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;

        }
    }
}