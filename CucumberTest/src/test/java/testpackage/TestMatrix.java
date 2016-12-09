package testpackage;

import games.Matrix;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

/**
 * Created by olenka on 04.12.2016.
 */
public class TestMatrix {

   @Test
   // проверяем, что метод создания матрицы возвращает матрицу
    public void checkMatrixIsNotNull() {
       int[][] matrixA = Matrix.createMatrix(5);
        Assert.assertNotNull(matrixA);
    }

    @Test
    // проверка вывода матрицы размерностью 5
    public void checkMatrixOfSize5() {
        int[][] actMatrix = Matrix.createMatrix(5);
        int[][] expMatrix = {
                {1,2,3,4,5},
                {6,7,8,9,1},
                {2,3,4,5,6},
                {7,8,9,1,2},
                {3,4,5,6,7}
        };
        Assert.assertArrayEquals("Matrix is incorrect, expected: " + expMatrix + "but actual is: " + actMatrix,expMatrix,actMatrix);
    }

    @Test
    // проверка валидации вводимых данных
    public void checkIncorrectInput() {
        String incorrectInput = "j";
        boolean actResult = Matrix.validate(incorrectInput);
        Assert.assertFalse("Validation accepts incorrect input",actResult);
    }
 }
