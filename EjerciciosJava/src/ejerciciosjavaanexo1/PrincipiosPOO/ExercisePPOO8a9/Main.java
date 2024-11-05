package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a9;

/**
 * 
 * @author Cresposoff
 */

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Urbanizacion urbanizacion = new Urbanizacion();

        // Crear y agregar viviendas
        Piso piso1 = new Piso("Calle Mayor", 80, 2, 3);
        Adosado adosado1 = new Adosado("Calle Segunda", 120, 2);
        Chalet chalet1 = new Chalet("Calle Tercera", 200, 1, true);

        urbanizacion.agregarVivienda(piso1);
        urbanizacion.agregarVivienda(adosado1);
        urbanizacion.agregarVivienda(chalet1);

        // Mostrar precios
        System.out.println("Precio total de todas las viviendas: " + urbanizacion.calcularPrecioTotal());
        System.out.println("Precio total de los chalets: " + urbanizacion.calcularPrecioChalets());

        // Guardar en archivo binario
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("viviendas.dat"))) {
            out.writeObject(new ArrayList<>(urbanizacion.getViviendas()));
            System.out.println("Colección de viviendas guardada en viviendas.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde archivo binario
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("viviendas.dat"))) {
            @SuppressWarnings("unchecked")
            ArrayList<Vivienda> viviendasLeidas = (ArrayList<Vivienda>) in.readObject();
            System.out.println("\nContenido del archivo viviendas.dat:");
            for (Vivienda vivienda : viviendasLeidas) {
                vivienda.mostrarInformacion();
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
