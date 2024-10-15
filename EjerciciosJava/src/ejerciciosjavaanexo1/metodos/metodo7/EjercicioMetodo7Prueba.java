package ejerciciosjavaanexo1.metodos.metodo7;

import java.util.Scanner;

public class EjercicioMetodo7Prueba {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de un primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el valor de un segundo número: ");
        int n2 = sc.nextInt();
        
        //Creamos el objeto
        EjercicioMetodo7 suma = new EjercicioMetodo7();
        
        //Llamamos los métodos
        suma.adicion(n1, n2);
    }
    
}
