package ejerciciosjavaanexo1;

import java.util.Scanner;

public class EjercicioArray8 {
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
        
        // Imprimimos los valores pares que guarda el Array
        System.out.println("Los números pares que contienen el Array con su poscisión correspondiente son: ");
        for (int i = 0; i < quinceEnteros.length; i++) {
            if (quinceEnteros[i] % 2 == 0) {
                System.out.println(i+" -> "+quinceEnteros[i]);
            }
        }
    }
}
