package figur;

public class Square extends Figur {
    double side;
    public Square(double x, double y, double side) {
        this.side = side;
        super.x = x;
        super.y = y;
    }
    // переопределяем метод вычисления прощади
    public double area() {
        return (side * side);
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


