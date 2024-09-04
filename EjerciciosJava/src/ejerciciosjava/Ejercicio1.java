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
public class Ejercicio1 {
    
    public static void main(String[] args) {
        int cantpc;
        double preciou = 500;
        double preciot;
        double descuento;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de computadoras: ");
        cantpc = sc.nextInt();
        if (0 > cantpc){
            System.out.println("Error, no se procesan cantidades negativas");
        } else if (cantpc < 5){
            System.out.println("El descuento es de: 10%");
            descuento = (preciou * cantpc) * 0.1;
            preciot = (preciou * cantpc) - descuento;
            System.out.println("El precio total de la compra es de: $"+preciot);
        } else if ((cantpc >= 5) && (cantpc <10)){
            System.out.println("El descuento es de: 20%");
            descuento = (preciou * cantpc) * 0.2;
            preciot = (preciou * cantpc) - descuento;
            System.out.println("El precio total de la compra es de: $"+preciot);
        } else {
            System.out.println("El descuento es de: 40%");
            descuento = (preciou * cantpc) * 0.4;
            preciot = (preciou * cantpc) - descuento;
            System.out.println("El precio total de la compra es de: $"+preciot);
    }
                
    } 
}
