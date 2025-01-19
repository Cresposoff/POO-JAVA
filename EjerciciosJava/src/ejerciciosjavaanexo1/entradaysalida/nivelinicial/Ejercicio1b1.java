package ejerciciosjavaanexo1.entradaysalida.nivelinicial;

public class Ejercicio1b1 {
    public static void main(String[] args) {
        //Aun no lo desarollo, lo hizo la AI
        int segundos = 3734;
        int minutos = segundos / 60;
        segundos = segundos % 60;
        int horas = minutos / 60;
        minutos = minutos % 60;
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
}
