package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a3;

/**
 * 
 * @author Cresposoff
 */

public class CuentaAhorro extends Cuenta {
    private double saldoMinimo;

    // Constructor parametrizado
    public CuentaAhorro(Persona cliente, long numeroCuenta, double saldoMinimo) {
        super(cliente, numeroCuenta);
        this.saldoMinimo = saldoMinimo;
    }

    // Getters y Setters
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    // Implementación del método retirar
    @Override
    public void retirar(double x) {
        if (x > 0 && (getSaldo() - x >= saldoMinimo)) {
            setSaldo(getSaldo() - x);
        } else {
            System.out.println("Error: No se puede retirar el monto debido a que se superaría el saldo mínimo permitido.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nSaldo Mínimo: " + saldoMinimo;
    }
}
