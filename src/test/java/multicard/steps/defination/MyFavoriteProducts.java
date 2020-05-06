package multicard.steps.defination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class MyFavoriteProducts {

MctTestHelper testHelper;

	
	public MyFavoriteProducts(MctTestHelper testHelper) {
		this.testHelper = testHelper;
		
	}
	
	@When("I click on shop now and click on digital")
	public void i_navigate_to_Sky_Vanity_Bag() {
		testHelper.gettofavo().clickonShopNow();
		System.out.println("I am on shop now page");
	}
	
	@When("I validate the items")
	public void i_expect_Sky_Vanity_Bag_available_on_My_Favorite_Products_Page() {
		testHelper.gettofavo().ismediaexist();
		boolean mediaexist = testHelper.gettofavo().ismediaexist();
		Assert.assertEquals("Order Page Header Not Exist.", true, mediaexist );
		System.out.println("I see degital page");
	}
}
