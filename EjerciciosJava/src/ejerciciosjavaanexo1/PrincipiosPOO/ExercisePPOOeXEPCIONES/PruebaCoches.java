package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOOeXEPCIONES;

public class PruebaCoches {
    public static void main(String[] args) {
        Coche c = new Coche("OPEL", "INSIGNIA");
        try{
            c.acelerar(180);
        } catch (ExcesoVelocidadException e) {
            System.out.println(e.getMessage());
        }
    }
}
