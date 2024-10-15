package ejerciciosjavaanexo1.metodos.metodo10;

public class EjercicioMetodo10Prueba {
    public static void main(String[] args) {
        //Variables, las establecemos de una vez ya que el ejercicio no me pide que el usuario las ingrese por consola
        int n1 = 5;
        int n2 = 10;

        //Creamos el objeto
        EjercicioMetodo10 print = new EjercicioMetodo10();

        //Llamamos los métodos
        System.out.println("El mayor de los dos numeros es: "+print.darMayor(n1, n2));
    }
}
