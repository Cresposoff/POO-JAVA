package ejerciciosjavaanexo1.metodos.metodo1;

import java.util.Scanner;

public class EjercicioMetodo1 {
    //Cuando las variables están fuera de un método se llaman VARIABLES GLOBALES, y cuando están dentro VARIABLES LOCALES.
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
