package ejerciciosjavaanexo1.metodos.metodo5a3;

import java.util.Scanner;

public class EjercicioMetodo5a3 {
    //Atributos
    Scanner sc = new Scanner(System.in);

    //Métodos
    //Método para pedir un número entero y retornarlo
    public int pedirNumero(){
        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        return numero;
    }
}
