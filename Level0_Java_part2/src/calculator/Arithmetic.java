package calculator;

import java.util.Scanner;


import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 * Created by olenka on 19.11.2016.
 */
public class Arithmetic {

    public static void main (String[] args) {
        // Мультипликатор:
        Scanner in = new Scanner(System.in);
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
        System.out.println(arrayMultiplication(newArray));
        arrayMultiplication(newArray);
        // Возведение в степень
        System.out.println("Пожалуйста, введите число и спепень, в которую нужно возвести это число через пробел");
        try {
            System.out.println(power(in.nextInt(), in.nextInt()));

        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
        // Деление
        System.out.println("Пожалуйста, введите делимое и делитель через пробел");
        try {
            System.out.println(division(in.nextInt(), in.nextInt()));

        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
        // Корень
        System.out.println("Пожалуйста, введите число, от которого нужно вычислить квадратный корень");
        try {
            System.out.println(root(in.nextInt()));

        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
    }

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


