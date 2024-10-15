package ejerciciosjavaanexo1.metodos.metodo12;

public class EjercicioMetodo12 {
    //Atributos

    //Métodos
    //Método para recibir tres valores int
    public double media(int numero1, int numero2, int numero3){
        //Hacemos una desición ya que el ejercicio dice que si uno de los tres valores es un número negativo, devolverá cero
        if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
            return 0;
        }
        double promedio = (numero1 + numero2 + numero3)/3;
        return promedio;
    }
}
