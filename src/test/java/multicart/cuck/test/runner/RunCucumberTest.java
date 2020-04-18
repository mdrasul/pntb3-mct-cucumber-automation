package multicart.cuck.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/"}, 
		glue={"multicard.steps.defination", "multicard.steps.support"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, 
		tags = {"@mcttest"},
		monochrome=true
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}

	