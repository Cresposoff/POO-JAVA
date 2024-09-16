package ejerciciosjava;

public class MetodoGetChars {
    public static void main(String[] args) {
        String s = "Esto no es una canción";
        char buf[] = new char[5];
        s.getChars(4, 9, buf, 0);
        System.out.println(buf);
    }
}
