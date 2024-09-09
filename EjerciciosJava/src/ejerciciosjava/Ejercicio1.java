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
        int cantPc;
        double preciou = 500;
        double preciot;
        double descuento;
        Scanner sc = new Scanner (System.in);
        // Preguntamos la cantidad de pc's  y la guadramos en la variable cantPc
        System.out.print("Ingrese la cantidad de computadoras: ");
        cantPc = sc.nextInt();
        if (0 > cantPc){
            System.out.println("Error, no se procesan cantidades negativas");
        } else if (cantPc < 5){
            System.out.println("El descuento es de: 10%");
            descuento = (preciou * cantPc) * 0.1;
            preciot = (preciou * cantPc) - descuento;
            System.out.println("El precio total de la compra es de: $"+preciot);
        } else if ((cantPc >= 5) && (cantPc <10)){
            System.out.println("El descuento es de: 20%");
            descuento = (preciou * cantPc) * 0.2;
            preciot = (preciou * cantPc) - descuento;
            System.out.println("El precio total de la compra es de: $"+preciot);
        } else {
            System.out.println("El descuento es de: 40%");
            descuento = (preciou * cantPc) * 0.4;
            preciot = (preciou * cantPc) - descuento;
            System.out.println("El precio total de la compra es de: $"+preciot);
    }
                
    } 
}
