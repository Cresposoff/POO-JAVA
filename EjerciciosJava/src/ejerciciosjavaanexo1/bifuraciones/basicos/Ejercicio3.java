package ejerciciosjavaanexo1.bifuraciones.basicos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();
        if ((num % 5) == 0) {
            System.out.println("El número es múltiplo de 5");
        } else {
            System.out.println("El número NO es múltiplo de 5");
        }
        sc.close();
    }
}
