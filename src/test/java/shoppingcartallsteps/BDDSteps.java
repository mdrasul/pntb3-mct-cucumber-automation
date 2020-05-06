package shoppingcartallsteps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shoppingcartallpages.CategoryPage;

public class BDDSteps {

	TestHelper helper;
	public BDDSteps(TestHelper helper){
		this.helper=helper;
	}
	@When("^I select more now$")
	public void i_select_more_now(){
		helper.getCategorypage();	
		helper.getCategorypage().getclickonmore();


	}




	@Then("^I click on shoe$")
	public void i_click_on_shoe() {
		helper.getCategorypage().clickonshoe();
	}
	@Then("^I checkout as a guest$")
	public void i_checkout_as_a_guest() {
		
		helper.getCategorypage().moveforBilling();
		helper.getBillingpage().getAddresses();

	}

}
