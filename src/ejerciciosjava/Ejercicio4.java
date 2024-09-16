package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        double precioUnKilo;
        int cantidadKilo;
        double descuento;
        double precioFinal;
        double vector1[] = {0, 10, 15, 20};
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("¡EN LA FRUTERÍA HAY DESCUENTO DE MANZANAS SEGUN LOS KILOS!");
        System.out.print("Ingrese el precio del Kilo de manzanas: U$");
        precioUnKilo = sc.nextDouble();
        System.out.println("Ingrese cantidad de Kilos: ");
        cantidadKilo = sc.nextInt();

        if (cantidadKilo < 0 || precioUnKilo < 0) {
            System.out.println("¡Error, no se procesan cantidades NEGATIVAS!");

        } else if (cantidadKilo >= 0 && cantidadKilo <= 2) {
            descuento = (precioUnKilo * cantidadKilo) * (vector1[0] / 100);
            precioFinal = (precioUnKilo * cantidadKilo) - descuento;
            System.out.println("Hay un descueno del "+vector1[0]+"% Debe pagar: U$"+precioFinal);

        } else if (cantidadKilo >= 2.01 && cantidadKilo <= 5) {
            descuento = (precioUnKilo * cantidadKilo) * (vector1[1]) / 100;
            precioFinal = (precioUnKilo * cantidadKilo) - descuento;
            System.out.println("Hay un descueno del "+vector1[1]+"% Debe pagar: U$"+precioFinal);

        } else if (cantidadKilo >= 5.01 && cantidadKilo <= 10) {
            descuento = (precioUnKilo * cantidadKilo) * (vector1[2]) / 100;
            precioFinal = (precioUnKilo * cantidadKilo) - descuento;
            System.out.println("Hay un descueno del "+vector1[2]+"% Debe pagar: U$"+precioFinal);

        } else if (cantidadKilo >= 10.01) {
            descuento = (precioUnKilo * cantidadKilo) * (vector1[3]) / 100;
            precioFinal = (precioUnKilo * cantidadKilo) - descuento;
            System.out.println("Hay un descueno del "+vector1[3]+"% Debe pagar: U$"+precioFinal);

        }

    }
}
/*Pendiente:
 * Agregar comentarios.
 * Agregar while para volver a preguntar.
 * Mirar compatibilidad de tipos de datos.
 */