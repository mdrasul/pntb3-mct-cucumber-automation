package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class shoppingCartSteps {


	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public shoppingCartSteps(MctTestHelper testHelper ){
	
		this.testHelper=testHelper;

	}
	
	
	@When("^I navigate to Accessories page$")
	public void i_navigate_to_Accessories_page() {
	
		testHelper.getHome().naviagateToAccessoriesPage();
	
	}	
	

	@And("^i try to buy something$")
	public void i_try_to_buy_something() {
		
		testHelper.getAccessories().buyAnItem();
		
	}

	@Then("^i see the shopping cart table is available$")
	public void i_see_the_shopping_cart_table_is_available() {
	
		System.out.println("#### I expect shopping cart table is available ######");
		boolean ShoppingCartTableExist = testHelper.getAccessories().isShoppingCartTableExist();
		Assert.assertEquals("Shopping cart table Not Exist.", true, ShoppingCartTableExist );

	}

}
