package testRunners.Sample;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = {"stepDefs"},
        plugin = {"pretty", "json:target/cucumber.json",
        },
        tags = {"@Ykaya"}

)
public class UIRunCukes extends AbstractTestNGCucumberTests {
}
