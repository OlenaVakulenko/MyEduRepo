package webdrivertest.stackoverflow;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by olenka on 19.12.2016.
 */
public class TestStackoverflow {

    WebDriver driver;

    @Before
    public void setupStartConditions() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/");
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkNumberOfFeatured(){
        WebElement numberOfFeatured = driver.findElement(By.className("bounty-indicator-tab"));
        int numberOfFeaturedInt = Integer.parseInt(numberOfFeatured.getText());
        Assert.assertTrue("Number of featured items is less than 300",numberOfFeaturedInt > 300 );
    }

    @Test
    public void checkSocialAuthorizationBlocksArePresent() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement signUpButton = driver.findElement(By.xpath(".//a[2][@class='login-link']"));
        signUpButton.click();
        Assert.assertTrue("Page does not have Google Authorization icon", driver.findElements(By.className("google-login")).size()>0);
        Assert.assertTrue("Page does not have Facebook Authorization icon", driver.findElements(By.className("facebook-login")).size()>0);
    }

    @Test
    public void checkDateOfTopQuestions() {
        WebElement topQuestion = driver.findElement(By.className("question-hyperlink"));
        topQuestion.click();
        String postDate = driver.findElement(By.xpath(".//*[@id='qinfo']/tbody/tr[1]/td[2]/p/b")).getText();
        Assert.assertEquals("Top question in posted not today", "today", postDate);
    }

    @Test
    public void checkSalary() {
        List<Integer> salaries = new ArrayList<Integer>(100);
        List<WebElement> jobTitles = driver.findElements(By.xpath(".//div[@class='job-wrap']//div[@class='title']"));
        Pattern p = Pattern.compile("\\$(\\d+)[Kk]");
        Iterator<WebElement> itr = jobTitles.iterator();

        while (itr.hasNext()){
            String offer = itr.next().getText();
            Matcher m = p.matcher(offer);
            System.out.println(offer);
            if (m.find()) {
                salaries.add(Integer.parseInt((m.group(1))));
                System.out.println(m.group(1));
            }
        }
        try {
            int max = Collections.max(salaries);
            Assert.assertTrue("There are no offers with salaries greater than 60k", max > 60);
        } catch (NoSuchElementException bashe) {
            System.out.println("There are no appropriate job offers");
        }
    }

    @Test
    //проверяем, что поиск на странице "Users" выдает релевантные результаты
    public void checkUserFilter() {
        WebElement usersTab = driver.findElement(By.id("nav-users"));
        usersTab.click();
        WebElement userFilterInput = driver.findElement(By.id("userfilter"));
        userFilterInput.sendKeys("bot");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> userNamesElements = driver.findElements(By.xpath(".//div[@class='user-details']/a"));
        for (WebElement user: userNamesElements){
            String username = user.getText().toLowerCase();
            Assert.assertTrue("User name " + username + " does not contain search query",username.contains("bot"));
        }
    }
}
