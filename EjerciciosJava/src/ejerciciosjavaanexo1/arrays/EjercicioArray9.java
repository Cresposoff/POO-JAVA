package ejerciciosjavaanexo1.arrays;

import java.util.Scanner;

public class EjercicioArray9 {
    public static void main(String[] args) {
        int [] quinceEnteros = new int[15];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < quinceEnteros.length; i++) {
            
            System.out.println("Ingrese el valor del elemento N°: "+i);
            quinceEnteros[i] = sc.nextInt();
            
        }

        System.out.println("Los multiplos de 3 son: ");

        for (int i = 0; i < quinceEnteros.length; i++) {

            if (quinceEnteros[i] % 3 == 0) {
                System.out.println(quinceEnteros[i]);
            }

        }

        System.out.println("Los multiplos de 5 son: ");

        for (int i = 0; i < quinceEnteros.length; i++) {

            if (quinceEnteros[i] % 5 == 0) {
                System.out.println(quinceEnteros[i]);
            }
        }
    }
}
