package stackoverflow.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui_bdd.stackoverflow.stackoverflowMapping.StartPage;
import ui_bdd.stackoverflow.stackoverflowMapping.UsersListPage;

/**
 * Created by olenka on 08.01.2017.
 */
public class UsersListPageStepdefs extends StackoverflowBasePagesStepdefs{

    public StartPage startPage;
    public UsersListPage usersListPage;

    @Before("@UsersListPage")
    public void setupStartConditions() {
        super.setupBrowser();
        startPage = new StartPage(driver);
        usersListPage = new UsersListPage(driver);
    }

    @After("@UsersListPage")
    public void quitDriver() {
        driver.quit();
    }

    @When("^I click on a Users tab$")
    public void iClickOnAUsersTab() {
        startPage.usersTab.click();
    }

    @And("^I enter \"([^\"]*)\" to search input on a users tab$")
    public void iEnterToSearchInputOnAUsersTab(String arg0) throws Throwable {
        usersListPage.userFilterInput.sendKeys(arg0);
        Thread.sleep(5000);
    }

    @Then("^all search results contain string \"([^\"]*)\"$")
    public void allSearchResultsContainString(String arg0) throws Throwable {
        usersListPage.listOfUserNames();
    }
}

