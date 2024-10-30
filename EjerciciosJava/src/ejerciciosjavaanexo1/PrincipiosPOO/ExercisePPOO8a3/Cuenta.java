package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a3;

public abstract class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    // Constructor parametrizado
    public Cuenta(Persona cliente, long numeroCuenta) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;  // Saldo inicial en 0
    }

    // Getters y Setters
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    // Método para ingresar dinero
    public void ingresar(double x) {
        if (x > 0) {
            saldo += x;
        }
    }

    // Método abstracto para retirar dinero
    public abstract void retirar(double x);

    @Override
    public String toString() {
        return "Número de Cuenta: " + numeroCuenta + "\nSaldo: " + saldo + "\nCliente: " + cliente;
    }
}
