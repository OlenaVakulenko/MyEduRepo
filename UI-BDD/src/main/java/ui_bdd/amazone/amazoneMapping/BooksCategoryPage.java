package ui_bdd.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by olenka on 25.12.2016.
 */
public class BooksCategoryPage extends BasePage {

    public BooksCategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//li[contains(@class, 'a-carousel-card')]")
    public List<WebElement> bookOffers;

}
