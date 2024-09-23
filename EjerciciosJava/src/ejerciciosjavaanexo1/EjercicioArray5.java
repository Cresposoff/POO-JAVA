package ejerciciosjavaanexo1;

import java.util.Random;
public class EjercicioArray5 {
    public static void main(String[] args) {
        Random azar = new Random();
        int[] quinceEnteros = new int[15];
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < quinceEnteros.length; i++) {
            quinceEnteros[i] = azar.nextInt(15)+1;
            System.out.println(quinceEnteros[i]);
            
            if (quinceEnteros[i] > mayor) {
                mayor = quinceEnteros[i];
            }

            if (quinceEnteros[i] < menor) {
                menor = quinceEnteros[i];
            }
        }
        System.out.println("El mayor es: "+mayor+" y el menor es: "+menor);
    }
}
