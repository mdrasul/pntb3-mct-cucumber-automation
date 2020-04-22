package homeworkmulticartallsteps;

import cucumber.api.java.en.Then;

public class SelectPinkShirt {
	
	
	@Then("^I select women pink shirt$")
	public void i_select_women_pink_shirt() {

	TestHelper.landtoppage=TestHelper.productpage.getPinkShirt();


	}
}
