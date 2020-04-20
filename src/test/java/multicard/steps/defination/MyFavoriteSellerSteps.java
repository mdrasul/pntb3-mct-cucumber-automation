package multicard.steps.defination;

import org.junit.Assert;


import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class MyFavoriteSellerSteps {
	
	MctTestHelper testHelper;

	
	public MyFavoriteSellerSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
		
	}
	
	@Then("^I navigate to my favorite sellers tab$")
	public void i_navigate_to_my_favorite_sellers_tab() throws Throwable {
		testHelper.getMyaccount().navigateToMyFavoriteSellersPage();	  
		System.out.println("#### I navigate to my favorite sellers tab ######");
	}

	@Then("^I validate if there are any favorite sellers present$")
	public void i_validate_if_there_are_any_favorite_sellers_present() throws Throwable {
	    boolean myFavSellersTableExist = testHelper.getMyFavoriteSellers().isMyFavSellersTablePresent();
	    Assert.assertEquals("My favorite sellers not available", true, myFavSellersTableExist);
	    System.out.println("#### checking if theres any favorite sellers available ######");
	   
	}

}
