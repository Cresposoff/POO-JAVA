package ejerciciosjavaanexo1.tdatosentradaysalida.nivelalto;

import java.util.Scanner;

public class Ejercicio1c3 {
    public static void main(String[] args) {
        //Suponiendo que se vive en un planeta remoto donde todos los meses del año tienen 30 días
        final int DIAS_ANIO = 360;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de mes (1 - 12): ");
        int mes = sc.nextInt();
        System.out.print("\nIngrese el número de día (1 - 30): ");
        int dia = sc.nextInt();
        //mes - 1 porque en enero si se multiplica por 30 serían ya fechas de Febrero
        int diasFaltantesNocheVieja = DIAS_ANIO - ((mes-1) * 30 + dia);
        System.out.println("\nfaltan " + diasFaltantesNocheVieja + " para Noche Vieja.");

    }

}
