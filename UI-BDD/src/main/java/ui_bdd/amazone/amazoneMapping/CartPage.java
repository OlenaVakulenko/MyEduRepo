package ui_bdd.amazone.amazoneMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by olenka on 24.12.2016.
 */
public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//div[contains(@class, 'sc-list-item-content')]//span[contains(@class, 'sc-product-title')]")
    public List<WebElement> productsInCart;

    @FindBy (xpath = ".//div[contains(@class, 'sc-list-item-content')]//span[contains(@class, 'a-color-price')]")
    public List<WebElement> pricesInCart;

    @FindBy (id = "nav-cart")
    public WebElement cart;

    @FindBy (xpath = ".//div[contains(@class, 'sc-subtotal')]//span[contains(@class,'sc-price')]")
    public WebElement totalPrice;

    @FindBy (xpath = ".//div[@class='sc-list-item-content']//input[@value='Delete']")
    public List<WebElement> deleteCheckboxes;

    public double getTotalPrice() throws ParseException {
        String totalPriceString = totalPrice.getText();
        return Double.valueOf(NumberFormat.getCurrencyInstance(Locale.US).parse(totalPriceString).toString());
    }

    public List getProductTitlesInCart() {
        List listOfProductsInCart = new ArrayList(30);
        for(WebElement item: productsInCart) {
            listOfProductsInCart.add(item.getText());
        }
        return listOfProductsInCart;
    }

    public List getProductPricesInCart() throws ParseException {
        List listOfProductPricesInCart = new ArrayList(30);
        for(WebElement item: pricesInCart) {
            String itemText = item.getText();
            double parsedPrice = Double.valueOf(NumberFormat.getCurrencyInstance(Locale.US).parse(itemText).toString());
            listOfProductPricesInCart.add(parsedPrice);
        }
        return listOfProductPricesInCart;
    }
}
