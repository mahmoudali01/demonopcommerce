package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
      features = "src\\main\\resources\\features",
        glue = "stepDefinitions",
        tags = "@regression",
        plugin = {"json:target/cucumber.json",
                "html:target/reports/emailable-report.html",

        }

)
public class TestRunner {
}
