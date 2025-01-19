package ejerciciosjavaanexo1.entradaysalida.basicos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("El señor/a " + nombre + " hace " + edad + " años que es mayor de edad ");
        sc.close();
    }
}
