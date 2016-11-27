package calculator;

/**
 * Created by olenka on 19.11.2016.
 */
public class Arithmetic {

    public static int arrayMultiplication(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result = result * array[i];
        }
        return result;
    }

    public static double power (double base, double exp) {
        return Math.pow(base, exp);
       }

    public static double division (double base, double div) {
        return base / div;
    }

    public static double root (double base) {
        return Math.sqrt(base);
    }

};


