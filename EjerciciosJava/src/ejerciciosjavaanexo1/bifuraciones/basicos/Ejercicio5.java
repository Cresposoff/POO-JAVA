package ejerciciosjavaanexo1.bifuraciones.basicos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese un tercer número: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("todos los valores son iguales");
        } else {
            System.out.println("No todos los valores son iguales");
        }
        sc.close();
    }
}
