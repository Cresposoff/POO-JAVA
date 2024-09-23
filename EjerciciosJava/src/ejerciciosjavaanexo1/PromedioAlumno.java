package ejerciciosjavaanexo1;

import java.util.Scanner;

public class PromedioAlumno {
    public static void main(String[] args) {
        double tabla [][] = new double[4][4];
        Scanner sc = new Scanner(System.in);
        double suma = 0.0;
        //Recargamos la matriz
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla.length - 1; c++) {
                System.out.println("Ingrese la nota "+(c+1)+" del alumno "+(f+1));
                tabla[f][c] = sc.nextDouble();
                suma = suma + tabla[f][c];
                
            }
            tabla[f][3] = suma / 3;
            suma = 0.0;
        }
        //recorrer la matriz
        for (int f = 0; f < tabla.length; f++) {
            System.out.println("Nota del alumno: "+(f+1));

            for (int c = 0; c < tabla.length - 1; c++) {
                System.out.println("la nota número: "+(c+1)+" : "+tabla[f][c]);
            }
            System.out.println("El promedio de las notas es: "+tabla[f][3]);
        }
    }
}
