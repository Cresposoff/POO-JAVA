package ejerciciosjavaanexo1.arrays;

import java.util.Random;

public class EjercicioArray6 {
    public static void main(String[] args) {
        Random alea = new Random();
        // Hice que el número de elementos tuviera una poca cantidad (de 1 a 10 elementos)  
        // a diferencia de toda la cantidad que puede escoger la función Random
        int [] arrayCantidadAleatoria = new int[alea.nextInt(10)+1];
        for (int i = 0; i < arrayCantidadAleatoria.length; i++) {
            arrayCantidadAleatoria[i] = alea.nextInt();
            System.out.println(arrayCantidadAleatoria[i]);
        }
        // Quice imprimir la cantidad de elementos del Array solo para verificar,
        // en el ejercicio no me lo pedía pero lo agregué
        System.out.println(arrayCantidadAleatoria.length);
    }
}
