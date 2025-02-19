package ejerciciosjavaanexo1.tdatosentradaysalida.basicos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String num;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!, dime un número: ");
        num = sc.nextLine();
        System.out.println("el número es "+num);
    }
    
}
