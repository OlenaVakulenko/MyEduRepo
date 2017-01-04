package webdrivertest.stackoverflow.testStackoverflow;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdrivertest.stackoverflow.stackoverflowMapping.QuestionPage;
import webdrivertest.stackoverflow.stackoverflowMapping.StartPage;


/**
 * Created by olenka on 04.01.2017.
 */
public class testQuestionPage {

    public static WebDriver driver;
    public static QuestionPage questionPage;
    public static StartPage startPage;


    @Before
    public void setupStartConditions() {
        driver = new FirefoxDriver();
        questionPage = new QuestionPage(driver);
        startPage = new StartPage(driver);
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/");
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkDateOfTopQuestions() {
        startPage.topQuestion.click();
        Assert.assertEquals("Top question in posted not today", "today", questionPage.getPostDate());
    }

}
