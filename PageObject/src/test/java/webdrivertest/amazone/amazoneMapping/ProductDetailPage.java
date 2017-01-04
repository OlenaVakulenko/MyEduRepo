package webdrivertest.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by olenka on 24.12.2016.
 */
public class ProductDetailPage {

    private WebDriver driver;

    public ProductDetailPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = ".//div[@id='price_feature_div']//span[contains(@class, 'a-color-price')]")
    public WebElement productPrice;

    @FindBy (id = "productTitle")
    public WebElement productTitle;

    @FindBy (id = "add-to-cart-button")
    public WebElement addToCartButton;

    public double getProductPrice() throws ParseException {
        String productPriceString = productPrice.getAttribute("innerHTML").trim();
        return Double.valueOf(NumberFormat.getCurrencyInstance(Locale.US).parse(productPriceString).toString());
    }


}
