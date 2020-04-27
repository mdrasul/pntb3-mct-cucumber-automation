package multicard.steps.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class Seller_DashBoard_Accessories_steps {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Seller_DashBoard_Accessories_steps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@Given("I navigate to  account page")
	public void i_navigate_to_account_page() {
		testHelper.getHome().navigateToMyAccountPage();
	}

	@When("I select seller dashbosrd")
	public void i_select_seller_dashbosrd() {
		testHelper.getDashBoard().navigateToDashBoardPage();

	}

	@Given("i click on my catalog and navigate to catalog page")
	public void i_click_on_my_catalog_and_navigate_to_catalog_page() {
		testHelper.getDashBoard().clickCatalogbtn();
	}

//
	@When("I see catalog i click on Accessories link")
	public void i_see_catalog_i_click_on_Accessories_link() {
		testHelper.getDashBoard().clickOnAccessoriesLink();

	}

	@Then("i fill out accessories new product page one")
	public void i_fill_out_accessories_new_product_page_one() {
		testHelper.getDashBoard().addNewProductPage_1();
	}

	@Then("I select proceed and land on varient details")
	public void i_select_proceed_and_land_on_varient_details() {
		testHelper.getDashBoard().addNewProductPage_2();
	}

	@When("I land on varient details I must fill out shipping  detail and item photo and add product")
	public void i_land_on_varient_details_I_must_fill_out_shipping_detail_and_item_photo_and_add_product() {
		testHelper.getDashBoard().addnewProductPage3();
	}

}
