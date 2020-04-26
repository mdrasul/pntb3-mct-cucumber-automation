package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class HomeSteps {
	MctTestHelper testHelper;


	public HomeSteps(MctTestHelper testHelper ){
	
		this.testHelper=testHelper;

	}

	@Then("I type SLIM FIT SOLID FORMA in Search Box")
	public void i_type_SLIM_FIT_SOLID_FORMA_in_Search_Box() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		testHelper.getHome().writeInSearch_SLIM_FIT_SOLID_FORMA("SLIM FIT SOLID FORMA");
		System.out.println("Successfully write SLIM FIT SOLID FORMA in search box");
	}

	@And("I validate  Slim Fit Solid Formal Shi.. in the Search page")
	public void i_validate_Slim_Fit_Solid_Formal_Shi_in_the_Search_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	    String expectedText = "SLIM FIT SOLID FORMAL SHI..";
	    String actualText = testHelper.getHome().getSlim_Fit_Solid_Forma();
		Assert.assertEquals("Text Not Found:", expectedText, actualText );
}
	@Then("I type abcd in Search Box")
	public void i_type_abcd_in_Search_Box() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		testHelper.getHome().writeInSearch_abcd("abcd");
		System.out.println("Successfully write abcd in search box");
	}

	@And("I validate  No Results Found !! in the Search page")
	public void i_validate_No_Results_Found_in_the_Search_page() {
	    // Write code here that turns the phrase above into concrete actions
//throw new io.cucumber.java.PendingException();
		String expectedText = "No Results Found !!";
	    String actualText = testHelper.getHome().getTextNo_Results_Found();
		Assert.assertEquals("Text Not Found:", expectedText, actualText );
	}
	@Then("I type SLIM FIT  in Search Box")
	public void i_type_SLIM_FIT_in_Search_Box() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		testHelper.getHome().writeInSearch_Slim_Fit("Slim Fit");
		System.out.println("Successfully write Slim Fit in search box");
	}

	@And("I want to navigate to Shopping Cart page")
	public void i_want_to_navigate_to_Shopping_Cart_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		testHelper.getHome().NavigateToShoppingCartPage();
		System.out.println("Successfully Navigate To Shopping Cart Page ");
	}


}
