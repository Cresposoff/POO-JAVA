package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGaraje;

/**
 * 
 * @author Cresposoff
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de gestión del Garaje:");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos / motos");
            System.out.println("5. Listado de matrículas, cuota mensual y tipo de vehículo");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    alquilarEspacio(garaje, scanner);
                    break;
                case 2:
                    retirarVehiculo(garaje, scanner);
                    break;
                case 3:
                    System.out.println("Ingresos mensuales totales del garaje: " + garaje.calcularIngresos());
                    break;
                case 4:
                    consultarProporcionAutosMotos(garaje);
                    break;
                case 5:
                    listarVehiculos(garaje);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void alquilarEspacio(Garaje garaje, Scanner scanner) {
        System.out.println("\n--- Alquilar un Espacio ---");
        System.out.print("Ingrese tipo de vehículo (1 para Auto, 2 para Moto): ");
        int tipoVehiculo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese precio del vehículo: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese cilindraje del vehículo: ");
        int cilindraje = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese matrícula (6 caracteres): ");
        String matricula = scanner.nextLine();

        Vehiculo vehiculo;
        boolean matriculaValida = matricula.length() == 6;

        if (!matriculaValida) {
            System.out.println("Error: La matrícula debe tener exactamente 6 caracteres.");
            return;
        }

        if (tipoVehiculo == 1) { // Auto
            System.out.print("¿Tiene radio? (true/false): ");
            boolean tieneRadio = scanner.nextBoolean();
            System.out.print("¿Tiene navegador? (true/false): ");
            boolean tieneNavegador = scanner.nextBoolean();
            vehiculo = new Auto(marca, precio, cilindraje, tieneRadio, tieneNavegador);

        } else if (tipoVehiculo == 2) { // Moto
            System.out.print("¿Tiene sidecar? (true/false): ");
            boolean tieneSidecar = scanner.nextBoolean();
            vehiculo = new Moto(marca, precio, cilindraje, tieneSidecar);

        } else {
            System.out.println("Tipo de vehículo no válido.");
            return;
        }

        // Intentar asignar matrícula
        if (!vehiculo.matricular(matricula)) {
            System.out.println("Error: La matrícula debe tener exactamente 6 caracteres.");
            return;
        }

        // Intentar alquilar espacio
        if (garaje.alquilarEspacio(vehiculo)) {
            System.out.println("\nVehículo alquilado exitosamente.");
        } else {
            System.out.println("\nNo se pudo alquilar el espacio (garaje lleno o excede límite de motos).");
        }
    }

    private static void retirarVehiculo(Garaje garaje, Scanner scanner) {
        System.out.println("\n--- Retirar Vehículo ---");
        System.out.print("Ingrese matrícula del vehículo a retirar: ");
        String matricula = scanner.nextLine();

        if (garaje.retirarVehiculo(matricula)) {
            System.out.println("Vehículo con matrícula " + matricula + " retirado exitosamente.");
        } else {
            System.out.println("No se encontró ningún vehículo con la matrícula " + matricula + ".");
        }
    }

    private static void consultarProporcionAutosMotos(Garaje garaje) {
        System.out.println("\n--- Consulta Proporción Autos / Motos ---");
        int cantidadAutos = garaje.calcularOcupacionPorTipoVehiculo(Auto.class);
        int cantidadMotos = garaje.calcularOcupacionPorTipoVehiculo(Moto.class);

        System.out.println("Cantidad de Autos en el garaje: " + cantidadAutos);
        System.out.println("Cantidad de Motos en el garaje: " + cantidadMotos);

        if (cantidadMotos > 0) {
            double proporcion = (double) cantidadAutos / cantidadMotos;
            System.out.println("Proporción Autos / Motos: " + proporcion);
        } else {
            System.out.println("No hay motos en el garaje para calcular la proporción.");
        }
    }

    private static void listarVehiculos(Garaje garaje) {
        System.out.println("\n--- Listado de Matrículas, Cuota Mensual y Tipo de Vehículo ---");
        if (garaje.getListaVehiculos().isEmpty()) {
            System.out.println("El garaje está vacío.");
        } else {
            garaje.getListaVehiculos().forEach(v -> {
                System.out.println("Matrícula: " + v.getPlaca() + ", Cuota Mensual: " + v.getCuotaMesGaraje()
                        + ", Tipo: " + v.getClass().getSimpleName());
            });
        }
    }
}