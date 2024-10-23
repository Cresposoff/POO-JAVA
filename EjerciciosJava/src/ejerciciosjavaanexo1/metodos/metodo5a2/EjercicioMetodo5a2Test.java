package ejerciciosjavaanexo1.metodos.metodo5a2;

public class EjercicioMetodo5a2Test {
    public static void main(String[] args) {
        int _preciobase = -100;
        int _porceniva = 19;

        //Creamos el objeto
        EjercicioMetodo5a2 calcularConIva = new EjercicioMetodo5a2();

        //Llamamos al método
        //Falta hacer que sirvan para algo las variables de retorno porque todo lo imprimí dentro del método
        //Y Falta devolver el valor de -1 cuando se ingresó un valor no válido
        if (_preciobase > 0 && _porceniva > 0) {
            System.out.println("El precio con IVA es de: "+calcularConIva.calcularPrecio(_preciobase, _porceniva));
        } else {
            System.out.println("No se ingresó un valor válido: "+(int) calcularConIva.calcularPrecio(_preciobase, _porceniva));
        }
    }
}
