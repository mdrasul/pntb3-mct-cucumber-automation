package shoppingrunnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, 
				 glue={"shoppingcartallsteps"},
				 plugin = { "pretty", "html:out" },
		 	      tags = {"@WIP "},
				 snippets = SnippetType.CAMELCASE
				 )
public class RunnerClass {

}
