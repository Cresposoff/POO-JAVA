package ejerciciosjava.Ejercicio;

public class Cuenta {
    private int numerocuenta;
    private double saldo;
    private Persona Cliente;

    public Cuenta(int numerocuenta, Persona cliente) {
        this.numerocuenta = numerocuenta;
        Cliente = cliente;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return Cliente;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persona cliente) {
        Cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta [numerocuenta=" + numerocuenta + ", saldo=" + saldo + ", Cliente=" + Cliente + "]";
    }

    public void ingresar(double importe) {
        if (importe >= 0) {
            saldo = saldo + importe;
        } else {
            System.out.println("El importe no puede ser negativo");
        }
    }
    public void retirar(double importe) {
        if (importe >= 0) {
            if (importe <= saldo) {
                saldo = saldo - importe;
            } else {
                System.out.println("No hay suficiente saldo");
            }
        } else {
            System.out.println("El importe no puede ser negativo");
        }
    }
    
}
