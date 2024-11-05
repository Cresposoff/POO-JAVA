package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a9;

/**
 * 
 * @author Cresposoff
 */

public class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return superficieEnMetros * 1300;
    }

    @Override
    public double impuestoMunicipal() {
        double impuesto = calcularPrecio() * 0.05;
        if (conPiscina) {
            impuesto += 200;
        }
        return impuesto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de parcela: " + numParcela);
        System.out.println("Con piscina: " + (conPiscina ? "Sí" : "No"));
    }
}
