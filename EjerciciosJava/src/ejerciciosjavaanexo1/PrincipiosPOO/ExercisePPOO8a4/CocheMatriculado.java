package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a4;

/**
 * 
 * @author Cresposoff
 */

public class CocheMatriculado extends Coche {
    private int anioMatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;

    // Constructor que recibe matrícula y dniTitular, y calcula el impuesto de matriculación
    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion,
                            int anio, int anioMatriculacion, int mesMatriculacion, 
                            String matricula, String dniTitular) {
        super(marca, color, precio, factorContaminacion, anio);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        super.asignarMatricula(matricula);
        super.setDniTitular(dniTitular);
        calculaImpuestoMatriculacion();
    }

    // Método para calcular el impuesto de matriculación
    public void calculaImpuestoMatriculacion() {
        int aniosCoche = anioMatriculacion - getAnio();
        this.impuestoMatriculacion = getPrecio() / 20;
        if (aniosCoche > 10) {
            this.impuestoMatriculacion += 100; // Recargo si el coche tiene más de 10 años
        }
    }

    // Getters y Setters
    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion() {
        calculaImpuestoMatriculacion();
    }

    @Override
    public String toString() {
        return super.toString() + "\nAño de Matriculación: " + anioMatriculacion +
               "\nMes de Matriculación: " + mesMatriculacion +
               "\nImpuesto de Matriculación: " + impuestoMatriculacion;
    }
}
