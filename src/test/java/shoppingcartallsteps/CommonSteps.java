package shoppingcartallsteps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import shoppingcartallsteps.TestHelper;

public class CommonSteps {
	TestHelper helper;
	public CommonSteps(TestHelper helper){
		this.helper=helper;
	}
	@Given("^I open browser chrome$")
	public void i_open_browser_chrome(){

      helper.getDriver();
		

	}

	@Given("^I land on multicart landing page$")
	public void i_land_on_multicart_landing_page() {
		helper.getDriver().get("https://www.demo.iscripts.com/multicart/demo/index.php");
	}
}
