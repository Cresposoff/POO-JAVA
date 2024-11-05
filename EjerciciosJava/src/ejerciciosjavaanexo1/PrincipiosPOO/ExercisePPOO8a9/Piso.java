package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a9;

/**
 * 
 * @author Cresposoff
 */

public class Piso extends Vivienda {
    private int planta;
    private int puerta;

    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public double impuestoMunicipal() {
        return calcularPrecio() * 0.05;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Planta: " + planta);
        System.out.println("Puerta: " + puerta);
    }
}
