package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    // Arreglo de tipo dinamico
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Método llenar poligono
        llenarPoligono();
        
        // Método para imprimir datos y area de cada poligono
        mostrarResultados();
    }

    public static void llenarPoligono() {
        char respuesta;
        int opcion;
        do{
            do {
                System.out.println("Digite qué poligono desea: ");
                System.out.println("1.- Triangulo");
                System.out.println("2.- Rectangulo");
                System.out.print("Opcion: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1: llenarTriangulo(); // Llenar Triangulo
                    
                    break;

                case 2: llenarRectangulo(); // Llenar Rectangulo
                    
                    break;
            }

            System.out.print("\nDesea introducir otro poligono? (S/N)");
            respuesta = sc.next().charAt(0);
            System.out.println(""); // Saltar salto de línea
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;

        System.out.print("Ingrese el lado 1: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        lado2 = sc.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        lado3 = sc.nextDouble();

        // Creamos un nuevo Triangulo
        Triangulo t = new Triangulo(lado1, lado2, lado3);

        //Guardamos un Triangulo dentro de nuestro arreglo de poligonos
        poligono.add(t);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;

        System.out.println("Ingrese el lado 1: ");
        lado1 = sc.nextDouble();
        System.out.println("Ingrese el lado 2: ");
        lado2 = sc.nextDouble();

        // Creamos un nuevo Rectangulo
        Rectangulo r = new Rectangulo(lado1, lado2);

        //Guardamos un Rectangulo dentro de nuestro arreglo de poligonos
        poligono.add(r);
    }

    public static void mostrarResultados() {

        //Recorremos el arreglo de poligonos y imprimimos los datos
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area: " + poli.calcularArea());
            System.out.println("");
        }
    }
}
