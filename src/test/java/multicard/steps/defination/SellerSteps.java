package multicard.steps.defination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class SellerSteps {
	MctTestHelper testHelper;


	public SellerSteps(MctTestHelper testHelper ){
	
		this.testHelper=testHelper;
		}
	 @Then("^I want to count left align WebElement avaiable$")
	    public void i_want_to_count_left_align_webelement_avaiable() throws Throwable {
//	        throw new PendingException();
	   testHelper.getsellerpage().countElementInleftAlignOptions();
	   System.out.println("Successfully found elements:");
    }
	 @Then("I want to check All WebElement available")
	 public void i_want_to_check_All_WebElement_available(DataTable datatable) {
	     // Write code here that turns the phrase above into concrete actions
//	     throw new io.cucumber.java.PendingException();

        List<String> expectedelementsList = datatable.asList(String.class);

		for (int i = 0; i < expectedelementsList.size(); i++) {
				System.out.println("ExpectedList [" + i + "] :" + expectedelementsList.get(i));
		}

			List<String> actualelementsList =testHelper.getsellerpage().getWebelementsListtable(); 
			for (int j = 0; j < actualelementsList.size(); j++) {
				System.out.println("ActualList [" + j + "] :" + actualelementsList.get(j));
			}
	 }

}
