package amazone.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import ui_bdd.amazone.amazoneMapping.*;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

/**
 * Created by olenka on 05.01.2017.
 */
public class CartPageStepdefs extends BasePagesStepdefs{

    public static StartPage startPage;
    public static SearchResultsPage searchResultsPage;
    public static ProductDetailPage productDetailPage;
    public static CartPage cartPage;
    public static CatalogPage catalogPage;
    public  static BooksCategoryPage booksCategoryPage;
    String firstProductTitle;
    double firstProductPrice;
    String secondProductTitle;
    double secondProductPrice;
    String thirdProductTitle;
    String deletedItem;



    @Before("@CartPage")
    public void setupStartConditions() {
        super.setupBrowser();
        startPage = new StartPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        cartPage = new CartPage(driver);
        catalogPage = new CatalogPage(driver);
        booksCategoryPage = new BooksCategoryPage(driver);
    }

    @After ("@CartPage")
    public void quitDriver() {
        driver.quit();
    }

    @When("^I add product1 to cart$")
    public void iAddProduct1ToCart() throws ParseException {
        startPage.searchInput.sendKeys("knife kitchen");
        startPage.searchButton.click();
        searchResultsPage.eightInchKnife.click();
        firstProductTitle = productDetailPage.productTitle.getText();
        firstProductPrice = productDetailPage.getProductPrice();
        productDetailPage.addToCartButton.click();
    }

    @And("^I add product2 to cart$")
    public void iAddProduct2ToCart() throws Throwable {
        startPage.searchInput.sendKeys("Duck Commander Bobble Head");
        startPage.searchButton.click();
        searchResultsPage.searchResults.get(0).click();
        secondProductTitle = productDetailPage.productTitle.getText();
        secondProductPrice = productDetailPage.getProductPrice();
        productDetailPage.addToCartButton.click();
    }

    @And("^I add product3 to cart$")
    public void iAddProduct3ToCart() {
        startPage.searchInput.sendKeys("Duck Commander Bobble Head (Si)");
        startPage.searchButton.click();
        searchResultsPage.searchResults.get(0).click();
        thirdProductTitle = productDetailPage.productTitle.getText();
        productDetailPage.addToCartButton.click();
    }

    @Then("^I see titles of these products in the cart$")
    public void iSeeTitlesOfTheseProductsInTheCart() throws Throwable {
        cartPage.cart.click();
        Assert.assertEquals("Number of products in cart is incorrect", 2, cartPage.productsInCart.size());
        Assert.assertTrue("First title of product in cart is incorrect", cartPage.getProductTitlesInCart().contains(firstProductTitle));
        Assert.assertTrue("Second title of product in cart is incorrect",cartPage.getProductTitlesInCart().contains(secondProductTitle));
    }

    @And("^Total price equals to product1 price plus product2 price$")
    public void totalPriceEqualsToProductPriceProductPrice() throws Throwable {
        Assert.assertTrue("First price of product in cart is incorrect",cartPage.getProductPricesInCart().contains(firstProductPrice));
        Assert.assertTrue("Second price of product in cart is incorrect",cartPage.getProductPricesInCart().contains(secondProductPrice));
        Assert.assertEquals("Total price is incorrect", cartPage.getTotalPrice(),firstProductPrice + secondProductPrice, 0.1);
    }

    @And("^I go to cart$")
    public void iGoToCart() throws Throwable {
        cartPage.cart.click();
    }

    @And("^I delete third product from cart$")
    public void iDeleteThirdProductFromCart() throws Throwable {
        cartPage.cart.click();
        deletedItem = cartPage.productsInCart.get(2).getText();
        cartPage.deleteCheckboxes.get(2).click();
    }

    @Then("^This product is not present in the cart$")
    public void thisProductIsNotPresentInTheCart() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(cartPage.productsInCart);
        Assert.assertFalse("Deleted item is still in the cart", cartPage.getProductTitlesInCart().contains(deletedItem));
        Assert.assertEquals(2, cartPage.productsInCart.size());
    }


}

