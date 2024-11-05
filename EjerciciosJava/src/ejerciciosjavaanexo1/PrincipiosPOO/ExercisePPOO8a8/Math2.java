package ejerciciosjavaanexo1.PrincipiosPOO.ExercisePPOO8a8;

/**
 * 
 * @author Cresposoff
 */

public class Math2 implements IExtremos {

    @Override
    public int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min = a[0];
        for (int value : a) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max = a[0];
        for (int value : a) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public double min(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double min = a[0];
        for (double value : a) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public double max(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double max = a[0];
        for (double value : a) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
