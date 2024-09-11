package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author u20241221018 Jhoan Montealegre
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int precioAparato = 0;
        double descuentoAparato;
        int marca = 0;
        double precioFinal;
        boolean condition = true;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Para que el usuario inquieto porte seriedad con el programa (es ilógico ingresar precio GRATIS ó NEGATIVO).
        while (condition == true) {
            System.out.print("Ingrese el precio del aparato: U$");
            precioAparato = sc.nextInt();

            if (precioAparato <= 0){
                System.out.println("¡Error, no se procesan CERO ni NEGATIVOS precios!");
                
            } else {
                System.out.println("¡Exelente!");
                condition = false;
                
            }
        }
        condition = true;

        // Agregamos un while para que vuelva a preguntar cuando ingrese un valor no válido.
        while (condition == true) {
            System.out.println("La marca del aparato es NOSY? ");
            System.out.println("1. Sí");
            System.out.println("0. No");
            marca = sc.nextInt();

        // Agregamos esta desición con el fin de que el usuario tenga una mejor experiencia (en vez de escribir "Sí es marca NOSY" ó "Sí/No") solamente con la pregunta ya planteada selecciona un número respectivamente.
            if (marca == 1 || marca == 0) {
                System.out.println("¡Exelente!");
                condition = false;

            } else {
                System.out.println("Error, Ingrese un valor válido: 1 ó 0.");

            }
        }

        if (precioAparato >= 500 && precioAparato > 0 && marca == 1){
            //Al ver las diferencias entre los porcentajes, se operó "19$ - 10$ - 5$ = 4$" dando así "+4%" que debido a su signo, se sumaran al precioAparato para dar un precioFinal.
            descuentoAparato = precioAparato * (0.19 - 0.1 - 0.05);
            precioFinal = precioAparato + descuentoAparato;
            System.out.println("Como el aparato cuesta igual o más a U$500 y es marca NOSY. El precio final es de: U$"+precioFinal);
            
        } else if (precioAparato >= 500 && precioAparato > 0 && marca == 0){
            //Al ver las diferencias entre los porcentajes, se operó "19$ - 10$ = 9$" dando así "+9%" que debido a su signo, se sumaran al precioAparato para dar un precioFinal.
            descuentoAparato = precioAparato * (0.19 - 0.1);
            precioFinal = precioAparato + descuentoAparato;
            System.out.println("Como el aparato cuesta igual o más a U$500 y NO es marca NOSY. El precio final es de: U$"+precioFinal);

        } else if (precioAparato <= 500 && precioAparato > 0 && marca == 1){
            //Al ver las diferencias entre los porcentajes, se operó "19$ - 5$ = 14$" dando así "+14%" que debido a su signo, se sumaran al precioAparato para dar un precioFinal.
            descuentoAparato = precioAparato * (0.19 - 0.05);
            precioFinal = precioAparato + descuentoAparato;
            System.out.println("Como el aparato cuesta menos de U$500 y es marca NOSY. El precio final es de: U$"+precioFinal);

        } else if (precioAparato <= 500 && precioAparato > 0 && marca == 0){
            //Al ver las diferencias entre los porcentajes, se operó "19$ - 0$ = 19$" dando así "+19%" que debido a su signo, se sumaran al precioAparato para dar un precioFinal.
            descuentoAparato = precioAparato * (0.19 - 0);
            precioFinal = precioAparato + descuentoAparato;
            System.out.println("Como el aparato cuesta menos de U$500 y NO es marca NOSY. El precio final es de: U$"+precioFinal);

        }

    }
}
/**Pendiente:
 * Agregar gestión de cadenas.
 * Mirar si se puede mejorar las desiciones.
 * Agregar el vector (Array, donde guarde los porcentajes -> (19%), (10%), (5%)).
 * */