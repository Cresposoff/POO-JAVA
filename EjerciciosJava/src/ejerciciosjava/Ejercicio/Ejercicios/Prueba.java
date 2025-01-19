package ejerciciosjava.Ejercicio.Ejercicios;


/**
 *
 * @author u20241221018 Jhoan Montealegre
 */
public class Prueba {
    public static void main(String[] args) {

        int numportales = 3;
        int numplantas = 5;
        int numpuertas = 4;
        
        int[][][] vivienda = new int[numportales][numplantas][numpuertas];

        for (int por = 0; por < numportales; por++) { // Bucle de las portales
            for (int pla = 0; pla < numplantas; pla++) { // Bucle de las plantas
                for (int puer = 0; puer < numpuertas; puer++) { // Bucle de las puertas
                    System.out.println(vivienda[por][pla][puer]);
                    
                    }
                }
            }
    }
}
