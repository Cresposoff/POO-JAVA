package ejerciciosjavaanexo1.tdatosentradaysalida.nivelalto;

import java.util.Scanner;

public class Ejercicio1c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de 4 cifras: ");
        int x = sc.nextInt();
        int a1 = x / 1000;
        int a2 = (x - (a1 * 1000)) / 100;
        int a3 = (x - (a1 * 1000) - (a2 * 100)) / 10;
        int a4 = x - (a1 * 1000) - (a2 * 100) - (a3 * 10);
        System.out.println("El número de 4 cifras invertido es: " + a4 + a3 + a2 + a1);
    }
}
