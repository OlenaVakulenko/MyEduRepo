package amazone.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ui_bdd.amazone.amazoneMapping.SearchResultsPage;
import ui_bdd.amazone.amazoneMapping.StartPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by olenka on 05.01.2017.
 */
public class SearchResultsPageStepdefs extends BasePagesStepdefs{

    public static StartPage startPage;
    public static SearchResultsPage searchResultsPage;
    int numberOfGeneralSearchResults;
    int numberOfSearchResultsByCategory;

    @Before ("@SearchResultsPage")
    public void setupStartConditions() {
        super.setupBrowser();
        startPage = new StartPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @After("@SearchResultsPage")
    public void quitDriver() {
        driver.quit();
    }

    @When("^I enter \"([^\"]*)\" to search input$")
    public void iEnterSmtToSearchInput(String arg0) throws Throwable {
        startPage.searchInput.sendKeys(arg0);
    }


    @And("^I click Search Button$")
    public void iClickSearchButton() throws Throwable {
        startPage.searchButton.click();
        numberOfGeneralSearchResults = searchResultsPage.getNumberOfSearchResults();
    }


    @Then("^All search results contain query \"([^\"]*)\"$")
    public void allSearchResultsContainQuery(String arg0) throws Throwable {
        for (WebElement searchResult : searchResultsPage.searchResults) {
            String searchResultText = searchResultsPage.getTextOfSearchResult(searchResult);
            Assert.assertTrue("Search result " + searchResultText + " does not contain " + arg0, searchResultText.contains(arg0));
        }
    }

    @And("^I click on BabyProducts subcategory$")
    public void iClickOnBabyProductsSubcategory() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchResultsPage.babyProductsCategory.click();
        numberOfSearchResultsByCategory = searchResultsPage.getNumberOfSearchResults();
    }

    @Then("^Number of search results in subcategory is less than number of search results in general search$")
    public void numberOfSearchResultsInSubcategoryIsLessThanNumberOfSearchResultsInGeneralSearch() throws Throwable {
        Assert.assertTrue("Number of search results in category is greater than number of total results",
                numberOfGeneralSearchResults > numberOfSearchResultsByCategory);
    }
}