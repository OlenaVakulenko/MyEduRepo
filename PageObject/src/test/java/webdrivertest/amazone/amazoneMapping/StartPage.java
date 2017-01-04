package webdrivertest.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by olenka on 22.12.2016.
 */
public class StartPage {


    final WebDriver driver;

    public StartPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchInput;

    @FindBy (xpath = ".//span[@id='nav-search-submit-text']/following-sibling::input")
    public WebElement searchButton;

    @FindBy (xpath = ".//*[@id='nav-main']//span[text()='Departments']")
    public WebElement departments;

    @FindBy (id = "nav-your-amazon")
    public WebElement yourAmazon;

    public LoginPage goToLoginPage() {
        yourAmazon.click();
        return new LoginPage(driver);
    }
}
