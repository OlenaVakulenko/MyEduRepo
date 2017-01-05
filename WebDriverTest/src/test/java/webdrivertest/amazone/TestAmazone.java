package webdrivertest.amazone;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    //тест падает, т.к. действительно не все результаты поиска содержат искомое слово (по состоянию на 21/12/16)
    public void checkSearchResultsContainString() {
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        String targetString = "duck";
        searchInput.sendKeys(targetString);
        WebElement searchButton = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> searchResults = driver.findElements(By.xpath(".//h2[contains(@class, 's-access-title')]"));
        for (WebElement searchResult: searchResults){
            String searchResultText = searchResult.getText().toLowerCase();
            Assert.assertTrue("Search result " + searchResultText + " does not contain substring" + targetString, searchResultText.contains(targetString));
        }
    }

    @Test
    public void checkNumberOfSearchResults() {
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        String targetString = "duck";
        searchInput.sendKeys(targetString);
        WebElement searchButton = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton.click();
        WebElement searchResultsString = driver.findElement(By.id("s-result-count"));
        Pattern p = Pattern.compile("of\\s(.*)\\sresults");
        Matcher m = p.matcher(searchResultsString.getText());
        m.find();
        int numberOfSearchResults = Integer.parseInt(m.group(1).replaceAll(",",""));

        WebElement category = driver.findElement(By.xpath(".//p[text()='Baby Products']"));
        category.click();
        WebElement searchResultsString1 = driver.findElement(By.id("s-result-count"));
        Pattern p1 = Pattern.compile("of\\s(.*)\\sresults");
        Matcher m1 = p.matcher(searchResultsString1.getText());
        m1.find();
        int numberOfSearchResultsByCategory = Integer.parseInt(m1.group(1).replaceAll(",",""));
        Assert.assertTrue("Number of search results in category is greater than number of total results", numberOfSearchResults >= numberOfSearchResultsByCategory);
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
        String secondTargetString = "Duck Commander Bobble Head";
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
        //first product:
        WebElement searchInput1 = driver.findElement(By.id("twotabsearchtextbox"));
        String firstTargetString = "knife kitchen";
        searchInput1.sendKeys(firstTargetString);
        WebElement searchButton1 = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton1.click();
        WebElement firstProduct = driver.findElement(By.xpath(".//h2[contains(@class, 's-access-title') and contains(text(), '8 Inch')]"));
        firstProduct.click();
        WebElement addToCart1 = driver.findElement(By.id("add-to-cart-button"));
        addToCart1.click();
        //second product:
        WebElement searchInput2 = driver.findElement(By.id("twotabsearchtextbox"));
        String secondTargetString = "Duck Commander Bobble Head";
        searchInput2.sendKeys(secondTargetString);
        WebElement searchButton2 = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton2.click();
        WebElement secondProduct = driver.findElement(By.className("s-access-title"));
        secondProduct.click();
        WebElement addToCart2 = driver.findElement(By.id("add-to-cart-button"));
        addToCart2.click();
        //third product
        WebElement searchInput3 = driver.findElement(By.id("twotabsearchtextbox"));
        String thirdTargetString = "Duck Commander Bobble Head (Si)";
        searchInput3.sendKeys(thirdTargetString);
        WebElement searchButton3 = driver.findElement(By.xpath(".//span[@id='nav-search-submit-text']/following-sibling::input"));
        searchButton3.click();
        WebElement thirdProduct = driver.findElement(By.className("s-access-title"));
        thirdProduct.click();
        WebElement addToCart3 = driver.findElement(By.id("add-to-cart-button"));
        addToCart3.click();
        //go to cart
        WebElement goToCart = driver.findElement(By.id("nav-cart"));
        goToCart.click();
        //deleting third item
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        List<WebElement> inCartBeforeDeletion = driver.findElements(By.xpath(".//div[@class='sc-list-item-content']//span[contains(@class, 'a-list-item')]//span[contains(@class, 'sc-product-title')]"));

        List<WebElement> deleteCheckboxes = driver.findElements(By.xpath(".//div[@class='sc-list-item-content']//input[@value='Delete']"));
        String deletedItem = inCartBeforeDeletion.get(2).getText();
        deleteCheckboxes.get(2).click();
        List<WebElement> inCartAfterDeletion = driver.findElements(By.xpath(".//div[@class='sc-list-item-content']//span[contains(@class, 'a-list-item')]//span[contains(@class, 'sc-product-title')]"));
        List inCartTitles = new ArrayList(3);
        for (WebElement item: inCartAfterDeletion) {
            System.out.println(inCartTitles);
            inCartTitles.add(item.getAttribute("innerHTML").trim());
        }
        Assert.assertFalse("Cart still contains deleted item", Arrays.asList(inCartTitles).contains(deletedItem));
        Assert.assertTrue("Number of products in cart after deletion is incorrect", inCartAfterDeletion.size() == 2);

    }

    @Test
    //логинимся и проверяем, что имя юзера появилось в шапке
    public void checkLogin() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
