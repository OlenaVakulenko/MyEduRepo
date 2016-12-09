package cucetestpackage.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by olenka on 04.12.2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/nixreport", "json:target/cucumber.json"},
        features = "src/test/java/cucetestpackage/features",
        glue = "cucetestpackage.stepdefs",
        tags = {"@Snail, @Matrix, @Circle, @Square, @Palindrom"}
        )


public class TestRun {
}
