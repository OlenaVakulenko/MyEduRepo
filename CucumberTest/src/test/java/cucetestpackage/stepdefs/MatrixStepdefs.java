package cucetestpackage.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import games.Matrix;
import org.junit.Assert;

/**
 * Created by olenka on 05.12.2016.
 */
public class MatrixStepdefs {
    // метод создания матрицы возвращает матрицу
    private int[][] matrixA;
    private Matrix app;
    private boolean valResult;

    @Given("^I start program Matrix$")
    public void WhenICreateMatrixProgramReturnsObjectMatrix() {
        app = new Matrix();
    }

    @When("^I create matrix with size (\\d+)$")
    public void iCreateMatrixWithSize(int arg0) throws Throwable {
        matrixA = Matrix.createMatrix(arg0);
    }

    @Then("^I returns Matrix$")
    public void iReturnsMatrix() throws Throwable {
        Assert.assertNotNull("Snail doesn't return matrix", matrixA);
    }

    // тест на валидацию данных
    @When("^I validate string \"([^\"]*)\"$")
    public void iValidateString(String arg0) throws Throwable {
        valResult = Matrix.validate(arg0);
    }

    @Then("^Validation doesn't pass$")
    public void validationDoesnTPass() throws Throwable {
        Assert.assertFalse("Incorrect input passed!", valResult);
    }

    @Then("^I see on return matrix in row (\\d+) and position (\\d+) with value (\\d+)$")
    public void iSeeOnReturnMatrixInRowAndPositionWithValue(int arg0, int arg1, int arg2) throws Throwable {
        Assert.assertTrue(matrixA[arg0][arg1] == arg2);
    }
}




