package multicard.steps.support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks {
	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Hooks(MctTestHelper testHelper) {

		this.testHelper = testHelper;
	}

	/** Hooks Before & After */
	@Before
	public void beforeScenarioStart() {
		System.out.println("Scenario Started... ");

		// Prepare a Test User James for All test
		testHelper.getJames().setID("user");
		testHelper.getJames().setPassword("pass");
		testHelper.getJames().setprofileName("JAMES WILLIAMS");
	}

	@After
	public void afterScenarioEnd(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				// Casting
				byte[] screenshot = ((TakesScreenshot) testHelper.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Scenario Ended... ");
		((JavascriptExecutor) testHelper.getDriver()).executeScript("sauce:job-result=" + (scenario.isFailed() ? "failed" : "passed"));
		testHelper.getDriver().close();
	}

}
