package stackoverflow.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olenka on 05.01.2017.
 */
public class StackoverflowBasePagesStepdefs {
    public static WebDriver driver;

    public void setupBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://stackoverflow.com/");
    }
}
