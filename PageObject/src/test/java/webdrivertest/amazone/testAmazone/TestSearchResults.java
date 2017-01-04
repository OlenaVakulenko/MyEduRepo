package webdrivertest.amazone.amazoneMapping.testAmazone;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdrivertest.amazone.amazoneMapping.SearchResultsPage;
import webdrivertest.amazone.amazoneMapping.StartPage;

/**
 * Created by olenka on 23.12.2016.
 */
public class TestSearchResults {

    public static WebDriver driver;
    public static StartPage startPage;
    public static SearchResultsPage searchResultsPage;

    @BeforeClass
    public static void setupStartConditions() {
        driver = new FirefoxDriver();
        startPage = new StartPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Before
    public void beforeEachTest() {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkSearchContainsString() {
        String targetString = "duck";
        startPage.searchInput.sendKeys(targetString);
        startPage.searchButton.click();
        for (WebElement searchResult : searchResultsPage.searchResults) {
            String searchResultText = searchResultsPage.getTextOfSearchResult(searchResult);
            Assert.assertTrue("Search result " + searchResultText + " does not contain " + targetString, searchResultText.contains(targetString));
        }
    }

    @Test
    public void checkNumberOfSearchResults() {
        startPage.searchInput.sendKeys("duck");
        startPage.searchButton.click();
        int numberOfGeneralSearchResults = searchResultsPage.getNumberOfSearchResults();
        searchResultsPage.babyProductsCategory.click();
        int numberOfSearchResultsByCategory = searchResultsPage.getNumberOfSearchResults();
        Assert.assertTrue("Number of search results in category is greater than number of total results",
                numberOfGeneralSearchResults > numberOfSearchResultsByCategory);
    }
}

