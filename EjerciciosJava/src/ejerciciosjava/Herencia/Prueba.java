package ejerciciosjava.Herencia;

public class Prueba {
    public static void main(String[] args) {
        Coche coche = new Coche("Nissan", "Rojo", 4);
        System.out.println(coche.toString());
        coche.pintar("Azul");
        System.out.println(coche.toString());

    }
}
