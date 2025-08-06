package ejerciciosjavaanexo1.arrays;

public class PruebaOrdenamientoMatrizBurbuja {
    public static void main(String[] args) {
        int[][] mat = {{14, 7, 23, 45}, {33, 2, 11, 4}, {8, 1, 99, 45}};
        int n = mat.length;
        int m = mat[0].length;
        int t;
        for (int i = 0; i < n; i++) {//ordena la matriz de arriba hacia abajo
            for (int j = 0; j < m; j++) {
                for (int x = 0; x < n; x++) {
                    for (int y = 0; y < m; y++) {
                        if (mat[i][j] < mat[x][y]) {
                            t = mat[i][j];
                            mat[i][j] = mat[x][y];
                            mat[x][y] = t;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {// pinta la matriz
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
}