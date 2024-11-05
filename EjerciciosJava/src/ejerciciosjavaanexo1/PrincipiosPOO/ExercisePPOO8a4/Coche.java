package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a4;

/**
 * 
 * @author Cresposoff
 */

public class Coche {
    private final String marca;
    private String color;
    private int km;
    private double precio;
    private final double factorContaminacion;
    private final int anio;
    private String matricula;
    private String dniTitular;

    // Constructor con parámetros
    public Coche(String marca, String color, double precio, double factorContaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.km = 0; // Kilometraje inicial
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public double getPrecio() {
        return precio;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    // Setters para color, precio y dniTitular
    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    // Método para asignar matrícula solo una vez
    public void asignarMatricula(String matricula) {
        if (this.matricula == null) {
            this.matricula = matricula;
        } else {
            System.out.println("La matrícula ya ha sido asignada y no puede ser cambiada.");
        }
    }

    // Método para incrementar el kilometraje
    public void incrementarKm(int km) {
        if (km > 0) {
            this.km += km;
        }
    }

    // Método para cambiar el dniTitular si ambos coches tienen dniTitular asignado
    public void comprarCoche(Coche otroCoche) {
        if (this.dniTitular != null && otroCoche.dniTitular != null) {
            this.dniTitular = otroCoche.dniTitular;
        } else {
            System.out.println("Ambos coches deben tener un DNI de titular asignado.");
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nColor: " + color + "\nKilómetros: " + km +
               "\nPrecio: " + precio + "\nFactor de Contaminación: " + factorContaminacion +
               "\nAño: " + anio + "\nMatrícula: " + (matricula != null ? matricula : "No asignada") +
               "\nDNI Titular: " + (dniTitular != null ? dniTitular : "No asignado");
    }
}
