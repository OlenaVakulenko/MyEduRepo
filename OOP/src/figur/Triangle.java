package figur;

public class Triangle extends Figur {
    double side;

    public Triangle(double x, double y, double side) {
        this.side = side;
        super.x = x;
        super.y = y;
    }

    // переопределяем метод вычисления прощади
    public double area() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    // переопределяем метод перемещения
    public void move(double step) {
        x = x + step;
    }

    // переопределяем метод изменения размера
    public void resize(double koef) {
        side = side * koef;
    }
}

