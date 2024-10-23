package ejerciciosjava.EvaP;

public class ProductosRefrigerados extends Producto implements IMuestraDatos {
    //Atributos
    private int codigo;
    private Double fechaEnvasado;
    private double tempManteni;
    private String pais;

    public ProductosRefrigerados(int fechaCaducidad, int lote, int codigo, Double fechaEnvasado, double tempManteni,
            String pais) {
        super(fechaCaducidad, lote);
        this.codigo = codigo;
        this.fechaEnvasado = fechaEnvasado;
        this.tempManteni = tempManteni;
        this.pais = pais;
    }

    public ProductosRefrigerados() {
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Double getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(Double fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public double getTempManteni() {
        return tempManteni;
    }
    public void setTempManteni(double tempManteni) {
        this.tempManteni = tempManteni;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ProductosRefrigerados [codigo=" + codigo + ", fechaEnvasado=" + fechaEnvasado + ", tempManteni="
                + tempManteni + ", pais=" + pais + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getLote()="
                + getLote() + ", getCodigo()=" + getCodigo() + ", getFechaEnvasado()=" + getFechaEnvasado()
                + ", getTempManteni()=" + getTempManteni() + ", getPais()=" + getPais() + "]";
    }

    @Override
    public boolean verificarFechaCaducidad(int fechaActual){
        System.out.println("Método desarrollado en ProductoRefrigerados");
        return false;
    }

    @Override
    public void muestraPais() {
        System.out.println("Pais de Productos refrigerados");
    }

    @Override
    public void muestraFechaCaducidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestraFechaCaducidad'");
    }
    
}
