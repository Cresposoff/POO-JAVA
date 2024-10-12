package ejerciciosjavaanexo1.metodos.metodo4;

import java.util.Scanner;

public class EjercicioMetodo4Prueba {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un valor int: ");    
        num = sc.nextInt();
        
        //Creamos el objeto
        EjercicioMetodo4 print = new EjercicioMetodo4();

        //Llamamos los Métodos
        print.imprimir(num);
    }
    

}
