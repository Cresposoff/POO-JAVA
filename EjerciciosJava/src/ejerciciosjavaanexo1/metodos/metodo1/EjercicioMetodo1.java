package ejerciciosjavaanexo1.metodos.metodo1;

import java.util.Scanner;

public class EjercicioMetodo1 {
    //Atributos
    String nombre;

    //Métodos

    //Método pedir nombre usuario
    public void pedirNombre (){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
    }

    //Método creamos saludo
    public void saludo (){
        System.out.println("buenas tardes, "+nombre);
    }
}
