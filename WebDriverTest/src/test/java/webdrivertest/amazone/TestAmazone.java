package webdrivertest.amazone;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by olenka on 17.12.2016.
 */

public class TestAmazone {

    WebDriver driver;

    @Before
    public void setupStartConditions() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkSearchContainsString() {
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        String targetString = "duck";
        searchInput.sendKeys(targetString);
        WebElement searchButton = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton.click();
        String searchResults = driver.findElement(By.xpath(".//h2[contains(@class, 's-access-title')]")).getText().toLowerCase();
        Assert.assertTrue("Search results do not contain " + targetString, searchResults.contains(targetString));
        driver.quit();
    }

    @Test
    public void checkNumberOfSearchResults() {
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        String targetString = "duck";
        searchInput.sendKeys(targetString);
        WebElement searchButton = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton.click();
        int numberOfGeneralSearchResults = driver.findElement(By.xpath(".//h2[contains(@class, 's-access-title')]")).getSize().getWidth();
        WebElement category = driver.findElement(By.xpath(".//p[text()='Baby Products']"));
        category.click();
        int numberOfCategorySearchResults = driver.findElement(By.xpath(".//h2[contains(@class, 's-access-title')]")).getSize().getWidth();
        Assert.assertTrue("Number of search results in category is greater than number of total results", numberOfGeneralSearchResults >= numberOfCategorySearchResults);
    }

    @Test
    public void checkAddProductsToCart() throws ParseException {
        WebElement searchInput1 = driver.findElement(By.id("twotabsearchtextbox"));
        String firstTargetString = "knife kitchen";
        searchInput1.sendKeys(firstTargetString);
        WebElement searchButton1 = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton1.click();
        //first product:
        WebElement firstProduct = driver.findElement(By.xpath(".//h2[contains(@class, 's-access-title') and contains(text(), '8 Inch')]"));
        firstProduct.click();
        String firstPrice = driver.findElement(By.xpath(".//span[contains(@class, 'a-color-price')]")).getText();
        double parsedFirstPrice = Double.valueOf(NumberFormat.getCurrencyInstance(Locale.US).parse(firstPrice).toString());
        String firstTitle = driver.findElement(By.id("productTitle")).getText();
        WebElement addToCart1 = driver.findElement(By.id("add-to-cart-button"));
        addToCart1.click();
        //second product:
        WebElement searchInput2 = driver.findElement(By.id("twotabsearchtextbox"));
        String secondTargetString = "duck";
        searchInput2.sendKeys(secondTargetString);
        WebElement searchButton2 = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton2.click();
        WebElement secondProduct = driver.findElement(By.className("s-access-title"));
        secondProduct.click();
        String secondPrice = driver.findElement(By.id("priceblock_ourprice")).getText();
        double parsedSecondPrice = Double.valueOf(NumberFormat.getCurrencyInstance(Locale.US).parse(secondPrice).toString());
        String secondTitle = driver.findElement(By.id("productTitle")).getText();
        WebElement addToCart2 = driver.findElement(By.id("add-to-cart-button"));
        addToCart2.click();
        //go to cart:
        WebElement cart = driver.findElement(By.id("nav-cart"));
        cart.click();
        //check cart content:
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> productsInCart = driver.findElements(By.xpath(".//div[contains(@class, 'sc-list-item-content')]//span[contains(@class, 'sc-product-title')]"));
        List<WebElement> pricesInCart = driver.findElements(By.xpath(".//div[contains(@class, 'sc-list-item-content')]//span[contains(@class, 'a-color-price')]"));
        String[] pricesInCartArray = {pricesInCart.get(0).getText(), pricesInCart.get(1).getText()};
        String[] titlesInCartArray = {productsInCart.get(0).getText(), productsInCart.get(1).getText()} ;
        String rawActTotalPrice = driver.findElement(By.xpath(".//div[contains(@class, 'sc-subtotal')]//span[contains(@class,'sc-price')]")).getText();
        double parsedActTotalPrice = Double.valueOf(NumberFormat.getCurrencyInstance(Locale.US).parse(rawActTotalPrice).toString());
        Assert.assertEquals("Number of products in cart is incorrect", 2, productsInCart.size());
        Assert.assertTrue("First title of product in cart is incorrect",Arrays.asList(titlesInCartArray).contains(firstTitle));
        Assert.assertTrue("Second title of product in cart is incorrect",Arrays.asList(titlesInCartArray).contains(secondTitle));
        Assert.assertTrue("First price of product in cart is incorrect",Arrays.asList(pricesInCartArray).contains(firstPrice));
        Assert.assertTrue("Second price of product in cart is incorrect",Arrays.asList(pricesInCartArray).contains(secondPrice));
        Assert.assertEquals("Total price is incorrect", parsedActTotalPrice,parsedFirstPrice+parsedSecondPrice, 0.1);
        }

