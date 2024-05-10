package starter.utils;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/destination/cucumber.json"},
        features = "src/test/resources/features",
        glue = "starter.stepdefinitions",
        tags = ("@Regresion")
)

public class RunnerBase {
}
