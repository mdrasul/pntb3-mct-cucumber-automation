package multicard.steps.defination;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class MyDashBoardSteps {
	
	// Dependency injection
		MctTestHelper testHelper;

		/** Constructor */
		public MyDashBoardSteps(MctTestHelper testHelper) {
			this.testHelper = testHelper;
		}

			
		@Then("I navigate to my DASHBORD page")
		public void i_navigate_to_my_DASHBORD_page() {
			
			testHelper.getHome().navigateToMyDashBoardPage();
			

	}

		@Then("I see Seller Login option")
		public void i_see_Seller_Login_option() {
			boolean sellerLoginExist = testHelper.getMyDashBoard().isSellerLoginAvailable();
			Assert.assertEquals("Seller Option Not Exist.", true, sellerLoginExist );
			
		}

}
