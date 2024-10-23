package ejerciciosjava.EvaP;

public class Test {
    public static void main(String[] args) {
        ProductoFrescos pf = new ProductoFrescos();
        ProductosRefrigerados pr = new ProductosRefrigerados();


        pf.muestraPais();
        pr.muestraPais();

        Producto listaProducto [] = new Producto[4];
        listaProducto[0] = pf;
        listaProducto[1] = pr;
        listaProducto[2] = pf;
        listaProducto[3] = pr;

        for (int i = 0; i < listaProducto.length; i++) {
            listaProducto[i].muestraPais();
        }
    }
}
