package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Atributos
        String marca;
        String modelo;
        double precio;
        int n, indiceBarato; // número de vehículos

        System.out.print("Ingrese el número de vehículos: ");
        n = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        // Crear un array de vehiculos (osea un array de n cantidad de objetos)
        Vehiculo[] v = new Vehiculo[n];

        for (int i = 0; i < v.length; i++) {
            System.out.println("\nIngrese características del vehículo " + (i + 1) + ": ");
            System.out.print("MARCA: ");
            marca = sc.nextLine();
            System.out.print("MODELO: ");
            modelo = sc.nextLine();
            System.out.print("PRECIO: $");
            precio = sc.nextDouble();
            sc.nextLine(); // Consumir el salto de línea

            v[i] = new Vehiculo(marca, modelo, precio);
        }

        // Imprimir el indice del array de vehiculos de objetos v, al decidir qué
        // vehículo es más barato
        indiceBarato = v[0].indiceVehiculoBarato(v);
        System.out.println("\nEl vehículo más barato es el: "+ (indiceBarato + 1));
        System.out.println(v[indiceBarato].mostrarDatos());
    }

}