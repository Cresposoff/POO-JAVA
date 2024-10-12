package ejerciciosjavaanexo1.metodos.metodo5;

import java.util.Scanner;
public class EjercicioMetodo5Prueba {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Ingrese el valor int de un primer número: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el valor int de un segundo número: ");
        n2 = sc.nextInt();

        //creamos el objeto
        EjercicioMetodo5 print = new EjercicioMetodo5();

        //Llamamos el método
        print.imprimir(n1, n2);
    }

}
