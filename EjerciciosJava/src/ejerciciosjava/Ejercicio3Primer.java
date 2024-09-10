package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author u20241221018 Jhoan Montealegre
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        double precioApa;
        double precioApaConIva;
        int marcaApa;
        boolean nosy;
        double iva = 0.19;
        double descIva;
        double descDelDiez;
        double precioFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("PROVEEDOR DE REPRODUCTORES DE MÚSICA");
        System.out.println("Ingrese el precio del aparato: U$");
        precioApa = sc.nextInt();

        System.out.println("¿La marca del aparato es NOSY?");
        System.out.println("0. No");
        System.out.println("1. sí");
        marcaApa = sc.nextInt();
        //recordatorio de hacerlo en 3 partes
        if (precioApa <= 0)  {
            System.out.println("¡Error, no se procesan precios NEGATIVOS o GRATIS!");

        }  else if (precioApa < 500 ) {
            if (marcaApa == 1)
            System.out.println("solo hay descuento del 5% por ser marca 'NOSY'.");
            descIva = iva * precioApa;
            precioApaConIva = descIva + precioApa;
            System.out.println("El precio final con el descuento del 5% por ser marca 'NOSY' es de: u$"+pre);
        } else {
            System.out.println("Hay un descuento del 10% agregado al aparato sin IVA.");
            descDelDiez = precioApa * 0.1;
            descIva = iva * precioApa;
            precioFinal = (precioApa - descDelDiez) + descIva;
            System.out.println("El precio final a pagar con el descuento del 10% al precio del aparato sin IVA, más el IVA incluido, y más el 5% de descuento por ser marca 'NOSY'; es de: U$"+precioFinal);
        }

        
    }
}
