package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a13;

/**
 * 
 * @author Cresposoff
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    // Opción 1: Añadir producto
    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    // Opción 2: Listar productos
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.calcularPrecio());
        }
    }

    // Opción 3: Productos en peligro (Carnes frescas con < 10 días de caducidad)
    public void listarProductosEnPeligro() {
        for (Producto producto : productos) {
            if (producto instanceof CarneFresca) {
                CarneFresca carneFresca = (CarneFresca) producto;
                if (carneFresca.getDiasCaducidad() < 10) {
                    System.out.println("Nombre: " + carneFresca.getNombre() + ", Días de caducidad: " + carneFresca.getDiasCaducidad());
                }
            }
        }
    }

    // Opción 4: Calcular precio medio
    public double calcularPrecioMedio() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return productos.size() > 0 ? total / productos.size() : 0;
    }

    // Opción 5: Eliminar bandejas (Carnes congeladas en pieza que vienen en bandeja)
    public void eliminarBandejas() {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto instanceof CarneCongeladaPiezaEntera) {
                CarneCongeladaPiezaEntera carnePiezaEntera = (CarneCongeladaPiezaEntera) producto;
                if (carnePiezaEntera.isVieneEnBandeja()) {
                    iterator.remove();
                }
            }
        }
        System.out.println("Carnes congeladas en bandeja eliminadas.");
    }
}
