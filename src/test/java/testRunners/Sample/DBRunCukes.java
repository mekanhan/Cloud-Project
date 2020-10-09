package testRunners.Sample;

import Utilities.Constant;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = {"stepDefs"},
        plugin = {"pretty", "json:target/cucumber.json",
           },
        tags = {"@dbtest"}
)

public class DBRunCukes extends AbstractTestNGCucumberTests {
    static {
        Constant.TEST_APP="db";
    }
}
