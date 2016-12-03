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
        figur.Figur[] Figures = new figur.Figur[10];
        for (int i = 1; i < 11; i++) {
            int random = r.nextInt(3);
            double sideNew = side.nextInt(100);
            figur.Figur someFigure;
            switch (random) {
                case 1:
                    someFigure = new figur.Triangle(x.nextInt(100), x.nextInt(100), sideNew);
                    break;
                case 2:
                    someFigure = new figur.Square(x.nextInt(100), x.nextInt(100), sideNew);
                    break;
                default:
                    someFigure = new figur.Circle(x.nextInt(100), x.nextInt(100), sideNew);
                    break;
            }

            Random k = new Random();
            someFigure.resize(k.nextDouble());
            Figures[i - 1] = someFigure;
            }
        // Фигуры и площади до сортировки
        System.out.println("Фигуры и площади до сорторовки");
        for (int step = 0; step < Figures.length - 1; step++) {
            System.out.println(Figures[step]);
            System.out.println(Figures[step].area());
        }
        bubbleSort(Figures);
        // Фигуры и площади после сортировки
        System.out.println("Фигуры и площади после сорторовки");
        for (int step = 0; step < Figures.length - 1; step++) {
            System.out.println(Figures[step]);
            System.out.println(Figures[step].area());
        }

    }


    public static void bubbleSort(figur.Figur[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].area() > arr[j + 1].area()) {
                    figur.Figur tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

