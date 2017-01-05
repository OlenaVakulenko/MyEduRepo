package ui_bdd.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by olenka on 22.12.2016.
 */
public class UserProfile extends BasePage {

    public UserProfile(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//span[@class='nav-line-3']")
    public WebElement helloUser;

    public String getUserName(){
        return helloUser.getAttribute("innerHTML");
    }
}
