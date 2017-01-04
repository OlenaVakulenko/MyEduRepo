package webdrivertest.stackoverflow.testStackoverflow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdrivertest.stackoverflow.stackoverflowMapping.StartPage;
import webdrivertest.stackoverflow.stackoverflowMapping.UsersListPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by olenka on 04.01.2017.
 */
public class testUsersListPage {

    public static WebDriver driver;
    public static StartPage startPage;
    public static UsersListPage usersListPage;


    @Before
    public void setupStartConditions() {
        driver = new FirefoxDriver();
        startPage = new StartPage(driver);
        usersListPage = new UsersListPage(driver);
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/");
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkUserFilter() {
        startPage.usersTab.click();
        usersListPage.userFilterInput.sendKeys("bot");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        usersListPage.listOfUserNames();
    }
}
