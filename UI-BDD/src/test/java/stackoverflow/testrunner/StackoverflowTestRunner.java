package stackoverflow.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by olenka on 05.01.2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/nixreport"},
        features = "src/test/java/stackoverflow/features",
        glue ="stackoverflow.stepdefinitions",
        tags = {}
        )

public class StackoverflowTestRunner {
}
