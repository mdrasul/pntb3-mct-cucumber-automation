//@Author-Jebril_Mohammad
package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class Seller_DashBoard_Caual_shirts {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Seller_DashBoard_Caual_shirts(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@When("^i see catalog i click on caual shirts link$")
	public void i_See_Catalog_I_Click_On_Caual_Shirts_Link() {
		testHelper.getMyaccount().clickOnCaualShirts();
	}

	@Then("^I fill out Casual shirts new product page one$")
	public void i_Fill_Out_Casual_Shirts_New_Product_Page_One() {
		testHelper.getCasualDahboard().addCasualProductPage1();
	}

	@And("^i Expect to see product under this category header on page two$")
	public void i_Expect_To_See_Product_Under_This_Category_Header_On_Page_Two() {
		System.out.println("###Validateeee###");
		boolean caualproductHeaderExist = testHelper.getCasualDahboard().isProductsCategoryHeadrerExist();
		Assert.assertEquals("catagory Page 2 product header does Not Exist.", true, caualproductHeaderExist);

	}

	@Then("^i select proceed and land on varient details$")
	public void i_Select_Proceed_And_Land_On_Varient_Details() {
		testHelper.getCasualDahboard().addCasualproductPage2();

	}

	@When("^i land on Varient details i fill out shipping details$")
	public void i_Land_On_Varient_Details_I_Fill_Out_Shipping_Details() {
		testHelper.getCasualDahboard().addNewCausalProductPage3();
	}
}
