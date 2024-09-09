/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int cantLlan;
        double precioU;
        double precioT;
        Scanner sc = new Scanner (System.in);
        System.out.println("¡TENEMOS PROMOCIÓN EN 'PINCHADAS', DEPENDIENDO LA CANTIDAD DE LLANTAS QUE COMPRES!");  
        System.out.print("Ingrese la cantidad de llantas: ");        
        cantLlan = sc.nextInt();
        if (cantLlan<0){
            System.out.println("¡Error, no se procesan cantidades negativas!");
            
        } else if (cantLlan == 0){
            System.out.println("¡Error, debe haber almenos el valor de una (1) cantidad!");

        } else if (cantLlan<5){
            precioU = 100;
            precioT = precioU * cantLlan;
            System.out.println("El precio de cada llanta le salió por U$"+precioU+" y el total de su compra es de: $"+precioT);

        } else if (cantLlan>=5 && cantLlan<=10){
            precioU = 75;
            precioT = precioU * cantLlan;
            System.out.println("El precio de cada llanta le salió por U$"+precioU+" y el total de su compra es de: $"+precioT);

        } else {
            precioU = 50;
            precioT = precioU * cantLlan;
            System.out.println("El precio de cada llanta le salió por U$"+precioU+" y el total de su compra es de: $"+precioT);

        }

    }    
}
