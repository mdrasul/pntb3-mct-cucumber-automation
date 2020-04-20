package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class AccesoriesPage extends MasterPage {

	
	String headphonesLink = "{xpath://a[contains(text(),'Headset With Mic')]";
	String buyNowButton = "{xpath://button[@class='detail_page_buynow_btt']";
	String checkOutButton = "{xpath://input[@id='btnCheckout']";
	
	/** Constructor */
	public AccesoriesPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectAProduct() {
		clickElement(getWebElementBy(headphonesLink));
	}
	public void clickBuyNow() {
		clickElement(getWebElementBy(buyNowButton));
		
	}

	public void clickCheckOut() {
		clickElement(getWebElementBy(checkOutButton));
		
	}

}
