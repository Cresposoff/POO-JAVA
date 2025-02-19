package ejerciciosjavaanexo1.tdatosentradaysalida.nivelinicial;

public class Ejercicio1a5 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (90 - 65 + 1) + 65);
        int b = (int) (Math.random() * (90 - 65 + 1) + 65);
        int c = (int) (Math.random() * (90 - 65 + 1) + 65);
        //Estaba ensayando el printf también llamado format y necesitaba tener una guía del orden para al final verificar
        System.out.println(a + " " + b + " " + c);
        System.out.printf("El primer número aleatorio es: %2$d\nEl segundo número aleatorio es: %3$d\nEl tercer número aleatorio es: %1$d\n", c, a, b);
    }
}