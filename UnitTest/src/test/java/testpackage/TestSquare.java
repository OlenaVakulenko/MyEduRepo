package testpackage;

import figur.Circle;
import figur.Figur;
import figur.Square;
import org.junit.*;

/**
 * Created by olenka on 04.12.2016.
 */
public class TestSquare {

    public static Square square;

    @Before
    // создаем экземпляр квадрата
    public void createSquareInstance() {
        square = new Square(0, 0, 9);
    }

    @After
    // обнуляем экземпляр квадрата
    public void cleanUpObject() {
        square = null;
    }

    @Test
    // тест на вычисление площади квадрата
    public void checkSquareArea() {
        double area = square.area();
        Assert.assertEquals("We expected 81 but actual result is " + area, 81, area, 0.1);
    }

    @Test
    // тест на перемещение квадрата
    public void checkSquareMove() {
        square.move(1,2);
        double[] calcCoordinates = {square.coordX, square.coordY};
        double[] expCoordinates = {1,2};
        Assert.assertArrayEquals("Incorrect coordinates",expCoordinates,calcCoordinates,0.1);
    }

    @Test
    // тест на изменение размера квадрата
    public void checkResize() {
        square.resize(0.5);
        double side = square.side;
        Assert.assertEquals("Incorret side: " + side, 4.5, side, 0.1);
    }

    @Test
    // тест на то, что квадрат наследуется от фигуры
    public void squareIsInstanceOfFigure() {
        Assert.assertTrue(square instanceof Figur);
    }
}
