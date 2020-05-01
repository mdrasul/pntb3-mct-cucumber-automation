package homeworkmulticartallsteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	// Hooks 
	TestHelper helper;
	public Hooks(TestHelper helper){
		this.helper=helper;
	}
		@Before
		public void BeforeEachScenario() {
			System.out.println("****** Before Each Scenario  ");

		}
		
		@After
		public void AfterEachScenario(Scenario scenario) {
			System.out.println("****** After Each Scenario  ");
			helper.getDriver().close();

		}

}
