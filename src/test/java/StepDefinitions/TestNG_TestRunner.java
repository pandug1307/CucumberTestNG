package StepDefinitions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
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
public class TestNG_TestRunner extends AbstractTestNGCucumberTests {
}