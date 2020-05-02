package multicard.steps.defination;

import org.junit.Assert;
import java.util.List;
//import io.cucumber.datatable;
import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.Given;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import multicard.pages.object.model.checkorderPage;
import multicard.steps.support.MctTestHelper;
import multicard.steps.support.MctTestHelper;

public class checkorder {
	MctTestHelper testHelper;
public checkorder(MctTestHelper testHelper) {
	this.testHelper=testHelper;
}
	@When("^I make a search by orderId$")
	public void i_make_a_search_by_orderId() throws Throwable {
		System.out.println("#### I expect to select  orderID in the dropbox ######");
	testHelper.getcheckorder().selectsearch();	
	}
	
	@Then("^I enter  \"(.*?)\" in text box$")
	public void i_enter_in_text_box(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testHelper.getcheckorder().TypeId(arg1);
	}

	@Then("^I check existence of the \"(.*?)\" in History order and click on it$")
	public void i_check_existence_of_the_in_History_order(String arg1)  {
		System.out.println("#### I expect order ID is available ######");
		testHelper.getcheckorder().displayM(arg1);
		String expected= testHelper.getcheckorder().checkexistence();	
	Assert.assertEquals("the ID number does  exist",expected, arg1 );
	
	testHelper.getcheckorder().clickondetail();

	}
	@Then("I see all the availaible options on check order")
	public void i_see_all_the_availaible_options_on_check_order(DataTable dataTable) {
		System.out.println("#### I expect order form options are available ######");

		List<String> checknameorder = dataTable.asList(String.class);
	 
		for (int i =0;i<checknameorder.size();i++) {
			//actual display
			 String actualnameorder=checknameorder.get(i);
		System.out.println("theactual name is" +actualnameorder);
		//expected display
		String  expectedname = testHelper.getcheckorder().getAlltitle().get(i);
		System.out.println("the expected name is" +expectedname);
Assert.assertEquals("the Name are the same",expectedname , actualnameorder);	}

	}

	@Then("I check  non existence of the {string} in History order")
	public void i_check_non_existence_of_the_in_History_order(String arg1) throws Throwable {
		System.out.println("#### I expect order ID is  no available ######");
		testHelper.getcheckorder().Nocheckexistence();
 String actual =testHelper.getcheckorder().Nocheckexistence();
Assert.assertEquals("the ID number does not exist in the table and the result is",actual, "No Results Found !!" );
	}
	
	@Then("^go back to my account$")
	public void go_back_to_my_account()  {
		testHelper.getcheckorder().Goback();
	//	testHelper.getcheckorder().Gobackorder();
	}
	@Then("back to my order")
	public void back_to_my_order() {
testHelper.getcheckorder().Gobackorder();
	}

}
