package ejerciciosjava.Parqueaderos.vehicles;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private String tipoCamion;
    private double capacidadCarga;

    public Camion(String marca, double precio, int cilindraje, int numeroEjes, String tipoCamion, double capacidadCarga) {
        super(marca, precio, cilindraje);
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;

        if (tipoCamion.equalsIgnoreCase("Sencillo")) {
            this.cuotaMesGaraje *= 1.75;
        } else if (tipoCamion.equalsIgnoreCase("Doble")) {
            this.cuotaMesGaraje *= 2.25;
        }
        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.09 + (10 * (int) (this.capacidadCarga / 5));
    }
}