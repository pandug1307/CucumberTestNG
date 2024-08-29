package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginPage.feature",
        glue = {"StepDefinitions"},
        plugin = {
                "pretty",
                "html:target/HTML_Reports/CucumberReports",
                "json:target/JSON_Reports/CucumberReports.json",
                "junit:target/JUNIT_Reports/CucumberReports.xml",
                },
        publish = true,
        dryRun = false,
        monochrome = true,
        tags= "@smoketest"
)
public class JUnit_TestRunner {
}