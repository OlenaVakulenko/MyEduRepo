package ui_bdd.stackoverflow.stackoverflowMapping;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by olenka on 04.01.2017.
 */
public class UsersListPage {

    private WebDriver driver;

    public UsersListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (id = "userfilter")
    public WebElement userFilterInput;

    @FindBy (xpath = ".//div[@class='user-details']/a")
    public List<WebElement> userNamesElements;

    public List listOfUserNames() {
        List listOfUserNames = new ArrayList(30);
        for (WebElement item : userNamesElements) {
            String username = item.getText().toLowerCase();
            listOfUserNames.add(item);
            Assert.assertTrue("User name " + username + " does not contain search query",username.contains("bot"));
        }
        return listOfUserNames;
    }
}
