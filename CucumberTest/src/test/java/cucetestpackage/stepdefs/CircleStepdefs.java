package cucetestpackage.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import figur.Circle;
import figur.Figur;
import org.junit.Assert;

/**
 * Created by olenka on 08.12.2016.
 */
public class CircleStepdefs {
    private Circle circle;
    private double expArea;
    private double actArea;
    private double[] actCoordinates = new double[2];
    private double[] expCoordinates = new double[2];
    double resizedRadius;

    @Given("^I create Circle with coordinates \"([^\"]*)\",\"([^\"]*)\" and radius \"([^\"]*)\"$")
    public void iCreateCircleWithCoordinatesAndRadius(String arg0, String arg1, String arg2) throws Throwable {
        circle = new Circle(Double.valueOf(arg0), Double.valueOf(arg1), Double.valueOf(arg2));
    }

    @Then("^Area of circle equals (.+)$")
    public void areaOfCircleEquals(double arg0) throws Throwable {
        expArea = arg0;
        actArea = circle.area();
        Assert.assertEquals(expArea, actArea, 0.2);
    }

    @When("^I move Circle by (.+),(.+)$")
    public void iMoveCircleBy(double arg0, double arg1) throws Throwable {
        circle.move(arg0,arg1);
        actCoordinates[0] = circle.coordX;
        actCoordinates[1] = circle.coordY;
    }

    @Then("^New coordinates are (.+),(.+)$")
    public void newCoordinatesAre(double arg0, double arg1) throws Throwable {
        expCoordinates[0] = arg0;
        expCoordinates[1] = arg1;
        Assert.assertArrayEquals(expCoordinates,actCoordinates,0.1);
        }

    @When("^I resize circle by coefficient (.+)$")
    public void iResizeCircleByCoefficient(double arg0) throws Throwable {
        circle.resize(arg0);
        resizedRadius = circle.radius;
        }

    @Then("^Radius equals (.+)$")
    public void radiusEquals(double arg0) throws Throwable {
        Assert.assertTrue(resizedRadius == arg0);
    }

    @Then("^Circle is instance of Figure$")
    public void circleIsInstanceOfFigure() throws Throwable {
        Assert.assertTrue(circle instanceof Figur);
    }
}
