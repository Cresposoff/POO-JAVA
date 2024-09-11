package ejerciciosjava;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double capital;
        double saldo;
        double prestamo;
        Scanner sc = new Scanner(System.in)
        System.out.println("Ingrese el valor del saldo: U$");
        saldo = sc.nextDouble();
        if (saldo < 0) {
            System.out.println("Se pedirá un préstamo para que halla un saldo de U$10.000");
            saldo = prestamo - 10000;

        }

    }
}
