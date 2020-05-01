package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class ShopNowSteps {
	
	
	MctTestHelper testHelper;
	
	/** Constructor */
	public ShopNowSteps(MctTestHelper testHelper) {
	this.testHelper = testHelper;
	}
	
	@When("I click Shop Now")
	public void i_click_Shop_Now() {
		
		testHelper.getHome().navigateToMyCatagoryPage();
	    
	}

	@Then("I see All the  available products catagories")
	public void i_see_All_the_available_products_catagories() {
		
		boolean catagoryListExist = testHelper.getMyCatagory().isCatagoryAvailable();
		Assert.assertEquals("Catagories do not exist.", true, catagoryListExist );	
	    
	}




}
