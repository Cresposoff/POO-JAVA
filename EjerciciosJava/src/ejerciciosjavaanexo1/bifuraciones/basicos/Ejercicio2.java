package ejerciciosjavaanexo1.bifuraciones.basicos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();
        if ((num % 2) == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        sc.close();
    }
}
