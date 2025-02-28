package ejerciciosjavaanexo1.bifuraciones.basicos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean incorrecto = true;
        int dia = 0;
        do {
            System.out.println("Ingrese un número: (1 - 7)");
            dia = sc.nextInt();
            switch (dia){
                case 1 -> System.out.println(dia + " : Lunes");
                case 2 -> System.out.println(dia + " : Martes");
                case 3 -> System.out.println(dia + " : Miercoles");
                case 4 -> System.out.println(dia + " : Jueves");
                case 5 -> System.out.println(dia + " : Viernes");
                case 6 -> System.out.println(dia + " : Sábado");
                case 7 -> System.out.println(dia + " : Domingo");
                default -> System.out.println("ERROR: valor no válido");
            }
        } while (dia >= 8 || dia <= 0);
    }
}
