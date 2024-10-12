package ejerciciosjavaanexo1.metodos.metodo3;

public class EjercicioMetodo3 {
    //Atributos
    int [] miArray = new int[5];

    //Métodos
    //Método para crear el array y rellenar el array de valores aleatorios
    public void crearArray(){
        for (int i = 0; i < miArray.length; i++) {
            //Pusimos aleatorios del 1 al 10 incluyendolos
            miArray[i] = (int) (Math.random()* 10 + 1);
        }
    }

    //Método para escribir los valores del array por consola
    public void rellenarAleatorio(){
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("El valor del elemento "+(i+1)+" es de: "+miArray[i]);    
        }
    }
}
