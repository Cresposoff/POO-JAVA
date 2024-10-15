package ejerciciosjavaanexo1.metodos.metodo11;

public class EjercicioMetodo11Prueba {
    public static void main(String[] args) {
        //Variables, las establecemos de una vez ya que el ejercicio no me pide que el usuario las ingrese por consola
        int n1 = 5;
        double n2 = 10.5;

        //Creamos el objeto
        EjercicioMetodo11 print = new EjercicioMetodo11();

        //Llamamos los métodos
        System.out.println("La suma de los dos valores es de: "+print.darSuma(n1, n2));
    }
}
