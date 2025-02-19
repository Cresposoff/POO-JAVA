package ejerciciosjavaanexo1.tdatosentradaysalida.nivelinicial;

import java.util.Scanner;

public class Ejercicio1a2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio de un círculo: ");
        int radio = entrada.nextInt();
        final double PI = 3.14159;
        double longitud = PI * 2 * radio;
        System.out.println("El área del círculo es: "+longitud);
        entrada.close();
    }
}
