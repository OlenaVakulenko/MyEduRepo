package main;

import java.util.Random;

/**
 * Created by olenka on 22.11.2016.
 */

public class Main {
    public static void main(String args[]) {
        Random r = new Random();
        Random x = new Random();
        Random side = new Random();
        int random = r.nextInt(3);
        figur.Figur[] Figures = new figur.Figur[10];
        double Areas[] = new double[10];
        for (int i = 1; i < 11; i++) {
            figur.Figur a;
            switch (random) {
                case 1:
                    a = new figur.Triangle(x.nextInt(100), x.nextInt(100), side.nextInt(100));
                    break;
                case 2:
                    a = new figur.Square(x.nextInt(100), x.nextInt(100), side.nextInt(100));
                    break;
                default:
                    a = new figur.Circle(x.nextInt(100), x.nextInt(100), side.nextInt(100));
                    break;
            }
            Random k = new Random();
            a.resize(k.nextDouble());
            double area = a.area();
            Figures[i - 1] = a;
            Areas[i - 1] = area;
            bubbleSort(Areas);
        }
    }

    public static void bubbleSort(double[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

