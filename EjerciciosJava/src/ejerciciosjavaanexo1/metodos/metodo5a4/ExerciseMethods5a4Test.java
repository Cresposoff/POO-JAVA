package ejerciciosjavaanexo1.metodos.metodo5a4;

public class ExerciseMethods5a4Test {
    public static void main(String[] args) {
        //Creamos el objeto
        ExerciseMethods5a4 frase = new ExerciseMethods5a4();

        //Llamamos el método
        System.out.println("La frase ingresada es: "+frase.pedirFrase());
    }
}
//MEJORA 1: El método sí recibe un parámetro, un String, que se escribe por consola antes de la petición de la cadena, como una pregunta al usuario del tipo de información que nos va a pedir