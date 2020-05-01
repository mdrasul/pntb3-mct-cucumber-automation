package homeworkmulticartallsteps;

import cucumber.api.java.en.Then;

public class GuestCheckoutSteps {
	
	TestHelper helper;
	public GuestCheckoutSteps(TestHelper helper){
		this.helper=helper;
	}
	@Then("^I checkout as a guest$")
	public void i_checkout_as_a_guest() {
		//helper.billingpage =
				
	helper.getCheckoutpage().selectcheckoutasaguest();
	}

}
