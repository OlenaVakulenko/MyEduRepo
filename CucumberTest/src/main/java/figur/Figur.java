package figur;

public abstract class Figur {
    public double coordX;
    public double coordY;

    // абстрактный метод для вычисления площади
    public abstract double area();

    // метод для перемещения
    public void move(double stepX, double stepY) {
        coordX = coordX+ stepX;
        coordY = coordY + stepY;
    }

    // абстрактный метод для изменения размера
    public abstract void resize(double koef);

   }
