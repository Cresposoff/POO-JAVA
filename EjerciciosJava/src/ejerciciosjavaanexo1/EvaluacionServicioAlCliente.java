/**
 * @Author Jhoan Sebastián Montealegre Vargas 20241221018
 */

package ejerciciosjavaanexo1;

import java.util.Random;
import java.util.Scanner;

public class EvaluacionServicioAlCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Definir la cantidad de clientes
        System.out.print("Ingrese la cantidad de clientes a evaluar: ");
        int numClientes = sc.nextInt();

        // Definir las matrices para almacenar los datos de los clientes
        boolean[] solucionProblema = new boolean[numClientes];
        int[] amabilidad = new int[numClientes];
        int[] calidadServicios = new int[numClientes];
        boolean[] precioJusto = new boolean[numClientes];
        int[] ambienteSitio = new int[numClientes];

        // Llenar la matriz con datos aleatorios
        for (int i = 0; i < numClientes; i++) {
            solucionProblema[i] = random.nextBoolean(); // Solución al problema (Sí o No)
            amabilidad[i] = random.nextInt(5) + 1;      // Amabilidad (Escala de 1 a 5)
            calidadServicios[i] = random.nextInt(5) + 1; // Calidad de servicios recibidos (1 - Deficintes 2 - Regulares 3 - Aceptables 4 - Muy buenos 5 - Excelente)
            precioJusto[i] = random.nextBoolean();      // Precio justo (Sí o No)
            ambienteSitio[i] = random.nextInt(5) + 1;   // Ambiente del sitio (Escala de 1 a 5)
        }

        // Generar reporte de un cliente específico
        System.out.print("Ingrese el número de cliente para ver su reporte (1 a " + numClientes + "): ");
        int cliente = sc.nextInt();

        if (cliente < 1 || cliente > numClientes) {
            System.out.println("Número de cliente no válido.");
        } else {
            cliente--;  // Ajustar el índice del cliente (0 a numClientes-1)
            System.out.println("No. Cliente: " + (cliente + 1));
            System.out.println("El problema fue solucionado: " + (solucionProblema[cliente] ? "Sí" : "No"));
            System.out.println("Amabilidad en la atención recibida: " + amabilidad[cliente]);
            
            switch (calidadServicios[cliente]) {
                case 1:
                System.out.println("Calidad de los servicios recibidos: " + calidadServicios[cliente]+" Deficientes");
                    break;
                case 2:
                System.out.println("Calidad de los servicios recibidos: " + calidadServicios[cliente]+" Regulares");
                    break;

                case 3:
                System.out.println("Calidad de los servicios recibidos: " + calidadServicios[cliente]+" Aceptables");
                    break;

                case 4:
                System.out.println("Calidad de los servicios recibidos: " + calidadServicios[cliente]+" Muy Buenos");
                    break;

                case 5:
                System.out.println("Calidad de los servicios recibidos: " + calidadServicios[cliente]+" Ecxelente");
                break;
            }

            System.out.println("El precio fue justo: " + (precioJusto[cliente] ? "Sí" : "No"));
            System.out.println("Calificación del ambiente del sitio: " + ambienteSitio[cliente]);
        }

        // Calcular estadísticas
        int solucionados = 0, totalServicio = 0, precioJustoTotal = 0, totalAmabilidad = 0, totalAmbiente = 0;

        for (int i = 0; i < numClientes; i++) {
            if (solucionProblema[i]) solucionados++;
            if (precioJusto[i]) precioJustoTotal++;
            totalServicio = totalServicio + calidadServicios[i];
            totalAmabilidad = totalAmabilidad + amabilidad[i];
            totalAmbiente = totalAmbiente + ambienteSitio[i];
        }

        // a. Relación porcentual del ítem de Solución al Problema
        double porcentajeSolucion = ((double) solucionados / numClientes) * 100;

        // b. Promedio del concepto de Amabilidad
        double promedioAmabilidad = (double) totalAmabilidad / numClientes;
        
        // Se divide numClientes entre 0.1 para actualizar numClientes de proceso pasado
        // c. Relación porcentual del ítem de Calidad de los Servicios
        double porcentajeCalidad = ((double) totalServicio / (numClientes / 0.1)) * 100;

        // d. Promedio del ambiente del sitio
        double promedioAmbiente = (double) totalAmbiente / numClientes;

        // Mostrar estadísticas
        System.out.println("\nEstadísticas Generales:");
        System.out.println("Relación porcentual del ítem Solución al Problema: " + porcentajeSolucion + "%");
        System.out.println("Promedio del concepto de Amabilidad: " + promedioAmabilidad);
        System.out.println("Relación porcentual del ítem Calidad de los Servicios: " + porcentajeCalidad + "%");
        System.out.println("Promedio del ambiente del sitio: " + promedioAmbiente);
    }
}
