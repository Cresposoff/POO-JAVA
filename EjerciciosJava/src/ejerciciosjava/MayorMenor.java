package ejerciciosjava;

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {

        // Declaramos las variables de número mayor, menor y donde se almacenará
        // el número que digitemos.

        // Adicional declaramos nuestro Scanner para capturar desde el teclado.
        int menor;
        int mayor;
        int num;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Pedimos el número y ese lo ponemos como mayor y como menor para posterior
        // poder realizar la comparación de si el número que ingresamos es mayor o
        // menor que los que hemos digitado
        System.out.println("Digite número: ");
        num = sc.nextInt();
        menor = num;
        mayor = num;

        // Ahora entramos en un for, la condición deberá ser la cantidad de números
        // total - 1 ya que ya ingresamos un número, si deseas ingresar 20 números
        // entonces la condición irá hasta 19 siempre y cuando la hagas como la tengo
        for (int i = 1; i <= 5; i++) {
            // Pedimos el número y lo capturamos en num
            System.out.println("Digite número: ");
            num = sc.nextInt();

            // Comparamos si num es mayor que el número mayor hasta el momento
            // y de ser así, entonces ese será el nuevo número mayor
            if (num > mayor) {
                mayor = num;
            }
            // Por el contrario si es menor que el número menor, será el nuevo menor
            if (num < menor) {
                menor = num;
            }
        }

        // Luego simplemente imprimimos el mayor y el menor
        System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
    }
}