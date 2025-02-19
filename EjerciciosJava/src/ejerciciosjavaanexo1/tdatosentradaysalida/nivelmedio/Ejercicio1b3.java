package ejerciciosjavaanexo1.tdatosentradaysalida.nivelmedio;

import java.util.Scanner;

public class Ejercicio1b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de la primera nota: ");
        double x = sc.nextDouble();
        //double notaMinima = 5*2-x; sin porcentajes de por medio
        double notaMinima = (5-(x*0.4))/0.6;
        System.out.println("Para una media mínima de 5.0 necesita \""+ notaMinima +"\" en la segunda nota.");
        sc.close();
    }
}
