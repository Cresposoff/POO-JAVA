/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author u20241221018 Jhoan Montealegre
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int cantLlan;
        double precioT;
        // Me dió VSC como solución al mostrar inquietud en la variable "sc" en "Scanner
        // sc = new Scanner(System.in);".
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // Contextualizamos el usuario.
        System.out.println("¡TENEMOS PROMOCIÓN EN 'PINCHADAS', DEPENDIENDO LA CANTIDAD DE LLANTAS QUE COMPRES!");
        // Utilizamos un Arreglo para hacer del cógigo uno más optimizado.
        int vector1[] = { 100, 75, 50 };
        boolean condition = true;
        // Ponemos un ciclo para volver a pedir la cantidad de llantas cuando se
        // ingresen cantidades no válidas.
        while (condition == true) {
            System.out.print("Ingrese la cantidad ENTERA de llantas: ");
            cantLlan = sc.nextInt();
            if (cantLlan < 0) {
                // Que no procese cantidades negativas para limitar al usuario a ponerse de
                // curioso.
                System.out.println("¡Error, no se procesan cantidades negativas!");

            } else if (cantLlan == 0) {
                // Que tampoco se ponga de chistoso con una cantidad CERO
                System.out.println("¡Error, debe haber almenos el valor de una (1) cantidad!");

            } else if (cantLlan < 5) {
                precioT = vector1[0] * cantLlan;
                System.out.println("El precio de cada llanta le salió por U$" + vector1[0]
                        + " y el total de su compra es de: $" + precioT);
                condition = false;
                // Se hace comprobar dos condiciones para ahorrar un "else if".
            } else if (cantLlan >= 5 && cantLlan <= 10) {
                precioT = vector1[1] * cantLlan;
                System.out.println("El precio de cada llanta le salió por U$" + vector1[1]
                        + " y el total de su compra es de: $" + precioT);
                condition = false;
                // Si no se cumplió nada de lo anterior es porque si o si la cantidad de llantas
                // es mayor que diez (cantPc > 10).
            } else {
                precioT = vector1[2] * cantLlan;
                System.out.println("El precio de cada llanta le salió por U$" + vector1[2]
                        + " y el total de su compra es de: $" + precioT);
                condition = false;
            }
        }

    }
}
