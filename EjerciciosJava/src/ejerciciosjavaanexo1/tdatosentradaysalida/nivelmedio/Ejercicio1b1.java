package ejerciciosjavaanexo1.tdatosentradaysalida.nivelmedio;

public class Ejercicio1b1 {
    public static void main(String[] args) {
        int segundos = 3734;
        int horas = segundos / 3600;
        int minutos = (segundos % 3600)/60;
        int segundosRestantes = segundos % 60;
        System.out.println(segundos + " segundos son " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos");
    }
}
