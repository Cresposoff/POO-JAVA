package ejerciciosjavaanexo1.metodos.metodo5a1;

public class EjercicioMetodo5a1 {
    //Atributos

    //Métodos
    //Método para recibir un valor double y otro tipo String
    public double areaCirculo(int radio, String opcion){
        if (opcion.equalsIgnoreCase("a")) {
            double area = 3.14 * (radio ^ 2);
            System.out.println("El área del círculo es de: "+area);
            return area;
        } else if (opcion.equalsIgnoreCase("c")) {
            double longitud = 2 * 3.14 * radio;
            System.out.println("La longitud de la circunferencia es de: "+longitud);
            return longitud;
        }
        System.out.println("No se ingresó una opción válida");
        return 0;
    }
}
