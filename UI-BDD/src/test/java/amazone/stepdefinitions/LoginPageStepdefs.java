package amazone.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import ui_bdd.amazone.amazoneMapping.LoginPage;
import ui_bdd.amazone.amazoneMapping.StartPage;
import ui_bdd.amazone.amazoneMapping.UserProfile;

/**
 * Created by olenka on 05.01.2017.
 */
public class LoginPageStepdefs extends BasePagesStepdefs{

    public static UserProfile userProfile;
    public static StartPage startPage;
    public static LoginPage loginPage;

    @Before ("@LoginPage")
    public void setupStartConditions() {
        super.setupBrowser();
        startPage = new StartPage(driver);
        System.out.println("StartPage instantiated!");
        userProfile = new UserProfile(driver);
        loginPage = new LoginPage(driver);
    }

    @After ("@LoginPage")
    public void quitDriver() {
        driver.quit();
        System.out.println("login page quit");
    }

    @When("^I go to login page$")
        public void iGoToLoginPage() {
        startPage.goToLoginPage();
    }

    @And("^I set email to \"([^\"]*)\"$")
    public void iSetEmailTo(String arg0) throws Throwable {
        loginPage.setEmail(arg0);
    }

    @And("^I set password to \"([^\"]*)\"$")
    public void iSetPasswordTo(String arg0) throws Throwable {
        loginPage.setPassword(arg0);
    }

    @And("^I click LoginButton$")
    public void iClickLoginButton() throws Throwable {
        loginPage.clickLogin();
    }

    @Then("^I see username \"([^\"]*)\" in page header$")
    public void iSeeUsernameInPageHeader(String arg0) throws Throwable {
        Assert.assertTrue("Login greeting is incorrect", userProfile.getUserName().contains(arg0));
    }

}

