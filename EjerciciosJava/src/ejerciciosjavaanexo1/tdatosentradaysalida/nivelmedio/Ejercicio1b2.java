package ejerciciosjavaanexo1.tdatosentradaysalida.nivelmedio;

import java.util.Scanner;

public class Ejercicio1b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el un número por teclado: ");
        int x = sc.nextInt();
        // si se desea la misma letra en minúscula se le suma 32 a la x
        char letra = (char) x;
        System.out.println("es una "+ letra);
    }
}