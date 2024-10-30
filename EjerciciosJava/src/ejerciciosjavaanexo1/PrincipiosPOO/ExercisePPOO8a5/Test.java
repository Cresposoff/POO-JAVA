package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a5;

public class Test {
    public static void main(String[] args) {
        // Crear un array de 3 camiones
        Camion[] camiones = {
            new Camion(50000, "Volvo", 12.5, 2),
            new Camion(45000, "Mercedes", 15.0, 3),
            new Camion(60000, "Scania", 14.0, 4)
        };

        // Mostrar el precio de venta de cada camión
        System.out.println("=== Precios de Venta de Camiones ===");
        for (Camion camion : camiones) {
            System.out.println(camion);
            System.out.println();
        }

        // Crear un array de 2 furgonetas
        Furgoneta[] furgonetas = {
            new Furgoneta(20000, "Ford", 12),
            new Furgoneta(18000, "Renault", 8)
        };

        // Mostrar el precio de venta de cada furgoneta
        System.out.println("=== Precios de Venta de Furgonetas ===");
        for (Furgoneta furgoneta : furgonetas) {
            System.out.println(furgoneta);
            System.out.println();
        }

        // MEJORA 1: Crear un array polimórfico para almacenar todos los vehículos
        Vehiculo[] vehiculos = new Vehiculo[camiones.length + furgonetas.length];
        System.arraycopy(camiones, 0, vehiculos, 0, camiones.length);
        System.arraycopy(furgonetas, 0, vehiculos, camiones.length, furgonetas.length);

        // Mostrar el precio de venta de todos los vehículos del array polimórfico
        System.out.println("=== Precios de Venta de Todos los Vehículos ===");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            System.out.println();
        }
    }
}
