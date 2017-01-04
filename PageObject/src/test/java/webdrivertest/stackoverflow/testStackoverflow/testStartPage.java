package webdrivertest.stackoverflow.testStackoverflow;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdrivertest.stackoverflow.stackoverflowMapping.StartPage;

/**
 * Created by olenka on 04.01.2017.
 */
public class testStartPage {

    public static WebDriver driver;
    public static StartPage startPage;


    @Before
    public void setupStartConditions() {
        driver = new FirefoxDriver();
        startPage = new StartPage(driver);
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/");
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkNumberOfFeatured(){
        Assert.assertTrue("Number of featured items is less than 300",startPage.getNumberOfFeatured() > 300);
    }

    @Test
    public void checkSocialAuthorizationBlocksArePresent() {
        startPage.loginButton.click();
        Assert.assertTrue("Page does not have Google Authorization icon", startPage.google.size() > 0);
        Assert.assertTrue("Page does not have Facebook Authorization icon", startPage.facebook.size() > 0);
    }

    @Test
    public void checkSalary() {
    startPage.getMaxSalary();
    }
}
