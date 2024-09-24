package ejerciciosjavaanexo1;

public class EjercicioArray2 {
    public static void main(String[] args) {
        int[] vectorDeDatos = { 8, 2, 5, 4, 9, 1, 0, 8, 9, 3 };
        int contador = 0;
        for (int i = 0; i < vectorDeDatos.length; i++) {
            if (vectorDeDatos[i] % 2 == 0) {
                contador++;
            }
        }
        
        // Imprimimos la cantidad de pares que hay en el arreglo más no cuáles son.
        // Por eso dentro de la condición hay es un contador que suma uno cuando es par 
        // y no un sout para que imprima ese número si es par
        System.out.println(contador);
        
    }
}
