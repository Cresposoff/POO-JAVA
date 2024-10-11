package ejerciciosjavaanexo1.metodos.metodo2;

import java.util.Scanner;

public class EjercicioMetodo2 {
    //Atributos
    int num;

    //Método
    //Método para preguntar al usuario un número
    public void preguntar (){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = sc.nextInt();
    }

    //Método para saber si es positivo o no
    public void parImpar (){
        if (num > 0) {
            System.out.println("El número "+num+" es POSITIVO");
        } else if(num == 0) {
            System.out.println("El número es CERO");
        } else {
            System.out.println("El número "+num+" es NEGATIVO");
        }
    }
}
