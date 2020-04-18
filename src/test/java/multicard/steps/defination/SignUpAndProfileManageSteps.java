package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class SignUpAndProfileManageSteps {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public SignUpAndProfileManageSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@Given("^I start signUp Process$")
	public void i_start_signUp_Process() {
		// From Home Page Move To Sign Up PAge 
		testHelper.getHome().navigateToSignUpPage();
	}

	@When("^I Complete Registration$")
	public void i_Complete_Registration() {
		testHelper.getSignUpPage().completeSignUp();
		
		
		// Fore Fail Code
		Assert.assertEquals("Intentationaly Failed ", true, 2>3 );

	}

	@Then("^I Can navigate to profile page$")
	public void i_Can_navigate_to_profile_page() {
		testHelper.getHome().navigateToMyAccountPage();
		testHelper.getMyaccount().navigateToOption("Profile");
	}

	@Then("^I Can select a Country$")
	public void i_Can_Add_my_Country() {
		testHelper.getProfilePage().selectCountry("United Kingdom");		
	}

	@Then("^I can select a state$")
	public void i_can_add_my_state() {
		testHelper.getProfilePage().selectState("Cleveland");		
	}

}
