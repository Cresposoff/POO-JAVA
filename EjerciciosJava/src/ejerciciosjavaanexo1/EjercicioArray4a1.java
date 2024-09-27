package ejerciciosjavaanexo1;

public class EjercicioArray4a1 {
    public static void main(String[] args) {
        int[] miarray = {8,2,5,4,9,1,0,8,9,3};
        // "el elemento 1 de copiadedatos es 10”
        int[] copiaDeDatos = new int[miarray.length];
        for (int i = 0; i < miarray.length; i++) {
            copiaDeDatos[i] = miarray[i] + 2;
            System.out.println("el elemento "+(i+1)+" de copiaDeDatos es "+copiaDeDatos[i]);
        }
    }
}
