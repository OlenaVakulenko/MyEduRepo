package webdrivertest.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by olenka on 22.12.2016.
 */
public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (id = "ap_email")
    public WebElement email;

    @FindBy (id = "ap_password")
    public WebElement password;

    @FindBy (id = "signInSubmit")
    public WebElement loginButton;

    public void setEmail(String emailaddress) {
        email.sendKeys(emailaddress);
        //return new LoginPage(driver);
    }

    public void setPassword (String pass) {
        password.sendKeys(pass);
    }

    public void clickLogin() {
        loginButton.click();
       // return new UserProfile(driver);
    }


}
