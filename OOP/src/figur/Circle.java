package figur;

public class Circle extends Figur {
    public double radius;
    public Circle (double coordX, double coordY, double radius) {
        this.radius = radius;
        super.coordX = coordX;
        super.coordY = coordY;
    }

    // переопределяем метод вычисления прощади
    public double area() {
        return Math.PI * radius * radius;
    }

    // переопределяем метод изменения размера
    public void resize(double koef) {
        radius = radius * koef;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}