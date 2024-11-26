package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOGarajecopyCamion;

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
            System.out.println("7. Cantidad camiones por tipo");
            System.out.println("8. Determinar cantidad de plazas disponibles");
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
                case 7: // Cantidad de camiones por tipo de camión (Sencillo/Doble)
                    System.out.println(
                            "\nCantidad de camiones: " + garaje.calcularOcupacionPorTipoVehiculo(Camion.class));
                    // Ahora mostraremos los camiones sencillos y los camiones dobles

                    break;
                case 8:
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

        Vehiculo vehiculo = null; // Vehiculo que se va a crear y alquilar en el garaje (null por defecto porque
                                  // aún no se crea ningún vehículo, es en el transcurso del switch)

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
                // No se necesita el tipo de camión porque se calcula en el constructor
                // dependiendo del número de ejes
                System.out.print("Número de ejes (2)Sencillo (3-6)Doble: ");
                int numeroEjes = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                String tipoCamion = null;
                int nCamionesSencillos = 0;
                int nCamionesDobles = 0;
                // Método para especificar que el camion sencillo tiene dos ejes y el camion
                // doble puede tener de tres a seis
                if (numeroEjes < 2 || numeroEjes > 6) {
                    System.out.println("El número de ejes debe ser entre 2 y 6");
                } else if (numeroEjes == 2) {
                    // Cambiar el tipo de camión a "Sencillo" y vamos sumando a una variable de
                    // clase
                    // para contar el número de camiones de este tipo
                    tipoCamion = "Sencillo";
                    nCamionesSencillos = 1 + nCamionesSencillos;

                } else if (numeroEjes > 2) {
                    tipoCamion = "Doble";
                    nCamionesDobles = 1 + nCamionesDobles;
                }
                
                System.out.print("Capacidad de carga en toneladas: ");
                double capacidadCarga = scanner.nextDouble();
                vehiculo = new Camion(marca, precio, cilindraje, tipoCamion, numeroEjes, capacidadCarga);
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

        // Mostrar en proporción %, sumaremos la cantidad de todos los vehiculos para de
        // ahí el total de 100%
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
                    ", Vehiculo: " + vehiculo.getClass().getSimpleName());
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