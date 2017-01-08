package ui_bdd.stackoverflow.stackoverflowMapping;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by olenka on 04.01.2017.
 */
public class StartPage {

    private WebDriver driver;

    public StartPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (className = "bounty-indicator-tab")
    public WebElement numberOfFeatured;

    @FindBy (xpath = ".//a[2][@class='login-link']")
    public WebElement loginButton;

    @FindBy (className = "question-hyperlink")
    public WebElement topQuestion;

    @FindBy (id = "nav-users")
    public WebElement usersTab;

    @FindBy (xpath = ".//div[@class='job-wrap']//div[@class='title']")
    List<WebElement> jobTitles;

    public int getNumberOfFeatured(){
        int numberOfFeaturedInt = Integer.parseInt(numberOfFeatured.getText());
        return numberOfFeaturedInt;
    }

    public void getMaxSalary() {
        List<Integer> salaries = new ArrayList<Integer>(5);
        Pattern p = Pattern.compile("\\$(\\d+)[Kk]");
        Iterator<WebElement> itr = jobTitles.iterator();

        while (itr.hasNext()) {
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
}
