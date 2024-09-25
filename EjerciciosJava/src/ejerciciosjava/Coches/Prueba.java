package ejerciciosjava.Coches;

public class Prueba {
    public static void main(String[] args) {
        // Clase variable = new constructor;
        Coche minCoche = new Coche();
        minCoche.marca="Chevrolet";
        minCoche.color="Negro";
        minCoche.cilindrada=2500;
        minCoche.matricula="XYZ890";

        System.out.println("Marca: "+minCoche.marca);
        minCoche.decirSiEsMetalizado();
        System.out.println("Cilindrada: "+minCoche.decirCilindrada());
        System.out.println("Color Inicial : "+minCoche.color);
        minCoche.cambiarColor("Red");
        System.out.println("Color Actualizado : "+minCoche.color);

    }
}
