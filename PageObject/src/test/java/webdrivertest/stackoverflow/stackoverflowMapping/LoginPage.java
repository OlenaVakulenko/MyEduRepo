package webdrivertest.stackoverflow.stackoverflowMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by olenka on 08.01.2017.
 */
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(className = "google-login")
    public List<WebElement> google;

    @FindBy (className = "facebook-login")
    public List<WebElement> facebook;
}
