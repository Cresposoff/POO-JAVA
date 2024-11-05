package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a3;

/**
 * 
 * @author Cresposoff
 */

public class Test {
    public static void main(String[] args) {
        // Crear un cliente
        Persona cliente1 = new Persona("Juan Perez", "12345678A");

        // Crear cuentas para el cliente
        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente1, 123456789L, 500);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente1, 987654321L, 100);

        // Pruebas de ingreso
        cuentaCorriente.ingresar(1000);
        cuentaAhorro.ingresar(500);
        System.out.println("=== Cuentas después de ingreso ===");
        System.out.println(cuentaCorriente);
        System.out.println(cuentaAhorro);

        // Pruebas de retiro
        cuentaCorriente.retirar(200);
        cuentaAhorro.retirar(50);
        System.out.println("\n=== Cuentas después de retiro válido ===");
        System.out.println(cuentaCorriente);
        System.out.println(cuentaAhorro);

        // Intento de retiro inválido (supera el límite)
        cuentaCorriente.retirar(600);
        cuentaAhorro.retirar(450); // superaría el saldo mínimo
        System.out.println("\n=== Cuentas después de intento de retiro inválido ===");
        System.out.println(cuentaCorriente);
        System.out.println(cuentaAhorro);
    }
}
