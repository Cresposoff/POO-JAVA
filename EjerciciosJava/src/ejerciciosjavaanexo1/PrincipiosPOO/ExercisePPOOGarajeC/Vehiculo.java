package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGarajeC;

public class Vehiculo {
    private String placa = null;
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    private static double cuotaMesGarage = 100;

    // Constructor
    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public static double getCuotaMesGarage() {
        return cuotaMesGarage;
    }

    public static void setCuotaMesGarage(double cuotaMesGarage) {
        // No se puede indicar una cuota negativa
        if (cuotaMesGarage < 0) {
            System.out.println("Cuota negativa no permitida");
            Vehiculo.cuotaMesGarage = 0;
        }
        else {
            Vehiculo.cuotaMesGarage = cuotaMesGarage;
        }
    }

    public void calcularImpuestoCirculacion() {
        // calcular impuesto de circulacion que es el 2% importe del coche
        impuestoCirculacion = precio * 0.02;
    }

    public boolean matricular(String placa) {
        // Si la placa tiene 6 caracteres, se considera que es una matriculada
        if (placa.length() == 6) {
            return true;
        } else {
            return false;
        }
    }
}
