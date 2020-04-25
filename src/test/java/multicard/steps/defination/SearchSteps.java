package multicard.steps.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class SearchSteps {


	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public SearchSteps(MctTestHelper testHelper ){		
		this.testHelper=testHelper;
	}


	@Given("I complete search with Black Kajal")
	public void i_complete_search_with_Black_Kajal() {
		// 
		testHelper.getHome().searchwithKey("black kajal");
	}

	@Then("I expect search result contains black kajal")
	public void i_expect_search_result_contains_black_kajal() {
	}

}
