package ejerciciosjava.Ejercicio;

public class Persona {
    private String nombre;
    private int nif;
    public Persona(String nombre, int nif) {
        this.nombre = nombre;
        this.nif = nif;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNif() {
        return nif;
    }
    public void setNif(int nif) {
        this.nif = nif;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", nif=" + nif + "]";
    }
    
    
}
