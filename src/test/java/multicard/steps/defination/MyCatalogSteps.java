package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.*;
import multicard.steps.support.MctTestHelper;

public class MyCatalogSteps {
	
	
	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public MyCatalogSteps(MctTestHelper testHelper ){
		this.testHelper=testHelper;
	}
	
	@When("^I select seller dashboard$")
	public void i_select_seller_dashboard(){
		testHelper.getHome().navigateToMyAccountPage().navigateToSellerDashboard();	
	}
	@Then("^I expect to land on seller page and click on \"(.*?)\"$")
	public void i_expect_to_land_on_seller_page_and_click_on(String optionName) throws Throwable {
		testHelper.getSellerDashboard().navegateToMyCatalog();
		System.out.println("#### I see options " + optionName + " option ######");

		Assert.assertEquals("Option Not Avaiable !!", true, testHelper.getSellerDashboard().isOptionExist(optionName));
	}

	@Then("^I slould be able click on \"(.*?)\"$")
	public void i_slould_be_able_click_on(String optionCategory) throws Throwable {
		testHelper.getSellerDashboard().navigateToAccessories();

		System.out.println("#### I see options " + optionCategory + " option ######");

		Assert.assertEquals("Option Not Avaiable !!", true, testHelper.getSellerDashboard().isOptionCategoryExist(optionCategory));
	    
	}

	@Then("^I should be able to List items$")
	public void i_should_be_able_to_List_items() throws Throwable {
		System.out.println("#### I should be able to List items ######");

		testHelper.getSellerDashboard().creatList();
	
	}

}
