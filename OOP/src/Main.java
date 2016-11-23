import org.omg.CORBA.Object;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by olenka on 22.11.2016.
 */
//abstract class Figur implements Comparable<Figur> {
abstract class Figur {
    double x;
    double y;

    // абстрактный метод для вычисления площади
    abstract double area();

    // абстрактный метод для перемещения
    abstract void move(double step);

    // абстрактный метод для изменения размера
    abstract void resize(double koef);

//    public int compareTo(Object obj)
//    {
//        Figur tmp = (Figur) obj;
//        if(this.area() < tmp.area())
//        {
//      /* текущее меньше полученного */
//            return -1;
//        }
//        else if(this.area() > tmp.area())
//        {
//      /* текущее больше полученного */
//            return 1;
//        }
//    /* текущее равно полученному */
//        return 0;
//    }

}

// Клас Треугольник
class Triangle extends Figur {
    double side;

    Triangle(double x, double y, double side) {
        this.side = side;
        super.x = x;
        super.y = y;
    }

    // переопределяем метод вычисления прощади
    double area() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    // переопределяем метод перемещения
    void move(double step) {
        x = x + step;
    }

    // переопределяем метод изменения размера
    void resize(double koef) {
        side = side * koef;
    }
}

class Square extends Figur {
    double side;
    Square(double x, double y, double side) {
        this.side = side;
        super.x = x;
        super.y = y;
    }
    // переопределяем метод вычисления прощади
    double area() {
        return (side * side);
    }
    // переопределяем метод перемещения
    void move(double step) {
        x = x + step;
    }
    // переопределяем метод изменения размера
    void resize(double koef) {
        side = side * koef;
    }
}

class Circle extends Figur {
    double radius;
    Circle (double x, double y, double radius) {
        this.radius = radius;
        super.x = x;
        super.y = y;
    }
    // переопределяем метод вычисления прощади
    double area() {
        return Math.PI * radius * radius;
    }
    // переопределяем метод перемещения
    void move(double step) {
        x = x + step;
    }
    // переопределяем метод изменения размера
    void resize(double koef) {
        radius = radius * koef;
    }
}

public class Main {
    public static void main(String args[]) {
        Random r = new Random();
        Random x = new Random();
        Random side = new Random();
        int random = r.nextInt(3);
        Figur[] Figures = new Figur[10];
        double Areas[] = new double[10];
        for (int i = 1; i < 11; i++) {
            Figur a;
            switch (random) {
                case 1:
                    a = new Triangle(x.nextInt(100), x.nextInt(100), side.nextInt(100));
                    break;
                case 2:
                    a = new Square(x.nextInt(100), x.nextInt(100), side.nextInt(100));
                    break;
                default:
                    a = new Circle(x.nextInt(100), x.nextInt(100), side.nextInt(100));
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
    //Arrays.sort(Figures);
    // to do

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

