package ejerciciosjavaanexo1.bifuraciones.nivelinicial;

import java.util.Scanner;

public class Ejercicio2a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double num1 = sc.nextDouble();
        System.out.print("\nIngrese otro número: ");
        double num2 = sc.nextDouble();

        if (num2 > num1){
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
