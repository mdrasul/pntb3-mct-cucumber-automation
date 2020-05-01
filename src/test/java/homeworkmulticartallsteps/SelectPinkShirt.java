package homeworkmulticartallsteps;

import cucumber.api.java.en.Then;

public class SelectPinkShirt {
	TestHelper helper;
	public SelectPinkShirt(TestHelper helper){
		this.helper=helper;
	}
	
	@Then("^I select women pink shirt$")
	public void i_select_women_pink_shirt() {

	
			helper.getProductpage().getPinkShirt();


	}
}
