package homeworkmulticartallsteps;

import cucumber.api.java.en.Then;

public class BuyNowCheckoutSteps {
	TestHelper helper;
	public BuyNowCheckoutSteps(TestHelper helper){
		this.helper=helper;
	}
	@Then("^I click buy now for checkout$")
	public void i_click_buy_now_for_checkout() {
	//	helper.shoppingcartpage=
		helper.getLandtoppage().selectBuyNow();
	//	helper.checkoutpage= 
		helper.getShoppingcartpage().selectcheckoutbutton();
	}

}
