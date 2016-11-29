package figur;

// Треугольник равносторонний, для упрощения
public class Triangle extends Figur {
    public double side;

    public Triangle(double coordX, double coordY, double side) {
        this.side = side;
        super.coordX = coordX;
        super.coordY = coordY;
    }

    // переопределяем метод вычисления прощади
    public double area() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    // переопределяем метод изменения размера
    public void resize(double koef) {
        side = side * koef;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}

