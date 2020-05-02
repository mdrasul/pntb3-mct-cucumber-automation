//@Author-Jebril_Mohammad
package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class SellerDashBoardStepsAccessories {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public SellerDashBoardStepsAccessories(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@Given("^I navigate to  account page$")
	public void iNavigateToAccountPage() {
		testHelper.getHome().navigateToMyAccountPage();

	}

	@When("^I select seller dashbosrd$")
	public void i_Select_Seller_Dashbosrd() {
		System.out.println("i select seller dashboard");
		testHelper.getMyaccount().navigateToDashboardPage();
	}

	@Then("^i expect to see Buyer dashBoard link$")
	public void i_Expect_To_See_Buyer_DashBoard_Link() {
		System.out.println("i expect to see seller dashboard");
		boolean pageHeaderExist = testHelper.getDashBoard().isHeaderExist();
		Assert.assertEquals("seller dashboard Page Header Not Exist.", true, pageHeaderExist);

	}

	@Given("^i click on my catalog and navigate to catalog page$")
	public void i_Click_On_My_Catalog_And_Navigate_To_Catalog_Page() {
		System.out.println("####i click on my catalog and navigate catalogpage####");
		testHelper.getDashBoard().clickCatalogbtn();
	}

	@Then("^i expect to see catalog existing categories$")
	public void i_Expect_To_See_Catalog_Existing_Categories() {
		System.out.println("i expect to see catalog existing catagories");
		boolean catalogHeaderExist = testHelper.getDashBoard().isCatalogCatagoriesExist();
		Assert.assertEquals("catalog Page Header Not Exist.", true, catalogHeaderExist);

	}

	@When("^I see catalog i click on Accessories link$")
	public void i_see_catalog_i_click_on_Accessories_link() {
		testHelper.getDashBoard().clickOnAccessoriesLink();
	}

	@Then("^i fill out accessories new product page one$")
	public void i_Fill_Out_Accessories_New_Product_Page_One() {
		testHelper.getDashBoard().addNewProductPage_1();

	}

	@And("^I Expect to see variants page link on page two$")
	public void i_Expect_to_see_variants_page_link_on_page_two() {
		boolean variantsLogExist = testHelper.getDashBoard().isVariantspage2Exizt();
		Assert.assertEquals("catagory Page 2 varients logo Not Exist.", true, variantsLogExist);
		System.out.println("###page Link 2###");
	}

	@Then("^I select proceed and land on varient details$")
	public void i_select_proceed_and_land_on_varient_details() {
		testHelper.getDashBoard().addNewProductPage_2();
	}

	@When("^I land on varient details I must fill out shipping  detail and item photo and add product$")
	public void i_Land_On_Varient_Details_IMust_Fill_Out_Shipping_Detail_And_Item_Photo_And_Add_Product() {
		testHelper.getDashBoard().addnewProductPage3();

	}
}
