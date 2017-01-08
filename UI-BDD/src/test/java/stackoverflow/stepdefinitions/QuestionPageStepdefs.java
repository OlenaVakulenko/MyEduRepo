package stackoverflow.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import ui_bdd.stackoverflow.stackoverflowMapping.QuestionPage;
import ui_bdd.stackoverflow.stackoverflowMapping.StartPage;

/**
 * Created by olenka on 08.01.2017.
 */
public class QuestionPageStepdefs extends StackoverflowBasePagesStepdefs{

    public StartPage startPage;
    public QuestionPage questionPage;

    @Before("@QuestionPage")
    public void setupStartConditions() {
        super.setupBrowser();
        startPage = new StartPage(driver);
        questionPage = new QuestionPage(driver);
    }

    @After("@QuestionPage")
    public void quitDriver() {
        driver.quit();
    }

    @When("^I click on a top question from the start page$")
    public void iClickOnATopQuestionFromTheStartPage() {
        startPage.topQuestion.click();


    }

    @Then("^Date of issue on the question page is \"([^\"]*)\"$")
    public void dateOfIssueOnTheQuestionPageIs(String arg0) throws Throwable {
        Assert.assertEquals("Top question in posted not " + arg0, arg0, questionPage.getPostDate());
    }
}
