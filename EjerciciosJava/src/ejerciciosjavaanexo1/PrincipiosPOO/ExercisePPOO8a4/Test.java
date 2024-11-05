package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a4;

/**
 * 
 * @author Cresposoff
 */

public class Test {
    public static void main(String[] args) {
        // Crear un coche sin matrícula
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.1, 2015);
        coche1.setDniTitular("12345678A");
        coche1.incrementarKm(10000);
        coche1.asignarMatricula("ABC123");
        System.out.println("=== Coche 1 ===");
        System.out.println(coche1);

        // Crear un coche matriculado
        CocheMatriculado coche2 = new CocheMatriculado("Ford", "Azul", 25000, 0.2, 2012, 2022, 5, "XYZ789", "87654321B");
        System.out.println("\n=== Coche 2 (Matriculado) ===");
        System.out.println(coche2);

        // Prueba del método comprarCoche
        coche1.comprarCoche(coche2);
        System.out.println("\n=== Coche 1 después de comprarCoche con Coche 2 ===");
        System.out.println(coche1);

        // Modificación de atributos y prueba de restricción de matrícula
        coche1.setColor("Verde");
        coche1.setPrecio(18000);
        coche1.asignarMatricula("NEW456"); // Intento de asignar nueva matrícula, que debe fallar
        System.out.println("\n=== Coche 1 después de cambios ===");
        System.out.println(coche1);

        // Prueba de recálculo de impuesto de matriculación para coche2
        coche2.setImpuestoMatriculacion();
        System.out.println("\n=== Coche 2 después de recalcular impuesto ===");
        System.out.println(coche2);
    }
}
