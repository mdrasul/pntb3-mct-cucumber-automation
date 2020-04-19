package multicard.steps.defination;


import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class AddingCoupon {
	
	MctTestHelper testHelper;

	/** Constructor */
	public AddingCoupon(MctTestHelper testHelper ){
		this.testHelper=testHelper;
	}
	
	@Then("^I expect to land on seller page and click on Coupon Codes$")
	public void i_expect_to_land_on_seller_page_and_click_on_Coupon_Codes() throws Throwable {
		testHelper.getCuponPages().navigateToCouponCodes();
		
	}

	@Then("^I should be able to add coppon$")
	public void i_should_be_able_to_add_coppon() throws Throwable {
		testHelper.getCuponPages().addingCupon();
		
	}

}
