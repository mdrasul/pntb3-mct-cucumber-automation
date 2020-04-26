package multicard.steps.defination;







import org.junit.Assert;

import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class ShoppingCartSteps {
	MctTestHelper testHelper;


	public ShoppingCartSteps(MctTestHelper testHelper ){
	
		this.testHelper=testHelper;

	}
	@When("I want to buy two Shirt and checkout")
	public void i_want_to_buy_two_Shirt_and_checkout() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		testHelper.getshoppingcartPage().doingthecheckout("2");
		System.out.println("successfuly checking out happened");
	}
	@When("I want to check Product Total available")
	public void i_want_to_check_Product_Total_available() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String expectedText1 = "Product Total : ";
		String actualText2 =testHelper.getshoppingcartPage().getPruductTotalText();
		Assert.assertEquals("No product total text found:", expectedText1, actualText2 );
	}
}
