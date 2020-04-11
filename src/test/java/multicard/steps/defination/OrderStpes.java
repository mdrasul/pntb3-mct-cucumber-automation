package multicard.steps.defination;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class OrderStpes {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public OrderStpes(MctTestHelper testHelper ){
		this.testHelper=testHelper;
	}
		
	/** Steps For Order Features   */

	@Then("^I expect Order page header is availablee$")
	public void I_expect_order_table_is_availablee() {
		System.out.println("#### I expect order table is available ######");
		boolean orderTableExist = testHelper.getOrder().isOrderPageHeaderAvailable();
		Assert.assertEquals("Order Page Header Not Exist.", true, orderTableExist );

	}
	
	@Then("^I expect Order History Table Avaiable$")
	public void I_expect_Order_History_Table_Avaiable() {
		System.out.println("#### I expect order table is available ######");
		boolean orderTableExist = testHelper.getOrder().isOrderTableExist();
		Assert.assertEquals("Order Page Header Not Exist.", true, orderTableExist );
	}
	

	
	
}
