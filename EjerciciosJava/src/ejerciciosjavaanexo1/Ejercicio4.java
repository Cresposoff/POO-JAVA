package ejerciciosjavaanexo1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num1, num2, sum;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!, dime un primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ahora, dime un segundo número: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println(num1+" mas "+num2+" son "+sum);
    }
    
}
