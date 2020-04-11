package multicard.steps.defination;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import multicard.steps.support.MctTestHelper;

public class LoginSteps {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public LoginSteps(MctTestHelper testHelper ){
	
		this.testHelper=testHelper;

	}

	/** Steps For Login Features   */
	
	@When("^I complete login with James valid credentails$")
	public void i_complete_login_for_James_valid_credentails() throws InterruptedException{
		System.out.println("#### i_complete_login_for_James_valid_credentails ######");	
		testHelper.getHome().doLogin(testHelper.getJames().getID(), testHelper.getJames().getPassword());
	}
	
	@When("^I complete login with James No Password credentails$")
	public void i_complete_login_for_James_No_Password_credentails() throws InterruptedException{
		System.out.println("#### i_complete_login_for_James_valid_credentails ######");			
		testHelper.getHome().doLogin(testHelper.getJames().getID(), "");
	}
	
	@When("^I complete login with James No Id credentails$")
	public void i_complete_login_with_James_No_Id_credentails() {
		System.out.println("#### I complete login with James No Id credentails ######");			
		testHelper.getHome().doLogin("",testHelper.getJames().getPassword());
	}

	@Then("^I expect to seee no password error text$")
	public void I_expect_to_seee_no_password_error_text(){
		System.out.println("#### I expect to seee profile Name as James Williams ######");
		
		// Do Login [ Home Page ] 
		String expectedErrorText = "Enter password";
		String actualErrorText = testHelper.getHome().getPasswordErrorText();
		
		Assert.assertEquals("No Password Error Text Found..", expectedErrorText, actualErrorText );

	}
	
	@Then("^I expect to seee enter user Name error text$")
	public void i_expect_to_seee_enter_user_Name_error_text() throws Throwable {

		System.out.println("#### I expect to seee profile Name as James Williams ######");
		
		// Do Login [ Home Page ] 
		String expectedErrorText = "Enter username";
		String actualErrorText =testHelper.getHome().getnoUserErrorText();
		
		Assert.assertEquals("No User Error Text Found....", expectedErrorText, actualErrorText );
	}
	
	@Then("^I expect to seee profile Name as James Williams$")
	public void i_expect_to_seee_profile_Name_as_James_Williams(){
		System.out.println("#### I expect to seee profile Name as James Williams ######");
		
		// Do Login [ Home Page ] 
		String expectedProfileName = testHelper.getJames().getProfileName();
		String actualProfileName = testHelper.getHome().getProfileName();
		Assert.assertEquals("James William is not Found after Login..", expectedProfileName, actualProfileName );

	}
	
	
	/** Steps For My Account Features   */

	@When("^I navigate to order page$")
	public void i_navigate_to_order_page() throws Throwable {
		System.out.println("#### I navigate to order page ######");
						
		testHelper.getHome().navigateToMyAccountPage();
		testHelper.getMyaccount().navigateToMOrderPage();
	}

	
	
	
}
