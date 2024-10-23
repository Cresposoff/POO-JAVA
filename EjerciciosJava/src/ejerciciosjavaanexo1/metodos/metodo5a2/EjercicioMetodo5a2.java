package ejerciciosjavaanexo1.metodos.metodo5a2;

public class EjercicioMetodo5a2 {
    //Atributos

    //Métodos
    //Método para calcular el precio más iva de un producto
    public double calcularPrecio(int preciobase, int porceniva){
        if (preciobase > 0 && porceniva > 0) {
            //Tocó hacer un casting con la variable porceniva porque el método recibe un int y creo que al dividirlo entre 100 daba solo el entero cero sin sus decimales
            double precioFinal = preciobase * (1 + ((double) porceniva / 100));
            return precioFinal;
        } else {
            return (int) -1;
        }
    }
}
