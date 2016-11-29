package figur;

public class Square extends Figur {
    public double side;
    public Square(double coordX, double coordY, double side) {
        this.side = side;
        super.coordX = coordX;
        super.coordY = coordY;
    }
    // переопределяем метод вычисления прощади
    public double area() {
        return (side * side);
    }

    // переопределяем метод изменения размера
    public void resize(double koef) {
        side = side * koef;
    }

    @Override
    public String toString() {
        return "Square";
    }
}


