package ejerciciosjavaanexo1.metodos.metodo6;

import java.util.Scanner;

public class EjecicioMetodo6Prueba {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor int de un primer número: ");
        int nu1 = sc.nextInt();
        System.out.println("Ingrese el valor int de un segundo número: ");
        int nu2 = sc.nextInt();

        //Creamos el objeto
        EjercicioMetodo6 print = new EjercicioMetodo6();

        //Llamamos los métodos
        print.desi(nu1, nu2);
    }
}
