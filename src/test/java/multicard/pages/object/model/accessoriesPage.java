package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

import multicard.pages.object.model.MasterPage;

public class accessoriesPage extends MasterPage {

	//locators
	String headsetWithMic = "{xpath://a[contains(text(),'Headset With Mic')]";
	String buyNowLink     = "{xpath://button[@class='detail_page_buynow_btt']";
	String shoppingCartTableLink = "{xpath://table[@class='table table-bordered']";
	
	public accessoriesPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void buyAnItem() {
		clickElement(getWebElementBy(headsetWithMic));
		clickElement(getWebElementBy(buyNowLink));
		
	}
	
	public boolean isShoppingCartTableExist() {
		return isElementExist(getWebElementBy(shoppingCartTableLink));
	}

}
