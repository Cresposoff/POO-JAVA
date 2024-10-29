package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

public class Test {
    public static void main(String[] args) {
        //probar las subclases Triangulo y Cuadrado
        //Forma f = new Forma("Forma", 0, 0, "rojo");
        Cuadrado c = new Cuadrado("Cuadrado", 0, 0, "azul", 10);
        Triangulo t = new Triangulo("Triangulo", 0, 0, "verde", 10, 10);

        /**Llamamos a los métodos de la clase Forma
        System.out.println("El nombre del Forma es: "+f.getNombre());
        System.out.println("La posiciónX del Forma es: "+f.getPosicionX());
        System.out.println("La posiciónY del Forma es: "+f.getPosicionY());
        System.out.println("El color del Forma es: "+f.getColor());
        **/

        //LLamamos a los métodos de las subclases
        System.out.println("El área del Triángulo es: "+t.calcularArea());
        System.out.println("El perímetro del Triángulo es: "+t.calcularPerimetro());
        System.out.println("El área del Cuadrado es: "+c.calcularArea());
        System.out.println("El perímetro del Cuadrado es: "+c.calcularPerimetro());
    }
}
