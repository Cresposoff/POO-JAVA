package ejerciciosjavaanexo1.tdatosentradaysalida.nivelinicial;

import java.util.Scanner;

public class Ejercicio1a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Ingrese el valor de temperatura en Celsius: " );
        double celsius = sc.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit");
        sc.close();
    }
}
