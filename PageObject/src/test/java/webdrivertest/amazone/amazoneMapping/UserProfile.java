package webdrivertest.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by olenka on 22.12.2016.
 */
public class UserProfile {

    private WebDriver driver;

    public UserProfile (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = ".//span[@class='nav-line-3']")
    public WebElement helloUser;

    public String getUserName(){
        return helloUser.getAttribute("innerHTML");
    }
}
