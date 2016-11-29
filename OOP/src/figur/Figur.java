package figur;

public abstract class Figur {
    double x;
    double y;

    // абстрактный метод для вычисления площади
    public abstract double area();

    // абстрактный метод для перемещения
    public abstract void move(double step);

    // абстрактный метод для изменения размера
    public abstract void resize(double koef);

}
