package ejerciciosjava.Ejercicio;

import java.lang.reflect.Constructor;

public class CuentaCorriente {
    //Aquí haré una subclase de cuenta con los siguientes datos: (Atributos privados, double maximoRetirable : entero), (Y los siguientes métodos: Constructor completo (con todos los atributos), Métodos de acceso para su atributo, Metodo toString())
    private double maximoRetirable;
    private int numeroCuenta;
    private Persona cliente;

    public CuentaCorriente(int numeroCuenta, Persona cliente, double maximoRetirable) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.maximoRetirable = maximoRetirable;
    }
    
    //Constructor
    public CuentaCorriente(int numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.maximoRetirable = 0;
    }    

    //Métodos de acceso
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }    

    public Persona getCliente() {
        return cliente;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", maximoRetirable=" + maximoRetirable + ", cliente=" + cliente + "]";
    }

    //Al retirar dinero hay que tener en cuenta que el importe a retirar debe ser menor o igual que maximoRetirable, y mayor que 0.
    public void retirar(double importe) {
        if (importe >= 0) {
            if (importe <= maximoRetirable) {
                maximoRetirable = maximoRetirable - importe;
            } else {
                System.out.println("No hay suficiente saldo");
            }
        } else {
            System.out.println("El importe no puede ser negativo");
        }
    }
}
