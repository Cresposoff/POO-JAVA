package ejerciciosjavaanexo1.PrincipiosPOOEJER.Ejercicio5;

public class TrianguloIsosceles {
    //Atriutos
    private double base;
    private double lado;

    //Constructor
    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro() {
        return base + (2 * lado);
    }

    public double obtenerArea() {
        return (base * Math.sqrt((lado * lado) - ((base * base)/4))) / 2;
    }

    // Método para que me retorne el indice del array de triángulos osea array de objetos t
    // Para decidir qué triángulo tiene más área
    public static Double mayorArea(TrianguloIsosceles t[]) {

        double area = t[0].obtenerArea();

        for (int i = 1; i < t.length; i++) {
            if (t[i].obtenerArea() > area) {
                area = t[i].obtenerArea();

            }
        }
        return area;
    }

    
}
