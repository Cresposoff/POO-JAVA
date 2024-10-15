package ejerciciosjavaanexo1.metodos.metodo5a1;

import java.util.Scanner;

public class ExerciseMethods5a1Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio del circulo: ");
        int radio = sc.nextInt();
        System.out.println("Ingrese opción: a. ÁREA DEL CIRCULO c. LONGITUD DE CIRCUNFERENCIA");
        String opcion = sc.nextLine();

        //Creamos el objeto
        EjercicioMetodo5a1 calcular = new EjercicioMetodo5a1();

        //Llamamos el método
        calcular.areaCirculo(radio, opcion);
    }
}
