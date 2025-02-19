package ejerciciosjavaanexo1.tdatosentradaysalida.nivelalto;

public class Ejercicio1c2 {
    public static void main(String[] args) {
        int caracter = (int) (Math.random() * (125 - 32 + 1) + 32);
        if (caracter <= 90 && caracter >= 65) {
            System.out.println("Letra mayuscula: \"" + (char) caracter + "\"");
        } else if (caracter <= 122 && caracter >= 97) {
            System.out.println("Letra minuscula: \"" + (char) caracter + "\"");
        } else {
            System.out.println("\"" + (char) caracter + "\" no es una letra");
        }
    }
}
