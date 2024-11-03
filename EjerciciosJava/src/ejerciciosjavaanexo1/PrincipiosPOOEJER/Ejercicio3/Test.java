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
        int n; // número de vehículos

        System.out.println("Ingrese el número de vehículos: ");
        n = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        // Crear un array de vehiculos (osea un array de n cantidad de objetos)
        Vehiculo[] v = new Vehiculo[n];

        for (int i = 0; i < v.length; i++) {
            System.out.println("\nIngrese características del vehículo " + (i + 1) + ": ");
            System.out.println("Ingrese la marca: ");
            marca = sc.nextLine();
            sc.nextLine(); // Consumir el salto de línea
            System.out.println("Ingrese el modelo: ");
            modelo = sc.nextLine();
            sc.nextLine(); // Consumir el salto de línea
            System.out.println("Ingrese el precio: ");
            precio = sc.nextDouble();
            sc.nextLine(); // Consumir el salto de línea
            v[i] = new Vehiculo(marca, modelo, precio);

        }
        sc.nextLine(); // Consumir el salto de línea
    }

}