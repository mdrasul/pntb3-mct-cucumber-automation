package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import multicard.steps.support.*;

public class SellerSignUpSteps {
	MctTestHelper testHelper;

public SellerSignUpSteps(MctTestHelper testHelper) {
	this.testHelper = testHelper;
}
	
	@Given("^I start seller signup process$")
	public void i_start_signUp_Process() {
		// From Home Page Move To Sign Up PAge 
		testHelper.getHome().navigateToSellerSignUpPage();
	}
	
	@And("^I Complete seller registration$")
	public void i_Complete_seller_Registration() {
		testHelper.getSellerSignUpPage().sellerSignUp();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Fore Fail Code
		Assert.assertEquals("Intentationaly Failed ", true, 2>3 );
		}
		
		
	

	}

