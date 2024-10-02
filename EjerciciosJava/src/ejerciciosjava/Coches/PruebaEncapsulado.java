package ejerciciosjava.Coches;

public class PruebaEncapsulado {
    public static void main(String[] args) {
        CocheEncapsulado ce = new CocheEncapsulado();
        //ce.marca = "BYD";

        ce.setMarca("BYD");
        System.out.println("Marca: "+ ce.getMarca());
    }
}
