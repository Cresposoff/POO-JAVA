package ejerciciosjavaanexo1.metodos.metodo5a4;

import java.util.Scanner;

public class ExerciseMethods5a4 {
    //Atributos
    Scanner sc = new Scanner(System.in);

    //Métodos
    //Método para pedir una frase y retornarla
    public String pedirFrase(){
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        return frase;
    }
}
