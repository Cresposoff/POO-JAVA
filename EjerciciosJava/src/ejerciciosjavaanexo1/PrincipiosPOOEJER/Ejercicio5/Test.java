package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Atributos
        double base, lado;
        int n; //número de triángulos

        System.out.print("Ingrese el número de triángulos: ");
        n = sc.nextInt();

        // Crear un array de triángulos
        TrianguloIsosceles [] t = new TrianguloIsosceles[n];

        for (int i = 0; i < t.length; i++) {
            System.out.println("\nIngrese las características del ISÓSCELES: " + (i + 1));
            System.out.print("BASE: ");
            base = sc.nextDouble();
            System.out.print("LADO: ");
            lado = sc.nextDouble();
            sc.nextLine(); // Consumir el salto de línea
            t[i] = new TrianguloIsosceles(base, lado); //Llenar el array de triángulos
            System.out.println("Perimetro: " + t[i].obtenerPerimetro() + "u"); //Con: x (unidad de medida)
            System.out.println("Área: " + t[i].obtenerArea() + "u²"); //Con: x (unidad de medida)²

        }

        System.out.println("\nEl área mayor es: " + TrianguloIsosceles.mayorArea(t) + "u²"); //Con: x (unidad de medida)²

    }
}
