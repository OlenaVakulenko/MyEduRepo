package webdrivertest.amazone.testAmazone;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdrivertest.amazone.amazoneMapping.*;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

/**
 * Created by olenka on 24.12.2016.
 */
public class TestCartPage {

    public static WebDriver driver;
    public static StartPage startPage;
    public static SearchResultsPage searchResultsPage;
    public static ProductDetailPage productDetailPage;
    public static CartPage cartPage;
    public static CatalogPage catalogPage;
    public static BooksCategoryPage booksCategoryPage;


    @Before
    public void setupStartConditions() {
        driver = new FirefoxDriver();
        startPage = new StartPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        cartPage = new CartPage(driver);
        catalogPage = new CatalogPage(driver);
        booksCategoryPage = new BooksCategoryPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

   @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkAddProductsToCart() throws ParseException {
        //finding first product, adding in to the cart
        startPage.searchInput.sendKeys("knife kitchen");
        startPage.searchButton.click();
        searchResultsPage.eightInchKnife.click();
        String firstProductTitle = productDetailPage.productTitle.getText();
        double firstProductPrice = productDetailPage.getProductPrice();
        productDetailPage.addToCartButton.click();
        //finding second product, adding in to the cart
        startPage.searchInput.sendKeys("Duck Commander Bobble Head");
        startPage.searchButton.click();
        searchResultsPage.searchResults.get(0).click();
        String secondProductTitle = productDetailPage.productTitle.getText();
        double secondProductPrice = productDetailPage.getProductPrice();
        productDetailPage.addToCartButton.click();
        //go to cart and check products inside
        cartPage.cart.click();
        Assert.assertEquals("Number of products in cart is incorrect", 2, cartPage.productsInCart.size());
        Assert.assertTrue("First title of product in cart is incorrect", cartPage.getProductTitlesInCart().contains(firstProductTitle));
        Assert.assertTrue("Second title of product in cart is incorrect",cartPage.getProductTitlesInCart().contains(secondProductTitle));
        Assert.assertTrue("First price of product in cart is incorrect",cartPage.getProductPricesInCart().contains(firstProductPrice));
        Assert.assertTrue("Second price of product in cart is incorrect",cartPage.getProductPricesInCart().contains(secondProductPrice));
        Assert.assertEquals("Total price is incorrect", cartPage.getTotalPrice(),firstProductPrice + secondProductPrice, 0.1);
    }

    @Test
    public void checkDeletingProductsFromCart() {
        //navigate through catalogue
        startPage.departments.click();
        catalogPage.booksCategory.click();
        //choose 1-st book
        booksCategoryPage.bookOffers.get(0).click();
        productDetailPage.addToCartButton.click();
        booksCategoryPage.navigateTwoStepsBack();
        //choose 2-nd book
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        booksCategoryPage.bookOffers.get(1).click();
        productDetailPage.addToCartButton.click();
        booksCategoryPage.navigateTwoStepsBack();
        //choose 3-rd book
        booksCategoryPage.bookOffers.get(2).click();
        productDetailPage.addToCartButton.click();
        //go to cart and delete third book
        cartPage.cart.click();
        String deletedItem = cartPage.productsInCart.get(2).getText();
        cartPage.deleteCheckboxes.get(2).click();
        // assure cart contains 2 items and doesn't contain deleted item
        System.out.println(cartPage.productsInCart);
        Assert.assertFalse("Deleted item is still in the cart", cartPage.getProductTitlesInCart().contains(deletedItem));
        Assert.assertEquals(2, cartPage.productsInCart.size());
    }
}

