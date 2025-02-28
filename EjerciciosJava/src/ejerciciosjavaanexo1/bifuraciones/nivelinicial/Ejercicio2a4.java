package ejerciciosjavaanexo1.bifuraciones.nivelinicial;

import java.util.Scanner;

public class Ejercicio2a4 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese un número entero para el día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese un número entero para el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese un número entero para el año: ");
        int anio = sc.nextInt();

        // Cerrar scanner para evitar fugas de memoria
        sc.close();

        // Validaciones
        // Validación del mes
        int dias = 0;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> dias = 31;
            case 4, 6, 9, 11 -> dias = 30;
            case 2 -> dias = 28;
            default -> {
                System.out.println("Fecha incorrecta: Mes fuera de rango (1 - 12).");
                return; // Evita que el programa siga ejecutándose, sin esto 'dias' puede irse con valor de 0
            }
        }
        //Validación de año
        if (anio < 2001 || anio>2100) System.out.println("Fecha incorrecta: Año fuera de rango (2001 - 2100).");
        //validación del día
        else if (dia < 1 || dia > dias) System.out.println("Fecha incorrecta: Día fuera de rango.");
        else System.out.println("Fecha correcta.");
    }
}