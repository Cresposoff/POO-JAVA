package ejerciciosjavaanexo1;

import java.util.Scanner;

public class EjercicioArray4a2 {
    public static void main(String[] args){
        int sumaPar = 0;
        int sumaImpar = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int [] miArray = new int[4];

        //almacenamos en el array los 10 valores que ingresa el usuario por teclado
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Ingrese el valor del elemento número "+(i+1)+":");
            miArray[i] = sc.nextInt();

            if (miArray[i] % 2 == 0) {
                sumaPar = sumaPar + miArray[i];

            } else {
                sumaImpar = sumaImpar + miArray[i];
            }
            
        }

        if (sumaPar < sumaImpar) {
            System.out.println("La suma mayor es la de los IMPARES");
        } else{
            System.out.println("la suma mayor es la de los PARES");
        }
    }
}
