package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class OrderPage extends MasterPage {

	//WebDriver driver;

	// Locators 
	String  orderWebTable = "{xpath://table[@class='table table-bordered oder_table']//tr[1]";
	String orderPageHeaderLabel = "{xpath://h1[contains(text(),'Orders')]";
	
	/** Constructor */
	public OrderPage(WebDriver driver) {
		super(driver); // Master Please Use this Driver
	}

	public boolean isOrderTableExist() {
		return isElementExist(getWebElementBy(orderWebTable));
	}
		
	public boolean isOrderPageHeaderAvailable() {		
		return isElementExist(getWebElementBy(orderPageHeaderLabel));
	}

	
}
