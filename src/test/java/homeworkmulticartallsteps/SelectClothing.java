package homeworkmulticartallsteps;

import cucumber.api.java.en.When;
import homeworkmulticartallpages.HomePage;

public class SelectClothing {
	@When("^I select clothing option for purchase$")
	public void i_select_clothing_option_for_purchase() {
		TestHelper.homepage=new HomePage(TestHelper.driver);
		TestHelper.productpage=  TestHelper.homepage.getItemSelect();
	
	}

}
