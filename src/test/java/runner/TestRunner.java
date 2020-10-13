package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue = {"com.stepDef"},
		tags = {"@test"},
		plugin = {"pretty", "json:target/cucumber.json"}
)
public class TestRunner {
	@AfterClass
	public static void tearDown() {
		HTMLReporter.main(new String[]{});
	}
}