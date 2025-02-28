package ejerciciosjavaanexo1.bifuraciones.basicos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dia de nacimiento: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese mes de nacimiento: (1-12)");
        int mes = sc.nextInt();

        sc.close();

        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio");
        } else if (mes == 1 || mes == 2 && dia <= 18) {
            System.out.println("Acuario");
        } else if (mes == 2 || mes == 3 && dia <= 20) {
            System.out.println("Piscis");
        } else if (mes == 3 || mes == 4 && dia <= 19) {
            System.out.println("Aries");
        } else if (mes == 4 || mes == 5 && dia <= 20) {
            System.out.println("Tauro");
        } else if (mes == 5 || mes == 6 && dia <= 20) {
            System.out.println("Géminis");
        } else if (mes == 6 || mes == 7 && dia <= 22) {
            System.out.println("Cáncer");
        } else if (mes == 7 || mes == 8 && dia <= 22) {
            System.out.println("Leo");
        } else if (mes == 8 || mes == 9 && dia <= 22) {
            System.out.println("Virgo");
        } else if (mes == 9 || mes == 10 && dia <= 22) {
            System.out.println("Libra");
        } else if (mes == 10 || mes == 11 && dia <= 21) {
            System.out.println("Escorpio");
        } else if (mes == 11 || mes == 12) {
            System.out.println("Sagitario");
        } else {
            System.out.println("Fecha inválida!");
        }

        /* Código optimizado con AI
        // Definimos los nombres de los signos zodiacales
        String[] signos = {
            "Capricornio", "Acuario", "Piscis", "Aries", "Tauro", "Géminis",
            "Cáncer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario", "Capricornio"
        };

        // Fechas límites para cada signo
        int[] diasLimite = {19, 18, 20, 19, 20, 20, 22, 22, 22, 22, 21, 21};

        // Determinar el signo
        String signo = (dia > diasLimite[mes - 1]) ? signos[mes] : signos[mes - 1];

        System.out.println("Su signo zodiacal es: " + signo);
         */
    }
}