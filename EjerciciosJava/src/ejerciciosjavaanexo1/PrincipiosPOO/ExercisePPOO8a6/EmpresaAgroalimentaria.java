package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpresaAgroalimentaria {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        // Productos frescos
        productos.add(new ProductoFresco(new Date(), 101, new Date(), "España"));
        productos.add(new ProductoFresco(new Date(), 102, new Date(), "Francia"));

        // Productos refrigerados
        productos.add(new ProductoRefrigerado(new Date(), 201, new Date(), "Alemania", "AB123", 5.0));
        productos.add(new ProductoRefrigerado(new Date(), 202, new Date(), "Italia", "CD456", 4.0));
        productos.add(new ProductoRefrigerado(new Date(), 203, new Date(), "Portugal", "EF789", 3.5));

        // Productos congelados
        productos.add(new CongeladoPorAgua(new Date(), 301, new Date(), "España", -18.0, 30.5));
        productos.add(new CongeladoPorAgua(new Date(), 302, new Date(), "Chile", -20.0, 28.0));
        productos.add(new CongeladoPorAire(new Date(), 303, new Date(), "Argentina", -25.0, 78.0, 21.0, 0.04, 0.96));
        productos.add(new CongeladoPorAire(new Date(), 304, new Date(), "Brasil", -22.0, 75.0, 23.0, 0.05, 0.95));
        productos.add(new CongeladoPorNitrogeno(new Date(), 305, new Date(), "Canadá", -30.0, "Inmersión", 120));

        // Mostrar información de todos los productos
        for (Producto producto : productos) {
            System.out.println("\n--- Información del producto ---");
            producto.mostrarInformacion();
        }
    }
}
