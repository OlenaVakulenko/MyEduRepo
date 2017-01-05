package ui_bdd.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by olenka on 22.12.2016.
 */
public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "ap_email")
    public WebElement email;

    @FindBy (id = "ap_password")
    public WebElement password;

    @FindBy (id = "signInSubmit")
    public WebElement loginButton;

    public void setEmail(String emailaddress) {
        email.sendKeys(emailaddress);
    }

    public void setPassword (String pass) {
        password.sendKeys(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }


}
