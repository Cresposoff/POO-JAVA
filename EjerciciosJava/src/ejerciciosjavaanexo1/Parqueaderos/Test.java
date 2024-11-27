package ejerciciosjavaanexo1.Parqueaderos;

import ejerciciosjavaanexo1.Parqueaderos.garages.Empresa;
import ejerciciosjavaanexo1.Parqueaderos.garages.Garage;
import ejerciciosjavaanexo1.Parqueaderos.vehicles.*;
import ejerciciosjavaanexo1.Parqueaderos.exceptions.*;

public class Test {
    public static void main(String[] args) {
        try {
            // Crear la empresa
            Empresa empresa = new Empresa("Parqueaderos XYZ", "Calle 123", "555-1234");

            // Crear garajes con los datos dados
            Garage g1 = new Garage("Huila", "Neiva", "CRA 34 6 65", "3112548792", "g1@empresa.co", "MARIA", 9);
            Garage g2 = new Garage("Tolima", "Ibague", "CLL65 89 87", "3256987412", "g2@empresa.co", "PEDRO", 10);

            // Registrar los garajes en la empresa
            empresa.agregarGaraje(g1);
            empresa.agregarGaraje(g2);

            // Mostrar la información de los garajes
            System.out.println("Garages registrados en la empresa:");
            empresa.mostrarGarajes();

            // Crear cinco vehículos de cada tipo
            Vehiculo[] vehiculos = new Vehiculo[15];
            for (int i = 0; i < 5; i++) {
                vehiculos[i] = new Auto("CCH" + i, 500, 3456, true, true);
                vehiculos[i + 5] = new Moto("MOT" + i, 6778, 3456, false);
                vehiculos[i + 10] = new Camion("CAM" + i, 65347, 3456, 4, "Sencillo", 7);
            }

            // Agregar vehículos al primer garaje
            System.out.println("\nAgregando vehículos al garaje G1:");
            for (int i = 0; i < 9; i++) {
                g1.ingresarVehiculo(vehiculos[i]);
            }

            // Probar agregar un vehículo ya registrado en otro garaje
            System.out.println("\nPrueba: Agregar un vehículo ya registrado en otro garaje:");
            try {
                g2.ingresarVehiculo(vehiculos[0]); // Esto debe lanzar una excepción
            } catch (VehiculoYaRegistradoException e) {
                System.out.println("Excepción esperada: " + e.getMessage());
            }

            // Probar desglose de ocupación
            System.out.println("\nDesglose de ocupación por tipo de vehículo en G1:");
            System.out.println(g1.generarDesgloseOcupacion());

        } catch (EspaciosInsuficientesException | MaximoCamionesException | MaximoMotosException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
