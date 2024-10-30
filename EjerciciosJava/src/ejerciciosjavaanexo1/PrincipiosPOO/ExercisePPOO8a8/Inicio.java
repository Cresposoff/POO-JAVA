package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a8;

public class Inicio {
    public static void main(String[] args) {
        Math2 math2 = new Math2();

        int[] intArray = {3, 5, -2, 9, 7};
        double[] doubleArray = {3.5, 5.2, -2.3, 9.8, 7.4};

        // Prueba de métodos con int[]
        System.out.println("Array de int: ");
        System.out.print("Valores: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nMínimo de intArray: " + math2.min(intArray));
        System.out.println("Máximo de intArray: " + math2.max(intArray));

        // Prueba de métodos con double[]
        System.out.println("\nArray de double: ");
        System.out.print("Valores: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nMínimo de doubleArray: " + math2.min(doubleArray));
        System.out.println("Máximo de doubleArray: " + math2.max(doubleArray));
    }
}
