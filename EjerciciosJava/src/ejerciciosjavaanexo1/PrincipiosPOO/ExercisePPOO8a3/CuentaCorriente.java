package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a3;

public class CuentaCorriente extends Cuenta {
    private double maximoRetirable;

    // Constructor completo con todos los atributos
    public CuentaCorriente(Persona cliente, long numeroCuenta, double maximoRetirable) {
        super(cliente, numeroCuenta);
        this.maximoRetirable = maximoRetirable;
    }

    // Getters y Setters
    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    // Implementación del método retirar
    @Override
    public void retirar(double x) {
        if (x > 0 && x <= maximoRetirable && x <= getSaldo()) {
            setSaldo(getSaldo() - x);
        } else {
            System.out.println("Error: Monto a retirar supera el límite permitido o el saldo disponible.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMáximo Retirable: " + maximoRetirable;
    }
}
