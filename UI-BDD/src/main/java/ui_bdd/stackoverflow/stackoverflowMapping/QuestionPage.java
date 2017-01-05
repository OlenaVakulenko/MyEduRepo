package ui_bdd.stackoverflow.stackoverflowMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by olenka on 04.01.2017.
 */
public class QuestionPage {

    private WebDriver driver;

    public QuestionPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@id='qinfo']/tbody/tr[1]/td[2]/p/b")
    public WebElement postDate;

    public String getPostDate() {
        return postDate.getText();
    }
}
