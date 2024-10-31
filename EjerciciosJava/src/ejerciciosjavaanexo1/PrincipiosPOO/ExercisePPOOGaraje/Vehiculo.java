package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

public class Vehiculo {
    private String placa = null;
    private String marca;
    protected double precio;
    protected int cilindraje;
    protected double impuestoCirculacion;
    public static double cuotaMesGarage = 100;
    
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

    public double getCuotaMesGarage() {
        return cuotaMesGarage;
    }

    // Setter de cuotaMesGarage, con verificación para evitar valores negativos
    public void setCuotaMesGarage(double cuotaMesGarage) {
        // No se permiten cuotas negativas
        Vehiculo.cuotaMesGarage = cuotaMesGarage < 0 ? 0 : cuotaMesGarage;
    }

    public void calcularImpuestoCirculacion() {
        // calcular impuesto de circulacion que es el 2% importe del coche
        impuestoCirculacion = precio * 0.02;
    }

    public boolean matricular() {
        //Siempre que la placa tenga 6 caracteres, se considera que es una matriculada
        if (placa.length() == 6) {
            return true;
        } else {
            return false;
        }
    }

    
}
