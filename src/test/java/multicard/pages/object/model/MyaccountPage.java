package multicard.pages.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.Return;

public class MyaccountPage extends MasterPage {

	// xpath for casual shirts
	String Caual_Shirts_link = "{xpath://a[contains(text(),'Casual shirts')] ";

	// DASHBOARD PAGE DIRESCTION XPATH home work
	String dash_Board_Link = "{xpath://a[contains(text(),'Seller Dashboard')]";

	// Locators
	String myOrderLink = "{xpath://*[@id=\"item_details\"]/div[3]/div[1]/div/div[1]/a";
	String optionsLink = "{xpath://a[contains(text(),'${XXRPCLXX}')]";

	// Dynamic Xpath
	String allOptionsATag = "{xpath://div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a";

	/** Constructor */
	public MyaccountPage(WebDriver driver) {
		super(driver); // Super Please Use this Driver
	}

	public OrderPage navigateToMOrderPage() {
		clickElement(getWebElementBy(myOrderLink));
		// uglyWaitFor(2000);
		return new OrderPage(driver);
	}

	// Options is Avaialble Or Note
	public boolean isOptionExist(String optionName) {
		return isElementExist(getWebElementBy(replaceLocatorsWith(optionsLink, optionName)));
	}

	public List<String> getAllOptionText() {

		return getElementsTextAsList(getWebElements(allOptionsATag));
	}

	// CLick On Options Like Profilr Order Selller
	public ProfilePage navigateToOption(String option) {
		clickElement(getWebElementBy(replaceLocatorsWith(optionsLink, option)));
		return new ProfilePage(driver);
	}

	// THIS METHOD WILL RETUEN MY DASHBOARD PAGE
	public DashboardPage_Accessories navigateToDashboardPage() {
		uglyWaitFor(2000);
		clickElement(getWebElementBy(dash_Board_Link));
		return new DashboardPage_Accessories(driver);
	}

	// product to select
	public DashBoardPage_Casual_Shirts clickOnCaualShirts() {
		clickElement(getWebElementBy(Caual_Shirts_link));
		return new DashBoardPage_Casual_Shirts(driver);
		
	}

}
