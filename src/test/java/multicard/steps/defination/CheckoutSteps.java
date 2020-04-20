package multicard.steps.defination;


import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class CheckoutSteps {
	
	MctTestHelper testHelper;

	
	public CheckoutSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
		
	}

	@Then("^I navigate to the accesories page$")
	public void i_navigate_to_the_accesories_page() throws Throwable {
		testHelper.getMyaccount().navigatetoAccesoriesPage();	
		System.out.println("############# Navigated to the accesories page ###########");
	}

	@Then("^I select a product$")
	public void i_select_a_product() throws Throwable {
		testHelper.getAccesories().selectAProduct();
		System.out.println("############# Selected a product ###########");
	}

	@Then("^I click buy now on the product page$")
	public void i_click_buy_now_on_the_product_page() throws Throwable {
		testHelper.getAccesories().clickBuyNow();
		System.out.println("#############  buy now ###########");
	}
	@Then("^I click checkout on my cart$")
	public void i_click_checkout_on_my_cart() throws Throwable {
	    testHelper.getAccesories().clickCheckOut();
	    System.out.println("#############  check out ###########");
	  
	}
}
