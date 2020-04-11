package multicard.steps.defination;

import cucumber.api.java.en.Given;
import multicard.steps.support.MctTestHelper;

public class CommonSteps {

	
	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public CommonSteps(MctTestHelper testHelper ){
		this.testHelper=testHelper;
	}

	/** Steps Common For All  */
	
	@Given("^I open browser chrome$")
	public void i_open_browser_chrome(){
		testHelper.getDriver();
	}

	@Given("^I land on multicart landing page$")
	public void i_land_on_multicart_landing_page(){
		System.out.println("#### I land on multicart landing page ######");
		testHelper.getHome().gotoHomePage();
	}

	
}
