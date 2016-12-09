package cucetestpackage.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import figur.Figur;
import figur.Square;
import org.junit.Assert;

/**
 * Created by olenka on 08.12.2016.
 */
public class SquareStepdefs {
    private Square square;
    double actArea;
    double expArea;
    double[] actCoordinates = new double[2];
    double[] expCoordinates = new double[2];
    double resizedSide;

    @Given("^I create Square with side (.+) and coordinates (.+),(.+)$")
    public void iCreateSquareWithSideAndCoordinates(double arg0, double arg1, double arg2) throws Throwable {
        square = new Square(arg1,arg2,arg0);
    }

    @Then("^Area of Square equals (.+)$")
    public void areaOfSquareEquals(double arg0) throws Throwable {
        actArea = square.area();
        expArea = arg0;
        Assert.assertEquals(expArea,actArea,0);
    }

    @When("^I move Square by (.+),(.+)$")
    public void iMoveSquareBy(double arg0, double arg1) throws Throwable {
        square.move(arg0,arg1);
        actCoordinates[0] = square.coordX;
        actCoordinates[1] = square.coordY;
    }

    @When("^I resize square by coefficient (.+)$")
    public void iResizeSquareByCoefficient(double arg0) throws Throwable {
        square.resize(arg0);
        resizedSide = square.side;
    }


    @Then("^Side equals (.+)$")
    public void sideEquals(double arg0) throws Throwable {
        Assert.assertEquals(arg0,resizedSide,0);
    }

    @Then("^New Square coordinates are (.+),(.+)$")
    public void newSquareCoordinatesAre(double arg0, double arg1) throws Throwable {
        expCoordinates[0] = arg0;
        expCoordinates[1] = arg1;
        Assert.assertArrayEquals(expCoordinates,actCoordinates,0);
    }

    @Then("^Square is instance of Figure$")
    public void circleIsInstanceOfFigure() throws Throwable {
        Assert.assertTrue(square instanceof Figur);
    }
}
