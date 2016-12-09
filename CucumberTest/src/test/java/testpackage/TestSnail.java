package testpackage;

import games.Snail;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olenka on 04.12.2016.
 */
public class TestSnail {

    @Test
    // тест на максимальный элемент в матрице
    public void testMaxNumberInSnail() {
        int[][] matrixA = Snail.calculateSnail(5);
        // вычисляем максимальный элемент матрицы
        int actMax = 0;
        for (int i = 0; i != matrixA.length; i++) {
            for (int j = 0; j != matrixA.length; j++) {
                if (matrixA[i][j] > actMax) {
                    actMax = matrixA[i][j];
                }
            }
        }
        // ожидаемое значение максимального числа:
        int expMax = 25;
        // сравниваем фактический и ожидаемый результат
        Assert.assertEquals("Actual max number is: " + actMax + " but expected was: " + expMax, expMax, actMax);
    }

    @Test
    // тест на то, что при нечетной размерности матрицы максимальный элемент находится в правом верхнем углу матрицы
    public void checkPositionOfMaxElementOdd() {
        int[][] matrixA = Snail.calculateSnail(5);
        // ищем фактическую позицию максимального элемента в матрице
        int actMax = 0;
        int [] actMaxPosition = {0,0};
        for (int i = 0; i != matrixA.length; i++) {
            for (int j = 0; j != matrixA.length; j++) {
                if (matrixA[i][j] > actMax) {
                    actMax = matrixA[i][j];
                    actMaxPosition[0] = i;
                    actMaxPosition[1] = j;
                }
            }
        }
        int[] expMaxPosition = {0,4};
        Assert.assertArrayEquals("Expected position was " + expMaxPosition + " but actual position is " + actMaxPosition, expMaxPosition,actMaxPosition);
    }

    @Test
    // тест на то, что при четной размерности матрицы максимальный элемент находится в нижнем левом углу матрицы
    public void checkPositionOfMaxElementEven() {
        int[][] matrixA = Snail.calculateSnail(4);
        // ищем фактическую позицию максимального элемента в матрице
        int actMax = 0;
        int [] actMaxPosition = {0,0};
        for (int i = 0; i != matrixA.length; i++) {
            for (int j = 0; j != matrixA.length; j++) {
                if (matrixA[i][j] > actMax) {
                    actMax = matrixA[i][j];
                    actMaxPosition[0] = i;
                    actMaxPosition[1] = j;
                }
            }
        }
        int[] expMaxPosition = {3,0};
        Assert.assertArrayEquals("Expected position was " + expMaxPosition + " but actual position is " + actMaxPosition, expMaxPosition,actMaxPosition);
    }

    @Test
    // тест на то, что метод создания матрицы возвращает матрицу
    public void checkReturnMatrix() {
        int[][] matrixA = Snail.calculateSnail(3);
        Assert.assertNotNull("Snail doesn't return matrix",matrixA);
    }
}
