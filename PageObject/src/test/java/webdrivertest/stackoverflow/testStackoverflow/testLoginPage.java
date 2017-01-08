package webdrivertest.stackoverflow.testStackoverflow;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdrivertest.stackoverflow.stackoverflowMapping.LoginPage;
import webdrivertest.stackoverflow.stackoverflowMapping.StartPage;

/**
 * Created by olenka on 08.01.2017.
 */
public class testLoginPage {

    public static WebDriver driver;
    public static StartPage startPage;
    public static LoginPage loginPage;

    @Before
    public void setupStartConditions() {
        driver = new FirefoxDriver();
        startPage = new StartPage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/");
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkSocialAuthorizationBlocksArePresent() {
        startPage.loginButton.click();
        Assert.assertTrue("Page does not have Google Authorization icon", loginPage.google.size() > 0);
        Assert.assertTrue("Page does not have Facebook Authorization icon", loginPage.facebook.size() > 0);
    }
}
