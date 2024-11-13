package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

public class Camion extends Vehiculo {
    private int numeroEjes;
    private String tipoCamion; // Puede ser "Sencillo" o "Doble"
    private double capacidadCarga; // Capacidad de carga en toneladas

    public Camion(String marca, double precio, int cilindraje, String tipoCamion, int numeroEjes, double capacidadCarga) {
        super(marca, precio, cilindraje);
        this.tipoCamion = tipoCamion;
        this.numeroEjes = numeroEjes;
        this.capacidadCarga = capacidadCarga;
        calcularImpuestoCirculacion();
        calcularCuotaMensual();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        // Impuesto base del 9% del precio
        double impuesto = getPrecio() * 0.09;
        // Suma $10 por cada 5 toneladas de capacidad de carga
        impuesto += 10 * (capacidadCarga / 5);
        setImpuestoCirculacion(impuesto); // Actualiza el impuesto de circulacion
    }

    private void calcularCuotaMensual() {
        double cuotaBase = Vehiculo.CUOTA_MES_DEFAULT; // Cuota base de 100 euros mensuales
        // Incremento en la cuota mensual dependiendo del tipo de camión
        if ("Sencillo".equalsIgnoreCase(tipoCamion)) {
            cuotaBase *= 1.75; // Aumenta en un 75%
        } else if ("Doble".equalsIgnoreCase(tipoCamion)) {
            cuotaBase *= 2.25; // Aumenta en un 125%
        }
        setCuotaMesGaraje(cuotaBase);
    }

    // Getters y setters específicos de Camion
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    
}