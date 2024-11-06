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
            System.out.println("4. Consulta proporción autos / motos / camiones");
            System.out.println("5. Listado de matrículas, cuota mensual y tipo de vehículo");
            System.out.println("6. Buscar vehículo por matrícula");
            System.out.println("7. Determinar cantidad de plazas disponibles");
            System.out.println("0. Salir");

            System.out.print("\nElige una opción: ");
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
                    System.out.println("\nIngresos mensuales totales del garaje: " + garaje.calcularIngresos());
                    break;
                case 4:
                    consultarProporcionVehiculos(garaje);
                    break;
                case 5:
                    listarVehiculos(garaje);
                    break;
                case 6:
                    buscarVehiculo(garaje, scanner);
                    break;
                case 7:
                    System.out.println("\nPlazas disponibles en el garaje: " + garaje.calcularPlazasDisponibles());
                    break;
                case 0:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void alquilarEspacio(Garaje garaje, Scanner scanner) {
        System.out.println("\nSeleccione el tipo de vehículo a alquilar:");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Camion");
        System.out.print("\nOpción: ");
        int tipoVehiculo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el precio del vehículo: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el cilindraje del vehículo: ");
        int cilindraje = scanner.nextInt();

        Vehiculo vehiculo = null;

        switch (tipoVehiculo) {
            case 1: // Auto
                System.out.print("¿Tiene radio? (true/false): ");
                boolean tieneRadio = scanner.nextBoolean();
                System.out.print("¿Tiene navegador? (true/false): ");
                boolean tieneNavegador = scanner.nextBoolean();
                vehiculo = new Auto(marca, precio, cilindraje, tieneRadio, tieneNavegador);
                break;
            case 2: // Moto
                System.out.print("¿Tiene sidecar? (true/false): ");
                boolean tieneSidecar = scanner.nextBoolean();
                vehiculo = new Moto(marca, precio, cilindraje, tieneSidecar);
                break;
            case 3: // Camion
                System.out.print("Número de ejes: ");
                int numeroEjes = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Tipo de camión (Sencillo/Doble): ");
                String tipoCamion = scanner.nextLine();
                System.out.print("Capacidad de carga en toneladas: ");
                double capacidadCarga = scanner.nextDouble();
                vehiculo = new Camion(marca, precio, cilindraje, numeroEjes, tipoCamion, capacidadCarga);
                break;
            default:
                System.out.println("\nTipo de vehículo no válido.");
                return;
        }

        // Solicitar matrícula y asignarla si cumple la validación
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("\nIngrese la matrícula (6 caracteres): ");
        String matricula = scanner.nextLine();

        if (vehiculo.matricular(matricula)) {
            if (garaje.alquilarEspacio(vehiculo)) {
                System.out.println("\nEspacio alquilado con éxito para el vehículo con matrícula: " + matricula);
            }
        } else {
            System.out.println("\nMatrícula inválida. Debe tener 6 caracteres.");
        }
    }

    private static void retirarVehiculo(Garaje garaje, Scanner scanner) {
        System.out.print("\nIngrese la matrícula del vehículo a retirar: ");
        String matricula = scanner.nextLine();
        if (garaje.retirarVehiculo(matricula)) {
            System.out.println("\nVehículo retirado con éxito.");
        } else {
            System.out.println("\nVehículo no encontrado en el garaje.");
        }
    }

    private static void consultarProporcionVehiculos(Garaje garaje) {
        int cantidadAutos = garaje.calcularOcupacionPorTipoVehiculo(Auto.class);
        int cantidadMotos = garaje.calcularOcupacionPorTipoVehiculo(Moto.class);
        int cantidadCamiones = garaje.calcularOcupacionPorTipoVehiculo(Camion.class);

        // Mostrar en proporción %, sumaremos la cantidad de todos los vehiculos para de ahí el total
        // de 100%
        int totalVehiculos = cantidadAutos + cantidadMotos + cantidadCamiones;
        System.out.println("\nProporción de vehículos en el garaje: ");
        System.out.println("Autos: " + ((double) cantidadAutos / totalVehiculos) * 100 + "%");
        System.out.println("Motos: " + ((double) cantidadMotos / totalVehiculos) * 100 + "%");
        System.out.println("Camiones: " + ((double) cantidadCamiones / totalVehiculos) * 100 + "%");
    }

    private static void listarVehiculos(Garaje garaje) {
        System.out.println("\nListado de vehículos en el garaje:");
        for (Vehiculo vehiculo : garaje.getListaVehiculos()) {
            System.out.println("Matrícula: " + vehiculo.getPlaca() +
                    ", Cuota Mensual: " + vehiculo.getCuotaMesGaraje() +
                    ", Tipo: " + vehiculo.getClass().getSimpleName());
        }
    }

    private static void buscarVehiculo(Garaje garaje, Scanner scanner) {
        System.out.print("\nIngrese la matrícula del vehículo a buscar: ");
        String matricula = scanner.nextLine();
        int indice = garaje.buscarVehiculoPorMatricula(matricula);
        if (indice != -1) {
            System.out.println("\nVehículo encontrado en la posición: " + indice);
        } else {
            System.out.println("\nNo se encontró un vehículo con esa matrícula.");
        }
    }
}
