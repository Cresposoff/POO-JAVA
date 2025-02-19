package ejerciciosjavaanexo1.tdatosentradaysalida.nivelinicial;

import java.util.Scanner;

public class Ejercicio1a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int x = sc.nextInt();
        System.out.println("El doble de " + x + " es: " + (2*x));
        sc.close();
    }
}
