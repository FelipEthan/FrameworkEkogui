package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary",
                "html:target/report.html",
                "json:target/report.json",
                "junit:target/.xml",
               "timeline:target/cucumber-timeline",
        },
        features = {"src/test/resources/features"},
        glue = "steps",
        monochrome = true,
        tags = "@Test2"
)
public class Runner {
    public Runner() {
    }

}