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

	
	@Given("I complete search with Cream Laber Bag")
	public void i_complete_search_with_Cream_Laber_Bag() {
	    //
		testHelper.getHome().searchwithKey("cream laber bag");
	}

	@Then("I expect search result contains Cream Laber Bag")
	public void i_expect_search_result_contains_Cream_Laber_Bag() {
	    
	}

}
