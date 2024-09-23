package ejerciciosjavaanexo1;

import java.util.Scanner;

public class EjercicioFormula1 {
    public static void main(String[] args) {
        
        double tiempos [][] = new double[5][5];
        Scanner sc = new Scanner(System.in);
        // Recargar la matriz con los tiempos de cada piloto
        for (int f = 0; f < tiempos.length; f++) {
            for (int c = 0; c < tiempos.length; c++) {
                System.out.println("Ingrese el tiempo del piloto "+(f+1)+" en la etapa "+(c+1));
                tiempos[f][c] = sc.nextDouble();
            }
        }
    }
}