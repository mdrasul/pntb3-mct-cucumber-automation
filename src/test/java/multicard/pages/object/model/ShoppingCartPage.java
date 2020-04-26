package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends MasterPage{
	String slimShirtCheck_label="{xpath://*[@id=\"item_details\"]/div[2]/div[1]/table/tbody/tr[2]/td[1]/input";
	String slimShirtQuantity_label="{xpath://*[@id=\"txtQuantity_0\"]";
	String checkout_label="{xpath://*[@id=\"btnCheckout\"]";
	String productTotal_label="{xpath://*[@id=\"item_details\"]/div[3]/div[1]/table/tbody/tr[3]/td/b/span[2]";
	String guestCheck_label="{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/a[2]/input";

	public ShoppingCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public void doingthecheckout(String write4) {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(slimShirtCheck_label));
		uglyWaitFor(5000);
       typeText(getWebElementBy(slimShirtQuantity_label),write4);
    	uglyWaitFor(5000);
	    clickElement(getWebElementBy(checkout_label));
	    
		
	}

	

	public String getPruductTotalText() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(guestCheck_label));
		return getElementText(getWebElementBy(productTotal_label));
	}


}
