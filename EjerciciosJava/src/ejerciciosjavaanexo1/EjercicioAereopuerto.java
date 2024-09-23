package ejerciciosjavaanexo1;

import java.util.Scanner;
public class EjercicioAereopuerto {
    public static void main(String[] args) {
        int matriz [][] = new int[6][3];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        //Recargar matriz con cantidad de asientos
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length - 3; c++) {
                System.out.println("Ingrese el número de asientos del vuelo: "+(f+1)+" horario "+(c+1));
                matriz[f][c] = sc.nextInt();
                
            }
        }
        
        //venta
        @SuppressWarnings("resource")
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Cuántos vuelos desea comprar?: ");
        String bandera = "";
        int destino, horario, asiento;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el número del destino ");
            destino = sc2.nextInt();
            System.out.println("Ingrese el número del horario ");
            horario = sc2.nextInt();
            System.out.println("Ingrese el número del asiento ");
            asiento = sc2.nextInt();

            if (matriz[destino][horario] >= asiento) {
                System.out.println("Su venta fue realizada con éxito");
                matriz[destino][horario] = matriz[destino][horario] - asiento;
                
            } else {
                System.out.println("No hay asientos disponibles!");
            }
            System.out.println("Desea seguir reservnado?, ingrese finish para terminar o cualquier tecla para seguir");
            bandera = sc2.next();
        }
    }
}