package webdrivertest.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by olenka on 25.12.2016.
 */
public class BooksCategoryPage {

    private WebDriver driver;

    public BooksCategoryPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = ".//li[contains(@class, 'a-carousel-card')]")
    public List<WebElement> bookOffers;

    public void navigateTwoStepsBack() {
        driver.navigate().back();
        driver.navigate().back();
    }
}
