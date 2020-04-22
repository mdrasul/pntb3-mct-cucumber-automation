package homeworkmulticartallsteps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import homeworkmulticartallpages.HomePage;

public class BillingShippinhSteps {
	
	@Then("^fill up Billing and Shipping address$")
	public void fill_up_Billing_and_Shipping_address(){
		TestHelper.proceedpage=TestHelper.billingpage.getAddresses();
		TestHelper.proceedpage.getForFinalCheckOut();
		
		String expected_gift_error_text= "Gift Certificate Code Does not Exists , Enter valid Gift Certificate Code";
		String actual_gift_error_text=TestHelper.proceedpage.getErrortext();
		Assert.assertEquals("Gift Certificate Code Does not Exists , Enter valid Gift Certificate Code....", expected_gift_error_text, actual_gift_error_text );
        
		TestHelper.proceedpage.getcoupontext();
		String expected_coupon_error_text= "Sorry, this coupon code expired.";
		String actual_coupon_error_text=TestHelper.proceedpage.getCouponErrortext();
		Assert.assertEquals("Sorry, this coupon code expired.....", expected_coupon_error_text, actual_coupon_error_text );

	}
	}
	
