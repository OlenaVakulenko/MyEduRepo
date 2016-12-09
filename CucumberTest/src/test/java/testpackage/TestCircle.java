package testpackage;

import org.junit.*;
import figur.*;

/**
 * Created by olenka on 03.12.2016.
 */
public class TestCircle {

    public static Circle circle;

    @Before
    // создаем экземпляр круга
    public void createCircleInstance() {
        circle = new Circle(0, 0, 9);
    }

    @After
    //очищаем экземпляр круга
    public void cleanUpObject() {
        circle = null;
    }

    @Test
    // проверка метода вычисления площади
    public void checkCircleArea() {
        double circleArea = circle.area();
        Assert.assertEquals("We expected 254.34 but actual result is " + circleArea, 254.34, circleArea, 0.2);
    }

    @Test
    // проверка метода перемещения
    public void checkCircleMove() {
        circle.move(1,2);
        double[] calcCoordinates = {circle.coordX, circle.coordY};
        double[] expCoordinates = {1,2};
        Assert.assertArrayEquals("Incorrect coordinates",expCoordinates,calcCoordinates,0.1);
    }

    @Test
    // проверка метода изменения размера
    public void checkCircleResize() {
        circle.resize(0.5);
        double resizedRadius = circle.radius;
        Assert.assertEquals("Incorret side: " + resizedRadius, 4.5, resizedRadius, 0.1);
    }

    @Test
    // проверка, что круг наследуется от фигуры
    public void cirleIsInstanceOfFigure() {
        Assert.assertTrue(circle instanceof Figur);
    }
}
