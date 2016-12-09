package cucetestpackage.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import games.Snail;
import org.junit.Assert;

/**
 * Created by olenka on 04.12.2016.
 */

public class SnailStepdefs {
    private Snail app;
    private int[][] matrixA;
    private int[] actMaxPosition = {0, 0};

    // тест на максимальный элемент в матрице
    @Given("^I start program Snail$")
    public void iStartProgramSnail() throws Throwable {
        app = new Snail();
    }

    @When("^I create matrix with side value (\\d+)$")
    public void iCreateMatrixWithSideValue(int arg0) throws Throwable {
        matrixA = app.calculateSnail(arg0);
    }

    @Then("^current maximum element is (\\d+)$")
    public void currentMaximumElementIs(int arg0) throws Throwable {
        int actMax = 0;
        int[] actMaxPosition = {0, 0};
        for (int i = 0; i != matrixA.length; i++) {
            for (int j = 0; j != matrixA.length; j++) {
                if (matrixA[i][j] > actMax) {
                    actMax = matrixA[i][j];
                    actMaxPosition[0] = i;
                    actMaxPosition[1] = j;
                    }
            }
        }
        Assert.assertEquals(actMax, arg0);
    }

    // тест на то, что при нечетной размерности матрицы максимальный элемент находится в правом верхнем углу матрицы
    @And("^current position of maximum element is (\\d+),(\\d+)$")
    public void currentPositionOfMaximumElementIs(int arg0, int arg1) throws Throwable {
        int[] expMaxPosition = {arg0, arg1};
        int actMax = 0;
        int[] actMaxPosition = {0, 0};
        for (int i = 0; i != matrixA.length; i++) {
            for (int j = 0; j != matrixA.length; j++) {
                if (matrixA[i][j] > actMax) {
                    actMax = matrixA[i][j];
                    actMaxPosition[0] = i;
                    actMaxPosition[1] = j;
                }
            }
        }
        Assert.assertArrayEquals(expMaxPosition, actMaxPosition);
    }

    // тест на то, что метод calculateSnail возвращает матрицу
    @Then("^program returns Matrix with size (\\d+)$")
    public void programReturnsMatrixWithSize(int arg0) throws Throwable {
        matrixA = app.calculateSnail(arg0);
        Assert.assertTrue(matrixA instanceof int[][]);
        Assert.assertEquals(3, matrixA.length);
    }




}

