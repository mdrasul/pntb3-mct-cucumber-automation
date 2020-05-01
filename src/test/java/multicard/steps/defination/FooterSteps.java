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
	
//	***********String mainUrl = "https://www.demo.iscripts.com/multicart/demo/index.php";
//	***********String footer_xpath= "//*[@id=\"footersection\"]/section/div[1]/div/h1";
	
	
	/** Constructor */
	public FooterSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}
//@When("I navigate to Home Page")
//public void i_navigate_to_Home_Page() {
//
//}

@When("I scroll to bottom of page")
public void i_scroll_to_bottom_of_page() {
	testHelper.getHome().scrollToBottom();
}

@Then("I see all avaiable footer links")
public void i_see_all_avaiable_footer_links() {
	boolean footerLinksExist = testHelper.getHome().validateGetToKnow();
	Assert.assertEquals("Footer links not available", true, footerLinksExist);
	System.out.println("#### i see all footer links ###");
}

}
