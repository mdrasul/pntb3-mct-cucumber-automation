package multicard.steps.defination;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class MyAccountSteps {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public MyAccountSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@When("^I navigate to my Account page$")
	public void i_navigate_to_my_Account_page() {
		System.out.println("#### I navigate to my Account page ######");
		testHelper.getHome().navigateToMyAccountPage();
	}

	@Then("^I see all aviable options$")
	public void i_see_all_aviable_options() {
		System.out.println("#### I see all aviable options ######");
	}

	// ==== Professional Implementation but Immatured

	@Then("^I see options \"(.*?)\" available$")
	public void i_see_options_option(String optionName) throws Throwable {
		System.out.println("#### I see options " + optionName + " option ######");

		Assert.assertEquals("Option Not Avaiable !!", true, testHelper.getMyaccount().isOptionExist(optionName));
	}

	@Then("^I see all aviable options below$")
	public void i_see_all_aviable_options_below(DataTable dataTable) {

		// Expected Options from Gherkin
		List<String> expectedOptionsNames = dataTable.asList(String.class);

		for (int i = 0; i < expectedOptionsNames.size(); i++) {
			System.out.println("Exp [" + i + "] :" + expectedOptionsNames.get(i));
		}

		// Actual Options from Real My Account Page
		List<String> actualOptionsNames = testHelper.getMyaccount().getAllOptionText();
		for (int i = 0; i < actualOptionsNames.size(); i++) {
			System.out.println("Actual [" + i + "] :" + actualOptionsNames.get(i));

//			Assert.assertEquals("Expectd Option Not matched with Actual !!", expectedOptionsNames.get(i),
//					actualOptionsNames.get(i));
		}

		// ==== We will Check in Next Class
		
		//assertThat(expectedOptionsNames, equalTo(actualOptionsNames));

		//assertThat(expectedOptionsNames, equals(actualOptionsNames));
		//assertThat(expectedOptionsNames, equals(actualOptionsNames));

		// Validating One List Object With Another List Object
//		Assert.assertEquals("Expectd Option Table Not Matched !!", true,
//				expectedOptionsNames.equals(actualOptionsNames));

	}

}
