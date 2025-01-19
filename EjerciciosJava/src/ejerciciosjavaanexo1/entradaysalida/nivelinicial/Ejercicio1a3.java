package ejerciciosjavaanexo1.entradaysalida.nivelinicial;

import java.util.Scanner;

public class Ejercicio1a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de \"a\": ");
        int a = sc.nextInt();
        System.out.print("\nIngrese el valor de \"b\": ");
        int b = sc.nextInt();
        int x = a;
        a = b;
        System.out.println("Trocados ahora son: \nEl valor de \"a\" es: "+a);
        b = x;
        System.out.println("El valor de \"b\" es: "+b);
        sc.close();
    }
}
