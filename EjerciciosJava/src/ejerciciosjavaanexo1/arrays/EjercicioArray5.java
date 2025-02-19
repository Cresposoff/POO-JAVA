package ejerciciosjavaanexo1.arrays;

import java.util.Random;
public class EjercicioArray5 {
    public static void main(String[] args) {
        Random azar = new Random();
        int[] quinceEnteros = new int[15];
        //para almacenar las actualizaciónes cada vez que haya un nuevo número mayor
        int mayor = 0;
        for (int i = 0; i < quinceEnteros.length; i++) {
            quinceEnteros[i] = azar.nextInt();
            System.out.println(quinceEnteros[i]);
            
            // Comparamos si num (quinceEnteros[i]) es mayor que el número mayor hasta el momento 
            // y de ser así, entonces ese será el nuevo número mayor
            if (quinceEnteros[i] > mayor) {
                mayor = quinceEnteros[i];
            }

        }
        System.out.println("El mayor es: "+mayor);
    }
}
