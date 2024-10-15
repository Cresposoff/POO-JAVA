package ejerciciosjavaanexo1.metodos.metodo9;

import java.util.Scanner;
public class EjercicioMetodo9Prueba {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de un primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el valor de un segundo número: ");
        int n2 = sc.nextInt();

        //Creamos el objeto
        EjercicioMetodo9 print = new EjercicioMetodo9();

        //Llamamos los métodos
        System.out.println("La suma de los dos numeros es: "+print.recibirNumeros(n1, n2));
    }
}
