package games;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static String number;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (number != "x") {
            System.out.println("Please enter number to create matrix or \"x\" to exit");
            number = in.nextLine();
            if (number.equals("x")) {
                break;
            }
            if (validate(number)) {
                int[][] matrix = Matrix.createMatrix(Integer.parseInt(number));
                Matrix.visualizer(matrix);
            } else {
                System.out.println("Your input is incorrect. Please enter number to create matrix or \"x\" to exit");
            }
        }
    };

    static boolean validate(String input) {
        Pattern p = Pattern.compile("[1-9]|x");
        Matcher m = p.matcher(input);
        return m.matches();
    }
};

class Matrix {

    public static void main(String[] args) {
        visualizer(createMatrix(5));
    }

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

    static void visualizer(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.print("\n");
        }
    }

}
