package ejerciciosjavaanexo1.metodos.metodo12;

public class EjercicioMetodo12Prueba {
    public static void main(String[] args) {
        int n1 = -5;
        int n2 = 10;
        int n3 = 15;

        //Creamos el objeto
        EjercicioMetodo12 print = new EjercicioMetodo12();

        //Llamamos los métodos
        System.out.println("La media de los tres valores enteros es de: "+print.media(n1, n2, n3));
    }
}
