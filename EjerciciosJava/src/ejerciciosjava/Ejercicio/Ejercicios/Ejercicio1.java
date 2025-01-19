/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.Ejercicio.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author u20241221018 Jhoan Montealegre
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int cantPc;
        double preciou = 500;
        double preciot;
        double descuento;
        // Me dió VSC como solución al mostrar inquietud en la variable "sc" en "Scanner
        // sc = new Scanner(System.in);".
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        // Ponemos un ciclo para volver a pedir la cantidad de pc's cuando se ingresen
        // cantidades no válidas.
        while (condition == true) {
            // Preguntamos la cantidad de pc's y la guadramos en la variable cantPc.
            System.out.print("Ingrese la cantidad ENTERA de computadoras: ");
            cantPc = sc.nextInt();
            if (0 >= cantPc) {
                // Es ilógico o innecesrio procesar números NEGATIVOS o el CERO en este
                // ejercicio.
                System.out.println("Error, no se procesan CERO ni NEGATIVAS cantidades.");
                System.out.println("Por favor, intente de nuevo.");
            } else if (cantPc < 5) {
                System.out.println("El descuento es de: 10%");
                descuento = (preciou * cantPc) * 0.1;
                preciot = (preciou * cantPc) - descuento;
                System.out.println("El precio total de la compra es de: $" + preciot);
                condition = false;
                // Se hace comprobar dos condiciones para ahorrar un "else if".
            } else if ((cantPc >= 5) && (cantPc < 10)) {
                System.out.println("El descuento es de: 20%");
                descuento = (preciou * cantPc) * 0.2;
                preciot = (preciou * cantPc) - descuento;
                System.out.println("El precio total de la compra es de: $" + preciot);
                condition = false;
                // Si no se cumplió nada de lo anterior es porque si o si la cantidad de pc's es
                // mayor o igual que diez (cantPc >= 10).
            } else {
                System.out.println("El descuento es de: 40%");
                descuento = (preciou * cantPc) * 0.4;
                preciot = (preciou * cantPc) - descuento;
                System.out.println("El precio total de la compra es de: $" + preciot);
                condition = false;
            }
        }

    }
}
