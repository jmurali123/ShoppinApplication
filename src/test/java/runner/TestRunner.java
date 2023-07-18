package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"stepdefinitions","hooks"},
        tags="@newfeature",
        plugin={"html:target/cucumber/cucumber.html"}

)

public class TestRunner {
}
