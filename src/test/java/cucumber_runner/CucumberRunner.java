package cucumber_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/feature_files",
        tags = "@Regression",
        glue = {"step_definitions","test_base"},
        plugin = {"pretty","html:target/cucumber-reports/report.html"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