    @Test
    public void checkDeletingProductsFromCart() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement departments = driver.findElement(By.xpath(".//*[@id='nav-main']//span[text()='Departments']"));
        Actions action = new Actions(driver);
        action.moveToElement(departments).build().perform();
        WebElement allCategoris = driver.findElement(By.xpath(".//span[@class='nav-text' and text()='Full Store Directory']"));
        allCategoris.click();
        WebElement books = driver.findElement(By.xpath(".//a[text()='Books']"));
        books.click();
        List<WebElement> bookOffers1 = driver.findElements(By.xpath(".//li[contains(@class, 'a-carousel-card')]"));
        bookOffers1.get(0).click();
        String firstTitleInCart = driver.findElement(By.id("productTitle")).getText();
        WebElement addToCart1 = driver.findElement(By.id("add-to-cart-button"));
        addToCart1.click();
        driver.navigate().back();
        driver.navigate().back();
        List<WebElement> bookOffers2 = driver.findElements(By.xpath(".//li[contains(@class, 'a-carousel-card')]"));
        bookOffers2.get(1).click();
        String secondTitleInCart = driver.findElement(By.id("productTitle")).getText();
        WebElement addToCart2 = driver.findElement(By.id("add-to-cart-button"));
        addToCart2.click();
        driver.navigate().back();
        driver.navigate().back();
        List<WebElement> bookOffers3 = driver.findElements(By.xpath(".//li[contains(@class, 'a-carousel-card')]"));
        bookOffers3.get(2).click();
        String thirdTitleInCart = driver.findElement(By.id("productTitle")).getText();
        WebElement addToCart3 = driver.findElement(By.id("add-to-cart-button"));
        addToCart3.click();
        WebElement goToCart = driver.findElement(By.id("nav-cart"));
        goToCart.click();
        List<WebElement> inCartBeforeDeleting = driver.findElements(By.xpath(".//div[@data-action='delete']//span[@class='sc-product-title']"));
        String actualTitle1 = inCartBeforeDeleting.get(0).getAttribute("innerHTML").trim();
        String actualTitle2 = inCartBeforeDeleting.get(1).getAttribute("innerHTML").trim();
        String actualTitle3 = inCartBeforeDeleting.get(2).getAttribute("innerHTML").trim();
        String[] actualTitles = {actualTitle1, actualTitle2, actualTitle3};
        Assert.assertTrue("First title is incorrect", Arrays.asList(actualTitles).contains(firstTitleInCart));
        Assert.assertTrue("Second title is incorrect", Arrays.asList(actualTitles).contains(secondTitleInCart));
        Assert.assertTrue("Third title is incorrect", Arrays.asList(actualTitles).contains(thirdTitleInCart));
        //deleting third item
        List<WebElement> deleteCheckboxes = driver.findElements(By.xpath(".//div[@class='sc-list-item-content']//input[@value='Delete']"));
        deleteCheckboxes.get(2).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        List titlesAfterDeletionArray = new ArrayList(3);
        List<WebElement> inCartAfterDeletion = driver.findElements(By.xpath(".//div[@class='sc-list-item-content']//span[contains(@class, 'a-list-item')]//span[contains(@class, 'sc-product-title')]"));
        Iterator<WebElement> itr = inCartAfterDeletion.iterator();
        while (itr.hasNext()){
            titlesAfterDeletionArray.add(itr.next().getAttribute("innerHTML").trim());
        }
        String actTitleAfterDeletion1 = inCartAfterDeletion.get(0).getAttribute("innerHTML").trim();
        String actTitleAfterDeletion2 = inCartAfterDeletion.get(1).getAttribute("innerHTML").trim();

        String[] actTitlesAfterDeletion = {actTitleAfterDeletion1, actTitleAfterDeletion2};
        System.out.println(inCartAfterDeletion.size());
        Assert.assertFalse("Cart still contains deleted item", Arrays.asList(titlesAfterDeletionArray).contains(actualTitle3));
        Assert.assertTrue("Number of products in cart after deletion is incorrect", titlesAfterDeletionArray.size() == 2);

    }

    @Test
    public void checkLogin() {
        WebElement yourAmazon = driver.findElement(By.id("nav-your-amazon"));
        yourAmazon.click();
        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("lena-test-01@ya.ru");
        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("gfhjkm13");
        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement helloUser = driver.findElement(By.xpath(".//span[@class='nav-line-3']"));
        String expHelloUser = "olena";
        String actGreeting = helloUser.getAttribute("innerHTML");
        Assert.assertTrue("Login greeting is incorrect", actGreeting.contains(expHelloUser));
    }

}
