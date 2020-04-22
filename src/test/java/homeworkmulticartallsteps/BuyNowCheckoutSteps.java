package homeworkmulticartallsteps;

import cucumber.api.java.en.Then;

public class BuyNowCheckoutSteps {

	@Then("^I click buy now for checkout$")
	public void i_click_buy_now_for_checkout() {
		TestHelper.shoppingcartpage=TestHelper.landtoppage.selectBuyNow();
		TestHelper.checkoutpage= TestHelper.shoppingcartpage.selectcheckoutbutton();
	}

}
