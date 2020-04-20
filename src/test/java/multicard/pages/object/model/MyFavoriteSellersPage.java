package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class MyFavoriteSellersPage extends MasterPage {
	
	//Locators
	String myFavSellersTable = "{xpath://table[@class='responsive']//tbody";
	
	
	/** Constructor */
	public MyFavoriteSellersPage(WebDriver driver) {
		super(driver);
	}

	public boolean isMyFavSellersTablePresent() {
		return isElementExist(getWebElementBy(myFavSellersTable));
	}

}
