package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class FooterLinksSteps {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public FooterLinksSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@When("^I check all the footers are available$")
	public void i_check_all_the_footers_in_first_column() {

		System.out.println(testHelper.getHome().getallFooterLinksText());

	}

	@Then("^I varify all the footer links are available$")
	public void i_varify_all_the_footer_links_are_available() {
		boolean footerLinksExist = testHelper.getHome().isAllFooterLinksAvailable();
		Assert.assertEquals(" Footer Links Not Exist.", true, footerLinksExist);

	}

	@When("^I check about us link is active$")
	public void i_check_about_us_link_is_active() {
		testHelper.getHome().checkAboutUsLink();

	}

	@When("^I check view cart link is active$")
	public void i_check_view_cart_link_is_active() {
		testHelper.getHome().checkViewCartLink();

	}

	@When("^I check affiliates link is active$")
	public void i_check_affiliates_link_is_active() {
		testHelper.getHome().checkAffiliatestLink();

	}

	@When("^I check Twitter link is active$")
	public void i_check_Twitter_link_is_active() {
		testHelper.getHome().clickTwitterLink();

	}

	@When("^I verify the link redirect to Twitter page$")
	public void i_verify_the_link_redirect_to_Twitter_page() {
		testHelper.getHome().redirectToTwitterPage();
		String currentUrl = testHelper.getHome().redirectToTwitterPage();
		Assert.assertEquals("https://twitter.com/multicart", currentUrl);
		System.out.println(currentUrl);

	}

	@When("^I check Facebook link is active$")
	public void i_check_Facebook_link_is_active() {
		testHelper.getHome().clickFacebookLink();

	}

	@When("^I verify the link redirect to Facebook page$")
	public void i_verify_the_link_redirect_to_Facebook_page() {
		testHelper.getHome().redirectToFacebookPage();
		String currentUrl = testHelper.getHome().redirectToFacebookPage();
		Assert.assertEquals("https://www.facebook.com/iscripts", currentUrl);
		System.out.println(currentUrl);

	}
	
	

}
