package ejerciciosjavaanexo1.bifuraciones.nivelinicial;

import java.util.Scanner;

public class Ejercicio2a5 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese un número entero para...");
        System.out.print("Día: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int anio = sc.nextInt();

        // Cerrar scanner para evitar fugas de memoria
        sc.close();

        /* ESTA ES LA MANERA MÁS OPTIMIZADA DEL PROGRAMADA (SIN DECISIONES)

        // Ajustar días y meses si son mayores a los valores estándar
        mes += (dia / 30);
        dia = (dia % 30) + 1;

        anio += (mes / 12);
        mes = ((mes - 1) % 12) + 1;

        // Imprimir el resultado
        System.out.println("El día siguiente es: " + dia + "/" + mes + "/" + anio);

         */

        //Validamos
        if (dia > 0 && dia < 30){
            dia += 1;
            System.out.println("El día siguiente es: " + dia + "/" + mes + "/" + anio);
        } else if (dia >= 30 && mes < 12){
            dia -= 29;
            mes += 1;
            System.out.println("El día siguiente es: " + dia + "/" + mes + "/" + anio);
        } else if (mes >= 12) {
            dia -= 29;
            mes -= 11;
            anio += 1;
            System.out.println("El día siguiente es: " + dia + "/" + mes + "/" + anio);
        }
    }
}