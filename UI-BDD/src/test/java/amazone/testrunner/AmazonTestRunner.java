package amazone.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by olenka on 05.01.2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/nixreport", "json:target/cucumber.json"},
        features = "src/test/java/amazone/features",
        glue ="amazone.stepdefinitions",
        tags = {}
        )

public class AmazonTestRunner{
}
