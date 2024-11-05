package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a2;

/**
 * 
 * @author Cresposoff
 */

public class Test {
    
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado1 = new Empleado("Juan Perez", "12345678A", 25, true, 2500.0);
        System.out.println("=== Empleado ===");
        System.out.println(empleado1);

        // Aumentar el salario de empleado1 en un 10%
        empleado1.subirSalario(10);
        System.out.println("Salario después de subir un 10%: " + empleado1.getSalario());

        // Crear un objeto Programador
        Programador programador1 = new Programador("Ana Garcia", "87654321B", 30, false, 3000.0, 50, "Java");
        System.out.println("\n=== Programador ===");
        System.out.println(programador1);

        // Aumentar el salario de programador1 en un 15%
        programador1.subirSalario(15);
        System.out.println("Salario después de subir un 15%: " + programador1.getSalario());
    }

}
