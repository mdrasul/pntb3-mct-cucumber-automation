package homeworkmulticartallsteps;

import cucumber.api.java.en.When;
import homeworkmulticartallpages.HomePage;

public class SelectClothing {
	TestHelper helper;
	public SelectClothing(TestHelper helper){
		this.helper=helper;
	}
	@When("^I select clothing option for purchase$")
	public void i_select_clothing_option_for_purchase() {
	 
		helper.getHomepage().getItemSelect();
	
	}

}
