package ejerciciosjava;

import java.util.Scanner;

public class CentralDeAbastos {
    public static void main(String[] args) {
        int tipoDeServicio;
        int tipoDeProducto;
        double pesoTransportado;
        int tiempoPermanencia;
        double largoCamion;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de servicio: 1. Cargue ó 2. Descargue");
        tipoDeServicio = sc.nextInt();
        System.out.println("Ingrese el tipo de producto: 1. Perecedero ó 2. No perecedero");
        tipoDeProducto = sc.nextInt();
        System.out.println("Ingrese el peso transportado: (Toneladas)");
        pesoTransportado = sc.nextDouble();
        System.out.println("Ingrese el tiempo de permanencia: (horas completas (número entero))");
        tiempoPermanencia = sc.nextInt();
        System.out.println("Ingrese el largo del camión: (Metros)");
        largoCamion = sc.nextDouble();
        double datos [][] = new double[3][5];
        datos [0][0] = tipoDeServicio;
        datos [0][1] = tipoDeProducto;
        datos [0][2] = pesoTransportado;
        datos [0][3] = tiempoPermanencia;
        datos [0][4] = pesoTransportado;
        // hacer solo si es de carga o descarga, de ahí se van pidiendo solo los valores necesarios (por ejemplo: para el de carga no se necesita saber el peso(el peso solo lo necesita el de descarga))
        if (tipoDeServicio == 1 && tiempoPermanencia <= 2 ) {
            System.out.println("Como entró a cargar y solo lleva 2 horas o menos entonces es gratis: ");
        } else if (tipoDeServicio == 1 && tiempoPermanencia > 2 && largoCamion > 4) {
            double tiempoPermanenciaExtra = tiempoPermanencia - 2;
            double precioParqueadero = tiempoPermanenciaExtra * 4000 * 1.25;
            System.out.println("Como entró a cargar y de tiempo estuvo "+tiempoPermanencia+" horas, y el largo del camión es de: "+largoCamion+"cm, entonces el cobro es de: $"+precioParqueadero);
        } else if (tipoDeProducto == 1 && tiempoPermanencia > 2 && largoCamion <= 4) {
            double tiempoPermanenciaExtra = tiempoPermanencia - 2;
            double precioParqueadero = tiempoPermanenciaExtra * 4000;
            System.out.println("Como entró a cargar y de tiempo estuvo "+tiempoPermanencia+" horas, y el largo del camión es de: "+largoCamion+"cm, entonces el cobro es de: $"+precioParqueadero);
        }

    }
}
