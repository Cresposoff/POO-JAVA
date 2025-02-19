package ejerciciosjavaanexo1.arrays;

import java.util.Random;

public class EjercicioArray10 {
    public static void main(String[] args) {
        Random alea = new Random();
        double [] array = new double[alea.nextInt(10)+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = alea.nextDouble();

            if (i == 0) {
                System.out.println("El primer elemento es: "+array[0]);
                
            } else if (i == (array.length-1)) {
                System.out.println("El último elemento es: "+array[(array.length-1)]);
            }
            
        }
    }
}
