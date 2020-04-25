package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import multicard.steps.support.MctTestHelper;

public class AffiliateRegSteps {

	MctTestHelper testHelper;

	public AffiliateRegSteps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@Given("I start affilate reg progress")
	public void i_start_affilate_reg_progress() {
		testHelper.getHome().navigateToAffilateRegPage();

	}

	@And("I complete affilate registration")
	public void i_complete_affilate_registration() {
		testHelper.getAffiliateRegPage().completeAffiliateReg();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// Fore Fail Code
		Assert.assertEquals("Intentationaly Failed ", true, 2>3 );
	}


}
