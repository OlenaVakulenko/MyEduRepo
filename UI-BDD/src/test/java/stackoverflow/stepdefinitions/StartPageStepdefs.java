package stackoverflow.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import ui_bdd.stackoverflow.stackoverflowMapping.StartPage;

/**
 * Created by olenka on 08.01.2017.
 */
public class StartPageStepdefs extends StackoverflowBasePagesStepdefs{

    public StartPage startPage;

    @Before("@StartPage")
    public void setupStartConditions() {
        super.setupBrowser();
        startPage = new StartPage(driver);
    }

    @After("@StartPage")
    public void quitDriver() {
        driver.quit();
    }

    @Given("^I am on a start page$")
    public void iAmOnAStartPage() {
    }

    @Then("^Number of featured questions is greater than (\\d+)$")
    public void numberOfFeaturedQuestionsIsGreaterThan(int arg0) throws Throwable {
        Assert.assertTrue("Number of featured items is less than " + arg0,startPage.getNumberOfFeatured() > arg0);
    }

    @Then("^Max salary in advertisement block is greater than 60k$")
    public void maxSalaryInAdvertisementBlockIsGreaterThanK() throws Throwable {
        startPage.getMaxSalary();
    }
}
