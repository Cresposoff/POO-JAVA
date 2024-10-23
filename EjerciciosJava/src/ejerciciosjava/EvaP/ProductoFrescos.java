package ejerciciosjava.EvaP;

public class ProductoFrescos extends Producto implements IMuestraDatos {
    private int fechaEnvasado;
    private String pais;

    public ProductoFrescos(int fechaCaducidad, int lote, int fechaEnvasado, String pais) {
        super(fechaCaducidad, lote);
        this.fechaEnvasado = fechaEnvasado;
        this.pais = pais;
    }

    public ProductoFrescos() {

    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", pais=" + pais + ", getFechaCaducidad()="
                + getFechaCaducidad() + ", getLote()=" + getLote() + ", getFechaEnvasado()=" + getFechaEnvasado()
                + ", getPais()=" + getPais() + "]";
    }

    @Override
    public boolean verificarFechaCaducidad(int fechaActual){
        System.out.println("Método desarrollado en ProductoFresco");
        return false;
    }

    @Override
    public void muestraPais() {
        System.out.println("Pais de Productos frescos");
    }

    @Override
    public void muestraFechaCaducidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestraFechaCaducidad'");
    }

}
