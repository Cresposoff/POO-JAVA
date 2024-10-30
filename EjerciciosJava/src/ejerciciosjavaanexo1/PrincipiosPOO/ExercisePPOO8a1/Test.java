package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a1;

public class Test {

    public static void main(String[] args) {
        // Crear instancias de Cuadrado y Rectangulo
        Cuadrado cuadrado1 = new Cuadrado("Cuadrado1", 0, 0, "Rojo", 5);
        Cuadrado cuadrado2 = new Cuadrado("Cuadrado2", 1, 1, "Azul", 6);
        Rectangulo rectangulo1 = new Rectangulo("Rectangulo1", 2, 2, "Verde", 4, 8);
        Rectangulo rectangulo2 = new Rectangulo("Rectangulo2", 3, 3, "Amarillo", 7, 3);

        // Crear un array con las formas
        Forma[] formas = { cuadrado1, cuadrado2, rectangulo1, rectangulo2 };

        // Mejora 1: Sumar áreas de todas las formas y media de áreas de los cuadrados
        double sumaAreas = 0;
        double sumaAreasCuadrados = 0;
        int contadorCuadrados = 0;

        for (Forma forma : formas) {
            sumaAreas += forma.calcularArea();
            if (forma instanceof Cuadrado) {
                sumaAreasCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        System.out.println("Suma de las áreas de todas las formas: " + sumaAreas);
        if (contadorCuadrados > 0) {
            System.out.println("Media de las áreas de los cuadrados: " + (sumaAreasCuadrados / contadorCuadrados));
        }

        // Mejora 3: Suma de perímetros de todas las formas (usando la interfaz IFormas)
        double sumaPerimetros = 0;
        for (Forma forma : formas) {
            if (forma instanceof IFormas) {
                sumaPerimetros += ((IFormas) forma).calcularPerimetro();
            }
        }

        System.out.println("Suma de los perímetros de todas las formas: " + sumaPerimetros);
    }

}
