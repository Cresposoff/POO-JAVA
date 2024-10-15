package ejerciciosjavaanexo1.metodos.metodo5a1;

public class EjercicioMetodo5a1 {
    //Atributos

    //Métodos
    //Método para recibir un valor double y otro tipo String
    public double areaCirculo(int radio, String opcion){
        if (opcion.equalsIgnoreCase("a")) {
            double area = 3.14 * (radio * radio);
            System.out.println("el radio del círculo es de: "+area);
            return area;
        } else if (opcion.equalsIgnoreCase("c")) {
            double longitud = 5;
            System.out.println("La longitud de la circunferencia es de: "+longitud);
            return longitud;
        }
    }
}
