package figur;

public class Circle extends Figur {
    double radius;
    public Circle (double x, double y, double radius) {
        this.radius = radius;
        super.x = x;
        super.y = y;
    }
    // переопределяем метод вычисления прощади
    public double area() {
        return Math.PI * radius * radius;
    }
    // переопределяем метод перемещения
    public void move(double step) {
        x = x + step;
    }
    // переопределяем метод изменения размера
    public void resize(double koef) {
        radius = radius * koef;
    }
}