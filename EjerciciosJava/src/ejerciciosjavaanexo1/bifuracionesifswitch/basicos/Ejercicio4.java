package ejerciciosjavaanexo1.bifuracionesifswitch.basicos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("son iguales");
        } else {
            System.out.println("No son iguales");
        }
        sc.close();
    }
}
