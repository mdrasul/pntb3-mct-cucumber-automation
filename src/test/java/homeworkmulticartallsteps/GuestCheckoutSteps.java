package homeworkmulticartallsteps;

import cucumber.api.java.en.Then;

public class GuestCheckoutSteps {
	
	
	@Then("^I checkout as a guest$")
	public void i_checkout_as_a_guest() {
		TestHelper.billingpage =TestHelper.checkoutpage.selectcheckoutasaguest();
	}

}
