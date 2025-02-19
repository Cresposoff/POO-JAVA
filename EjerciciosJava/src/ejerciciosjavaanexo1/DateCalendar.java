package ejerciciosjavaanexo1;

import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
    public static void main(String[] args) {
        Date hoy = Calendar.getInstance().getTime();
        // con DATE
        // =======================================
        System.out.println("--------------fechas");
        System.out.println(hoy);
        System.out.printf("%tT \n", hoy); // ESCRIBE LA HORA CON FORMATO HH:MM:SS
        System.out.printf("%tD \n", hoy); // ESCRIBE LA FECHA CON FORMATO MM/DD/AA
        System.out.printf("%tH \n", hoy); // ESCRIBE SOLO LA HORA (NI MINUTOS NI SEGUNDOS)
        System.out.printf("%tM \n", hoy); // ESCRIBE SOLO MINUTOS
        System.out.printf("%tS \n", hoy); // ESCRIBE SOLO SEGUNDOS
        System.out.printf("%tp \n", hoy); // ESCRIBE AM O PM
        System.out.printf("%tL \n", hoy); // ESCRIBE LOS MILISEGUNDOS
        System.out.printf("%tN \n", hoy); // ESCRIBE LOS NANOSEGUNDOS
        System.out.printf("%td \n", hoy); // ESCRIBE DIA CON DOS DIGITOS
        System.out.printf("%tm \n", hoy); // ESCRIBE MES CON DOS DIGITOS
        System.out.printf("%tB \n", hoy); // ESCRIBE MES CON LETRAS
        System.out.printf("%ty \n", hoy); // ESCRIBE AÑOS CON DOS DIGITOS
        System.out.printf("%tY \n", hoy); // ESCRIBE AÑOS CON CUATRO DIGITOS
    }
}
