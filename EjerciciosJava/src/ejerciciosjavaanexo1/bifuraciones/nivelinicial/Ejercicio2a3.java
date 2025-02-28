package ejerciciosjavaanexo1.bifuraciones.nivelinicial;

import java.util.Scanner;

public class Ejercicio2a3 {
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
        if (anio < 2001 || anio > 2100) System.out.println("Fecha incorrecta: Año fuera de rango (2001 - 2100).");
        else if (mes < 1 || mes > 12) System.out.println("Fecha incorrecta: Mes fuera de rango (1 - 12).");
        else if (dia < 1 || dia > 30) System.out.println("Fecha incorrecta: Día fuera de rango (1 - 30).");
        else System.out.println("Fecha correcta.");
    }
}