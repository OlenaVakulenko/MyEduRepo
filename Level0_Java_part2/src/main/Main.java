package main;

import calculator.Arithmetic;

import java.util.Scanner;

public class Main {
    static String number;

    public static void main(String[] args) {
        // create Matrix

        Scanner in = new Scanner(System.in);
        while (number != "x") {
            System.out.println("Please enter number to create matrix or \"x\" to exit");
            number = in.nextLine();
            if (number.equals("x")) {
                break;
            }
            if (games.Matrix.validate(number)) {
                int[][] matrix = games.Matrix.createMatrix(Integer.parseInt(number));
                games.Matrix.visualizer(matrix);
            } else {
                System.out.println("Your input is incorrect. Please enter number to create matrix or \"x\" to exit");
            }
        }
        // Мультипликатор:
        Scanner inArithmetic = new Scanner(System.in);
        System.out.println("Пожалуйста, введите массив чисел через пробел");
        int[] newArray = new int[0];
        try {
            String line = in.nextLine();
            String[] forSplit = line.split(" ");
            int len = forSplit.length;
            newArray = new int[len];
            for (int i = 0; i < len; i++) {
                int element = Integer.parseInt(forSplit[i]);
                newArray[i] = element;
            }
        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
        System.out.println(Arithmetic.arrayMultiplication(newArray));
        Arithmetic.arrayMultiplication(newArray);
        // Возведение в степень
        System.out.println("Пожалуйста, введите число и спепень, в которую нужно возвести это число через пробел");
        try {
            System.out.println(Arithmetic.power(in.nextInt(), in.nextInt()));

        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
        // Деление
        System.out.println("Пожалуйста, введите делимое и делитель через пробел");
        try {
            System.out.println(Arithmetic.division(in.nextInt(), in.nextInt()));

        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
        // Корень
        System.out.println("Пожалуйста, введите число, от которого нужно вычислить квадратный корень");
        try {
            System.out.println(Arithmetic.root(in.nextInt()));

        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
        // Snail
        Scanner inSnail = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        String size = inSnail.nextLine();
        try {
            games.Snail.calculateSnail(Integer.parseInt(size));
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
        // Palindrom
        System.out.println("Пожалуйста, введите слово");
        Scanner inPalindrom = new Scanner(System.in);
        String word = inPalindrom.nextLine();
        if (games.Palindrom.checkWord(word)) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
        System.out.println("Пожалуйста, введите фразу");
        Scanner some = new Scanner(System.in);
        String phrase = some.nextLine();
        if (games.Palindrom.checkPhrase(phrase)) {
            System.out.println("Фраза является палиндромом");
        } else {
            System.out.println("Фраза не является палиндромом");
        }
    }
}


