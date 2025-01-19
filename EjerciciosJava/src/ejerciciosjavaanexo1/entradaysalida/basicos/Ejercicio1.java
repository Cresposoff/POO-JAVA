package ejerciciosjavaanexo1.entradaysalida.basicos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!, ¿Cómo te llamas?");
        name = sc.nextLine();
        System.out.println("buenas tardes, sr "+name);
    }

}
