package ejerciciosjavaanexo1;

public class EjercicioArray3 {
    public static void main(String[] args) {
        int[] vectorDeDatos = { 8, 2, 5, 4, 9, 1, 0, 8, 9, 3 };
        for (int i = 0; i < vectorDeDatos.length; i++) {
            //esto es la modificacion para posicion (idice) impar
            if (i % 2 == 0) {
            } else {
                System.out.println(vectorDeDatos[i]);
            }
        }
    }
}
