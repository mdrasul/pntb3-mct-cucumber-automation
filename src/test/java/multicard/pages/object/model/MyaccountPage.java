package multicard.pages.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class MyaccountPage extends MasterPage {

	//WebDriver driver;
	
	// Locators 
	String myOrderLink = "{xpath://*[@id=\"item_details\"]/div[3]/div[1]/div/div[1]/a";
	String optionsLink = "{xpath://a[contains(text(),'${XXRPCLXX}')]";
	
	//Dynamic Xpath 
	String allOptionsATag = "{xpath://div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a";
	
	
	/** Constructor */
	public MyaccountPage(WebDriver driver) {
		super(driver); // Super Please Use this Driver
	}


	public OrderPage navigateToMOrderPage() {
		clickElement(getWebElementBy(myOrderLink));
		//uglyWaitFor(2000);
		return new OrderPage(driver);
	}

	// Options is Avaialble Or Note 
	public boolean isOptionExist(String optionName) {
		return isElementExist(getWebElementBy(replaceLocatorsWith(optionsLink,optionName)));
	}
	
	

	public List<String> getAllOptionText() {
		
		return getElementsTextAsList(getWebElements(allOptionsATag));
	}


	// CLick On Options Like Profilr Order Selller  
	public ProfilePage navigateToOption(String option) {
		clickElement(getWebElementBy(replaceLocatorsWith(optionsLink,option)));
		return new ProfilePage(driver);
	}
	
	
	
}
