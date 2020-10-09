package testRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "classpath:features",
        glue = {"stepDefs"},
        plugin = {"pretty", "json:target/cucumber.json",
                "html:target/cucumber-html-reports",
                "rerun:rerun/failed_scenarios.txt"
        }
)
public class RunCukes extends AbstractTestNGCucumberTests {

}
