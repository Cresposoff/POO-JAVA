package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Calcular precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de producto (CarneFresca, CarneCongeladaPiezaEntera, etc.): ");
                    String tipoProducto = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Precio por kilo: ");
                    double precioKilo = scanner.nextDouble();

                    if (tipoProducto.equalsIgnoreCase("CarneFresca")) {
                        System.out.print("Origen (vacuno/avícola): ");
                        String origen = scanner.next();
                        System.out.print("Días de caducidad: ");
                        int diasCaducidad = scanner.nextInt();
                        almacen.añadirProducto(new CarneFresca(nombre, peso, precioKilo, origen, diasCaducidad));

                    } else if (tipoProducto.equalsIgnoreCase("CarneCongeladaPiezaEntera")) {
                        System.out.print("Origen (vacuno/avícola): ");
                        String origen = scanner.next();
                        System.out.print("Empresa distribuidora: ");
                        String empresaDistribuidora = scanner.next();
                        System.out.print("¿Viene en bandeja? (true/false): ");
                        boolean vieneEnBandeja = scanner.nextBoolean();
                        almacen.añadirProducto(new CarneCongeladaPiezaEntera(nombre, peso, precioKilo, origen, empresaDistribuidora, vieneEnBandeja));

                    } else if (tipoProducto.equalsIgnoreCase("Pescado")) {
                        System.out.print("Tipo de pescado: ");
                        String tipoPescado = scanner.next();
                        almacen.añadirProducto(new Pescado(nombre, peso, precioKilo, tipoPescado));
                    }
                    break;

                case 2:
                    almacen.listarProductos();
                    break;

                case 3:
                    almacen.listarProductosEnPeligro();
                    break;

                case 4:
                    System.out.println("Precio medio: " + almacen.calcularPrecioMedio());
                    break;

                case 5:
                    almacen.eliminarBandejas();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
