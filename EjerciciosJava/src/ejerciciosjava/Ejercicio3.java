package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author u20241221018 Jhoan Montealegre
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int precioAparato = 0;
        double precioAparatoConIva;
        double descuentoAparato;
        String marca = "Inicializada";
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

        // Agregamos un while para que vuelva a preguntar cuando ingrese un valor no válido (que no sea tipo String o que no sea ni si ni no).
        while (condition == true) {
            System.out.println("La marca del aparato es NOSY? ");
            marca = sc.nextLine();

        // Agregamos esta desición con el fin de que el usuario tenga una mejor experiencia (en vez de escribir "Sí es marca NOSY" ó "nosy") solamente con la pregunta ya planteada si/no.
            if (marca.equalsIgnoreCase("si") || marca.equalsIgnoreCase("no")) {
                System.out.println("¡Exelente!");
                condition = false;

            } else {
                System.out.println("Error, Ingrese un valor válido: si ó no.");

            }
        }

        precioAparatoConIva = (precioAparato * 0.19) + precioAparato;
        if (precioAparato >= 500 && precioAparato > 0 && marca.equalsIgnoreCase("si")){
            descuentoAparato = ((precioAparatoConIva - (precioAparato * 0.1)) * 0.05);
            precioFinal = (precioAparatoConIva - (precioAparato * 0.1)) - descuentoAparato;
            System.out.println("Como el aparato cuesta igual o más a U$500 y es marca NOSY. El precio final es de: U$"+precioFinal);
            
        } else if (precioAparato >= 500 && precioAparato > 0 && marca.equalsIgnoreCase("no")){
            descuentoAparato = (precioAparatoConIva - (precioAparato * 0.1));
            precioFinal = descuentoAparato;
            System.out.println("Como el aparato cuesta igual o más a U$500 y NO es marca NOSY. El precio final es de: U$"+precioFinal);

        } else if (precioAparato <= 500 && precioAparato > 0 && marca.equalsIgnoreCase("si")){
            descuentoAparato = (precioAparatoConIva * 0.05);
            precioFinal = precioAparatoConIva - descuentoAparato;
            System.out.println("Como el aparato cuesta menos de U$500 y es marca NOSY. El precio final es de: U$"+precioFinal);

        } else if (precioAparato <= 500 && precioAparato > 0 && marca.equalsIgnoreCase("no")){
            descuentoAparato = precioAparatoConIva;
            precioFinal = descuentoAparato;
            System.out.println("Como el aparato cuesta menos de U$500 y NO es marca NOSY. El precio final es de: U$"+precioFinal);

        }
    }
}

/**Pendiente:
 * Mirar si se puede mejorar las desiciones.
 * Agregar el vector (Array, donde guarde los porcentajes -> (19%), (10%), (5%)).
 * */