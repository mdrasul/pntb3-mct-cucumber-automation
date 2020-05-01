package homeworkmulticartallsteps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import homeworkmulticartallpages.HomePage;

public class BillingShippinhSteps {
	TestHelper helper;
	public BillingShippinhSteps(TestHelper helper){
		this.helper=helper;
	}
	@Then("^fill up Billing and Shipping address$")
	public void fill_up_Billing_and_Shipping_address(){
		//helper.proceedpage=
		helper.getBillingpage().getAddresses();
		helper.getProceedpage().getForFinalCheckOut();
		
		String expected_gift_error_text= "Gift Certificate Code Does not Exists , Enter valid Gift Certificate Code";
		String actual_gift_error_text=helper.getProceedpage().getErrortext();
		Assert.assertEquals("Gift Certificate Code Does not Exists , Enter valid Gift Certificate Code....", expected_gift_error_text, actual_gift_error_text );
        
		helper.proceedpage.getcoupontext();
		String expected_coupon_error_text= "Sorry, this coupon code expired.";
		String actual_coupon_error_text=helper.proceedpage.getCouponErrortext();
		Assert.assertEquals("Sorry, this coupon code expired.....", expected_coupon_error_text, actual_coupon_error_text );

	}
	}
	
