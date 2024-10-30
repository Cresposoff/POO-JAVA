package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a9;

public class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public double impuestoMunicipal() {
        return calcularPrecio() * 0.05;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de plantas: " + numPlantas);
    }
}
