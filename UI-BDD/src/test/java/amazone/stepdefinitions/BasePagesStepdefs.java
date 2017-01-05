package amazone.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olenka on 05.01.2017.
 */
public class BasePagesStepdefs {
    public static WebDriver driver;

    public void setupBrowser() {
        driver = new FirefoxDriver();
        System.out.println("Created new driver from base");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }
}
