package cucetestpackage.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import games.Palindrom;
import org.junit.Assert;

import static java.lang.Boolean.parseBoolean;

/**
 * Created by olenka on 08.12.2016.
 */
public class PalindromStepdefs {
    String actReversedString;
    boolean actResultWord;
    boolean actResultPhrase;
    @Given("^I reverse string \"([^\"]*)\"$")
    public void iReverseString(String arg0) throws Throwable {
        actReversedString = Palindrom.reverseString(arg0);
    }

    @Then("^Reversed string is \"([^\"]*)\"$")
    public void reversedStringIs(String arg0) throws Throwable {
        Assert.assertEquals(arg0, actReversedString);
    }

    @Given("^I check string with value \"([^\"]*)\"$")
    public void iCheckStringWithValue(String arg0) throws Throwable {
        actResultWord = Palindrom.checkWord(arg0);
    }

    @Then("^I get the result \"([^\"]*)\"$")
    public void iGetTheResult(String arg0) throws Throwable {
        Assert.assertEquals(parseBoolean(arg0),actResultWord);
    }

    @Given("^I check phrase with value \"([^\"]*)\"$")
    public void iCheckPhraseWithValue(String arg0) throws Throwable {
        actResultPhrase = Palindrom.checkPhrase(arg0);
    }

    @Then("^I get the output \"([^\"]*)\"$")
    public void iGetTheOutput(String arg0) throws Throwable {
        Assert.assertEquals(parseBoolean(arg0),actResultPhrase);
    }
}
