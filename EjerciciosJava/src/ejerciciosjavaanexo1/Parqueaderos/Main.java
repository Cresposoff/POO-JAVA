package ejerciciosjavaanexo1.Parqueaderos;

import java.util.Scanner;
import ejerciciosjavaanexo1.Parqueaderos.exceptions.*;
import ejerciciosjavaanexo1.Parqueaderos.vehicles.*;
import ejerciciosjavaanexo1.Parqueaderos.garages.*;

public class Main {
    public static void main(String[] args) {
        RedDeGarajes redDeGarajes = new RedDeGarajes();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menú de Gestión de la Red de Garajes ***");
            System.out.println("1. Crear un garaje");
            System.out.println("2. Eliminar un garaje");
            System.out.println("3. Ingresar vehículo a un garaje");
            System.out.println("4. Retirar vehículo de un garaje");
            System.out.println("5. Generar informe de ocupación");
            System.out.println("6. Consultar desglose de ocupación en un garaje");
            System.out.println("7. Generar informe de recaudo mensual");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> crearGaraje(redDeGarajes, sc);
                case 2 -> eliminarGaraje(redDeGarajes, sc);
                case 3 -> ingresarVehiculo(redDeGarajes, sc);
                case 4 -> retirarVehiculo(redDeGarajes, sc);
                case 5 -> generarInformeOcupacion(redDeGarajes, sc);
                case 6 -> consultarDesgloseOcupacion(redDeGarajes, sc);
                case 7 -> generarInformeRecaudo(redDeGarajes);
                case 8 -> System.out.println("¡Gracias por usar el sistema de gestión de garajes!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);

        sc.close();
    }

    private static void crearGaraje(RedDeGarajes red, Scanner sc) {
        sc.nextLine(); // Limpiar buffer
        System.out.println("*** Crear un nuevo garaje ***");
        System.out.print("Departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Nombre del administrador: ");
        String nombreAdministrador = sc.nextLine();
        System.out.print("Número de espacios del garaje: ");
        int maxEspacios = sc.nextInt();

        Garage garaje = new Garage(departamento, ciudad, direccion, telefono, email, nombreAdministrador, maxEspacios);
        red.agregarGaraje(garaje);
        System.out.println("Garaje creado exitosamente.");
    }

    private static void eliminarGaraje(RedDeGarajes red, Scanner sc) {
        sc.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la dirección del garaje a eliminar: ");
        String direccion = sc.nextLine();

        try {
            red.eliminarGaraje(direccion);
            System.out.println("Garaje eliminado exitosamente.");
        } catch (GarajeNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void ingresarVehiculo(RedDeGarajes red, Scanner sc) {
        sc.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la dirección del garaje: ");
        String direccion = sc.nextLine();
        System.out.println("Seleccione el tipo de vehículo: ");
        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camión");
        System.out.println("4. Camioneta");
        int tipo = sc.nextInt();

        sc.nextLine(); // Limpiar buffer
        System.out.print("Marca del vehículo: ");
        String marca = sc.nextLine();
        System.out.print("Precio del vehículo: ");
        double precio = sc.nextDouble();
        System.out.print("Cilindraje del vehículo: ");
        int cilindraje = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        System.out.print("Matrícula del vehículo (6 caracteres): ");
        String matricula = sc.nextLine();

        Vehiculo vehiculo;
        switch (tipo) {
            case 1 -> {
                System.out.print("¿Tiene sidecar? (true/false): ");
                boolean tieneSidecar = sc.nextBoolean();
                vehiculo = new Moto(marca, precio, cilindraje, tieneSidecar);
            }
            case 2 -> {
                System.out.print("¿Tiene radio? (true/false): ");
                boolean tieneRadio = sc.nextBoolean();
                System.out.print("¿Tiene navegador? (true/false): ");
                boolean tieneNavegador = sc.nextBoolean();
                vehiculo = new Auto(marca, precio, cilindraje, tieneRadio, tieneNavegador);
            }
            case 3 -> {
                System.out.print("Número de ejes: ");
                int numeroEjes = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                System.out.print("Tipo de camión (Sencillo/Doble): ");
                String tipoCamion = sc.nextLine();
                System.out.print("Capacidad de carga en toneladas: ");
                double capacidad = sc.nextDouble();
                vehiculo = new Camion(marca, precio, cilindraje, numeroEjes, tipoCamion, capacidad);
            }
            case 4 -> {
                System.out.print("Tipo de servicio (SUV/Pickup/Carga/Otro): ");
                String tipoServicio = sc.nextLine();
                System.out.print("Número de pasajeros: ");
                int numeroPasajeros = sc.nextInt();
                System.out.print("¿Tiene remolque? (true/false): ");
                boolean tieneRemolque = sc.nextBoolean();
                vehiculo = new Camioneta(marca, precio, cilindraje, tipoServicio, numeroPasajeros, tieneRemolque);
            }
            default -> {
                System.out.println("Tipo de vehículo no válido.");
                return;
            }
        }

        // Intentar matricular el vehículo
        if (!vehiculo.matricular(matricula)) {
            System.out.println("Matrícula inválida. El vehículo no se registrará.");
            return;
        }

        try {
            red.ingresarVehiculoAGaraje(direccion, vehiculo);
            System.out.println("Vehículo ingresado exitosamente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void retirarVehiculo(RedDeGarajes red, Scanner sc) {
        sc.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la dirección del garaje: ");
        String direccion = sc.nextLine();
        System.out.print("Ingrese la matrícula del vehículo a retirar: ");
        String matricula = sc.nextLine();

        try {
            Garage garaje = red.buscarGaraje(direccion);
            if (garaje != null) {
                garaje.retirarVehiculo(matricula);
                System.out.println("Vehículo retirado exitosamente.");
            } else {
                throw new GarajeNoEncontradoException("Garaje no encontrado.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void generarInformeOcupacion(RedDeGarajes red, Scanner sc) {
        System.out.println("*** Informe de Ocupación ***");
        for (Garage garaje : red.getGarajes()) {
            System.out.printf("Garaje en %s, %s (%s): Ocupación %d/%d\n",
                    garaje.getCiudad(), garaje.getDepartamento(), garaje.getDireccion(),
                    garaje.getOcupacionActual(), garaje.getMaxEspacios());
        }
    }

    private static void consultarDesgloseOcupacion(RedDeGarajes red, Scanner sc) {
        sc.nextLine();
        System.out.print("Ingrese la dirección del garaje: ");
        String direccion = sc.nextLine();

        try {
            Garage garaje = red.buscarGaraje(direccion);
            if (garaje == null) {
                throw new GarajeNoEncontradoException("Garaje no encontrado.");
            }

            String desglose = garaje.generarDesgloseOcupacion();
            if (desglose.isEmpty()) {
                System.out.println("El garaje está vacío.");
            } else {
                System.out.println("Desglose de ocupación: " + desglose);
            }
        } catch (GarajeNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void generarInformeRecaudo(RedDeGarajes red) {
        System.out.println("*** Informe de Recaudo Mensual ***");
        double totalRecaudo = 0;
        for (Garage garaje : red.getGarajes()) {
            double recaudo = garaje.calcularRecaudoMensual();
            totalRecaudo += recaudo;
            System.out.printf("Garaje en %s: Recaudo $%.2f\n", garaje.getDireccion(), recaudo);
        }
        System.out.printf("Recaudo total: $%.2f\n", totalRecaudo);
    }
}
