package ejerciciosjava.Ejercicio.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author u20241221018 Jhoan Montealegre
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double saldo;
        // Mi editor de texto me pidió inicializarlas
        double saldoNuevo = 0;
        double prestamo = 0;
        double insumosEIncentivos;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el saldo de la capital (valor negativo si hay deudas): U$");
        saldo = sc.nextDouble();
        if (saldo < 0) {
            System.out.println("Se pedirá un préstamo para que halla un saldo de U$10.000.");
            prestamo = 10000 - saldo;
            saldoNuevo = saldo + prestamo;
            System.out.println("Osea que en este caso el prestamo será de: U$"+prestamo+".");
            System.out.println("Ya que "+saldo+" + "+prestamo+" = U$"+saldoNuevo+".");
            
        } // En el ejercicio no decía que se haría si el saldo era de cero, por lo tanto supuse que sería el presto para tener U$20.000 de saldo
        else if (saldo >= 0 && saldo <= 20000) {
            System.out.println("Se pedirá un préstamo para que halla un saldo de U$20.000");
            prestamo = 20000 - saldo;
            saldoNuevo = saldo + prestamo;
            System.out.println("Osea que en este caso el prestamo será de: U$"+prestamo+".");
            System.out.println("Ya que "+saldo+" + "+prestamo+" = U$"+saldoNuevo+".");

        } else {
            System.out.println("NO se pedirá mingún préstamo porque hay más de U$20.000 de saldo.");
            saldoNuevo = saldo;
        }

        System.out.println("Equipo de computo: U$5.000");
        System.out.println("Mobiliario: U$2.000");
        insumosEIncentivos = (saldoNuevo - (5000 + 2000))/2;
        System.out.println("Insumos: U$"+insumosEIncentivos);
        System.out.println("Incentivos al personal: U$"+insumosEIncentivos);

    }
}
