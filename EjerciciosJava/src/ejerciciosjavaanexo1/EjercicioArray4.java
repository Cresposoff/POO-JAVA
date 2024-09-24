package ejerciciosjavaanexo1;

import java.util.Random;

public class EjercicioArray4 {
    public static void main(String[] args) {
        Random azar = new Random();
        int[] quinceEnteros = new int[15];
        for (int i = 0; i < quinceEnteros.length; i++) {
            // Con Math.random - int alea =(int) (Math.random()*15+1);
            // Aun no sé como hacer que tome cualquier valor con Math.ramdom, si no pongo nada multiplicando los parentesis dará siempre cero (0)
            quinceEnteros[i] = azar.nextInt();
            // Imprimimos los 15 números enteros aleatorios
            System.out.println(quinceEnteros[i]);
        }
    }
}
