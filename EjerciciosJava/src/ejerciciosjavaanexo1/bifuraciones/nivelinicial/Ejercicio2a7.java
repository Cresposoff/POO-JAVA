package ejerciciosjavaanexo1.bifuraciones.nivelinicial;

import java.util.Scanner;

public class Ejercicio2a7 {
    /*
    2.a.7. Usando switch, escribir un programa que pida por teclado un número de 1 a 10, y nos diga si es par o
impar. Si el número no esta comprendido entre 1 y 10, debe decir “Número no válido”.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10: ");
        int num = sc.nextInt();

        switch (num){
            case 2, 4, 6, 8, 10 -> System.out.println("Es par");
            case 1,3, 5, 7, 9 -> System.out.println("Es impar");
            default -> System.out.println("Número no válido");
        }
    }
}
