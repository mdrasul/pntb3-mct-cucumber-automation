package multicard.steps.defination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import multicard.steps.support.MctTestHelper;

public class MyProductSteps {
	
	// Dependency injection
			MctTestHelper testHelper;

			/** Constructor */
			public MyProductSteps(MctTestHelper testHelper) {
				this.testHelper = testHelper;
			}
	
	
	
	
	@When("I navigate to product page")
	public void i_navigate_to_product_page() {
		
		testHelper.getSellerHome().navigateToMyProductsPage();
	    
	}

	@Then("I expect to see product table")
	public void i_expect_to_see_product_table() {
		
		boolean productTableExist = testHelper.getMyProduct().isProductTableExist();
		Assert.assertEquals("Product Table Not Found", true, productTableExist);
	    
	}

}
