package ui_bdd.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by olenka on 23.12.2016.
 */
public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//h2[contains(@class, 's-access-title')]")
    public List<WebElement> searchResults;

    @FindBy (xpath = ".//p[text()='Baby Products']")
    public WebElement babyProductsCategory;

    @FindBy (id = "s-result-count")
    public WebElement numberOfSearchResults;

    @FindBy (xpath = ".//h2[contains(@class, 's-access-title') and contains(text(), '8 Inch')]")
    public WebElement eightInchKnife;

    public String getTextOfSearchResult(WebElement searchResult) {
       return searchResult.getText().toLowerCase();
    }

    public int getNumberOfSearchResults() {
        Pattern p = Pattern.compile("of\\s(.*)\\sresults");
        Matcher m = p.matcher(numberOfSearchResults.getText());
        m.find();
        int numberOfSearchResults = Integer.parseInt(m.group(1).replaceAll(",",""));
        return numberOfSearchResults;
    }
}
