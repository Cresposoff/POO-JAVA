package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4];

        // Lectura de los datos de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Introduce los datos del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            // Creación del empleado
            empleados[i] = new Empleado(nombre, telefono);
            System.out.println();
        }

        // Mostrar los datos de cada empleado
        System.out.println("Datos de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println();
        }

        // Mostrar el número total de empleados creados
        System.out.println("Número total de empleados instanciados: " + Empleado.getNumeroEmpleados());
        scanner.close();
    }
}
