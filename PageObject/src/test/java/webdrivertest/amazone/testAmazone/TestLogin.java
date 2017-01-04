package webdrivertest.amazone.amazoneMapping.testAmazone;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdrivertest.amazone.amazoneMapping.LoginPage;
import webdrivertest.amazone.amazoneMapping.StartPage;
import webdrivertest.amazone.amazoneMapping.UserProfile;

/**
 * Created by olenka on 22.12.2016.
 */
public class TestLogin {

    public static WebDriver driver;
    public static StartPage startPage;
    public static UserProfile userProfile;
    public static LoginPage loginPage;


    @BeforeClass
    public static void setupStartConditions() {
        driver = new FirefoxDriver();
        startPage = new StartPage(driver);
        userProfile = new UserProfile(driver);
        loginPage = new LoginPage(driver);
    }

    @Before
    public void beforeEachTest() {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkLogin(){
        startPage.goToLoginPage();
        loginPage.setEmail("lena-test-01@ya.ru");
        loginPage.setPassword("gfhjkm13");
        loginPage.clickLogin();
        Assert.assertTrue("Login greeting is incorrect", userProfile.getUserName().contains("olena"));
    }

}
