package ejerciciosjavaanexo1.entradaysalida.basicos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int age;
        String name;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!, dame tu nombre: ");
        name = sc.nextLine();
        System.out.println("Ahora, dame tu edad: ");
        age = sc.nextInt();
        System.out.println("me llamo "+name+" y tengo "+age+" años");
    }
}
