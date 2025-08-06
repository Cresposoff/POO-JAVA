package ejerciciosjavaanexo1.bifuraciones.nivelinicial;

import java.util.Scanner;

public class Ejercicio2a6 {
    /* Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o
buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora: ");
        int hora = sc.nextInt();
        String mensaje = "";
        switch (hora){
            case 1, 2, 3, 4, 5, 21, 22, 23, 24, 0 -> mensaje = "buenas noches";
            case 6, 7, 8, 9, 10, 11, 12 -> mensaje = "buenos dias";
            case 13, 14, 15, 16, 17, 18, 19, 20 -> mensaje = "buenas tardes";
        }

        System.out.println("Hola, " + mensaje);

        sc.close();
    }
}
