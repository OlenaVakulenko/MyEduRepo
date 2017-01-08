package stackoverflow.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import ui_bdd.stackoverflow.stackoverflowMapping.LoginPage;
import ui_bdd.stackoverflow.stackoverflowMapping.StartPage;

/**
 * Created by olenka on 08.01.2017.
 */
public class LoginPageStepdefs extends StackoverflowBasePagesStepdefs{

    public static StartPage startPage;
    public static LoginPage loginPage;

    @Before("@LoginPage")
    public void setupStartConditions() {
        super.setupBrowser();
        startPage = new StartPage(driver);
        loginPage = new LoginPage(driver);
    }

    @After("@LoginPage")
    public void quitDriver() {
        driver.quit();
    }

    @When("^I click on LoginButton in header$")
    public void iClickOnLoginButtonInHeader() {
        startPage.loginButton.click();
    }

    @Then("^I see google and facebook authorization block on a login page$")
    public void iSeeGoogleAndFacebookAuthorizationBlockOnALoginPage() throws Throwable {
        Assert.assertTrue("Page does not have Google Authorization icon", loginPage.google.size() > 0);
        Assert.assertTrue("Page does not have Facebook Authorization icon", loginPage.facebook.size() > 0);
    }
}
