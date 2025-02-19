package ejerciciosjavaanexo1.tdatosentradaysalida.basicos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String num1, num2;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!, dime un primer número: ");
        num1 = sc.nextLine();
        System.out.println("Ahora, dime un segundo número: ");
        num2 = sc.nextLine();
        System.out.println("el número son "+num1+" y "+num2);
    }
}
