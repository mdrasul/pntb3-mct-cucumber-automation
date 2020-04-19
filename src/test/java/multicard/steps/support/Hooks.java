package multicard.steps.support;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import multicard.util.ReadConfigFile;
import multicard.util.SharedConfig;



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

		// Read & prepare the Config for the entire system 
		// Sttatic Method not need a Object to be Created 
		try {
			SharedConfig.config = ReadConfigFile.readProperties();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

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
		
		// This Check is for Only If testt Running iN Grid Sttop 
		if(SharedConfig.config.get("seleniumEnvironment").equals("Grid")) {
			((JavascriptExecutor) testHelper.getDriver()).executeScript("sauce:job-result=" + (scenario.isFailed() ? "failed" : "passed"));
		}
		
		
		testHelper.getDriver().close();
	}

}
