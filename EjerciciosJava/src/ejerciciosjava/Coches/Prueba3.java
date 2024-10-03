package ejerciciosjava.Coches;

public class Prueba3 {
    public static void main(String[] args) {
        CocheV2 cv2 = new CocheV2("MAZDA", "Rojo", 10000, 1.5, 2021);
        System.out.println(cv2.toString());
        cv2.anadirKm(10);
        System.out.println(cv2.toString());
        cv2.anadirKm(-10);
        System.out.println(cv2.toString());

    }
}
