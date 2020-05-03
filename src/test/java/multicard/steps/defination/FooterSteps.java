package multicard.steps.defination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import multicard.steps.support.MctTestHelper;

public class FooterSteps {
	MctTestHelper testHelper;
		
	
	/** Constructor */
	public FooterSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}
	

@When("I scroll to bottom of page")
public void i_scroll_to_bottom_of_page() {
	testHelper.getHome().scrollToBottom();
}

@Then("I see all avaiable first column footer links")
public void i_see_all_avaiable_first_column_footer_links() {
	boolean aboutUsFooterExist = testHelper.getHome().validateAboutUs();
	Assert.assertEquals("About Us Footer link not available", true, aboutUsFooterExist);
	System.out.println("######### I see About Us footer link ###########");
	
	boolean fAQFooterExist = testHelper.getHome().validateFAQ();
	Assert.assertEquals("FAQ Footer link not available", true, fAQFooterExist);
	System.out.println("######### I see FAQ footer link ###########");
	
	boolean helpFooterExist = testHelper.getHome().validateHelp();
	Assert.assertEquals("Help Footer link not available", true, helpFooterExist);
	System.out.println("######### I see Help footer link ###########");

	boolean siteFeedbackFooterExist = testHelper.getHome().validateSiteFeedback();
	Assert.assertEquals("Site Feedback Footer link not available", true, siteFeedbackFooterExist);
	System.out.println("######### I see Site Feedback footer link ###########");

	boolean termsConditionsFooterExist = testHelper.getHome().validateTermsCond();
	Assert.assertEquals("Terms & Conditions Footer link not available", true, termsConditionsFooterExist);
	System.out.println("######### I see Terms & Conditions footer link ###########");
	
	boolean contactFooterExist = testHelper.getHome().validateContact();
	Assert.assertEquals("Contact Us Footer link not available", true, contactFooterExist);
	System.out.println("######### I see Contact Us footer link ###########");

	
}


@Then("I see all available second column footer link")
public void i_see_all_available_second_column_footer_link() {
	
	boolean comboProdFooterExist = testHelper.getHome().validatecomboProd();
	Assert.assertEquals("Combo Products Footer link not available", true, comboProdFooterExist);
	System.out.println("######### I see Combo Products footer link ###########");
	
	boolean newProductsFooterExist = testHelper.getHome().validatenewProducts();
	Assert.assertEquals("New Products Footer link not available", true, newProductsFooterExist);
	System.out.println("######### I see New Products footer link ###########");
	
	boolean featuredProductsFooterExist = testHelper.getHome().validatefeaturedProducts();
	Assert.assertEquals("Featured Products Footer link not available", true, featuredProductsFooterExist);
	System.out.println("######### I see Featured Products footer link ###########");
	
	boolean categoriesFooterExist = testHelper.getHome().validatecategories();
	Assert.assertEquals("Categories Footer link not available", true, categoriesFooterExist);
	System.out.println("######### I see Categories footer link ###########");
	
	boolean viewCartFooterExist = testHelper.getHome().validateviewCart();
	Assert.assertEquals("View Cart Footer link not available", true, viewCartFooterExist);
	System.out.println("######### I see View Cart footer link ###########");
	
	boolean giftCertFooterExist = testHelper.getHome().validategiftCert();
	Assert.assertEquals("Gift Certificate Footer link not available", true, giftCertFooterExist);
	System.out.println("######### I see Gift Certificate footer link ###########");
	
	
}


}
