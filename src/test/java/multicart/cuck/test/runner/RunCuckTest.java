package multicart.cuck.test.runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/" }, 
				 glue={"multicard.steps.defination", "multicard.steps.support"},
				 plugin = { "pretty", "json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports" },
				 tags = {"@mcttest"},
				 snippets = SnippetType.CAMELCASE
				 )
public class RunCuckTest {
}
 	