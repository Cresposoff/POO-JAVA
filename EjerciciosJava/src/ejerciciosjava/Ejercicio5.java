package ejerciciosjava;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double capital;
        double saldo;
        double saldoNuevo;
        double prestamo;
        Scanner sc = new Scanner(System.in)
        System.out.println("Ingrese el valor del saldo: U$");
        saldo = sc.nextDouble();
        if (saldo < 0) {
            System.out.println("Se pedirá un préstamo para que halla un saldo de U$10.000.");
            prestamo = 10000 - saldo;
            saldoNuevo = saldo + prestamo;
            System.out.println("Osea que en este caso el prestamo será de: U$"+prestamo+".");
            System.out.println("Ya que "+saldo+" + "+prestamo+" = U$"+saldoNuevo+".");
            
        } else if (saldo > 0 && saldo <= 20000) {
            System.out.println("Se pedirá un préstamo para que halla un saldo de U$20.000");
            saldo = 20000 - prestamo;

        } else {
            System.out.println("NO se pedirá mimgún préstamo");
            saldo = 20000 - prestamo;

        }

    }
}
