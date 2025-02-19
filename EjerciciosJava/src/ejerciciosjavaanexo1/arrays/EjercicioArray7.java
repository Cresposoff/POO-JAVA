package ejerciciosjavaanexo1.arrays;

import java.util.Scanner;

public class EjercicioArray7 {
    public static void main(String[] args) {
        int [] quinceEnteros = new int[15];
        @SuppressWarnings("resource")
        // Creamos el Scanner para ingresar valores del teclado
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quinceEnteros.length; i++) {
            
            // Pedimos el valor correspondiente del elemento del Array al usuario
            // Prodíamos también sumarle 1 a la i para que no empiece desde cero osea (i+1)
            System.out.println("Ingrese el valor del elemento N°: "+i);
            // Guardamos el valor correspondiente
            quinceEnteros[i] = sc.nextInt();

        }
        
        // Imprimimos lo que guarda el Array
        System.out.println("Lo que contiene cada poscisión correspondiente del Array son: ");
        for (int i = 0; i < quinceEnteros.length; i++) {
            System.out.println(i+" -> "+quinceEnteros[i]);
        }
    }
}
