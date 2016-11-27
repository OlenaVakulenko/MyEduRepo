package games;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {

    public static int[][] createMatrix(int number) {
        int[][] matrixA = new int[number][number];
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                int filler = (number * row + (column + 1)) % 9;
                if (filler == 0) {
                    matrixA[row][column] = 9;
                } else {
                    matrixA[row][column] = filler;
                }
            }
        }
        return matrixA;
    };

    public static void visualizer(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.print("\n");
        }
    }
    public static boolean validate(String input) {
        Pattern p = Pattern.compile("[1-9]|x");
        Matcher m = p.matcher(input);
        return m.matches();
    }
}