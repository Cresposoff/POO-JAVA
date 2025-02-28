package ejerciciosjavaanexo1.bifuraciones.nivelinicial;

import java.util.Scanner;

public class Ejercicio2a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nota: (0-10)");
        double nota = sc.nextDouble();

        if (nota > 10 || nota < 0 ){
            System.out.println("Nota inválida!!!");
        } else if (nota >= 9){
            System.out.println("Sobresaliente");
        } else if (nota >= 7){
            System.out.println("Bien");
        } else if (nota >= 6){
            System.out.println("Suficiente");
        } else System.out.println("Insuficiente");
    }
}
