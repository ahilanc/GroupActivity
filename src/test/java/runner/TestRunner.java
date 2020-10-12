package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/Features" }, glue = "com.stepDef", monochrome = true, dryRun = false, strict = true, tags = {
				"@test" }, plugin = { "pretty", "json:Reports\\output.json" })

public class TestRunner {

}