package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class MyProductPage extends MasterPage{
	
	String productTableLink = "{xpath://*[@id=\"layout\"]/div[2]/div[2]/div[4]/table/tbody";

	public MyProductPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isProductTableExist() {
		
		return isElementExist(getWebElementBy(productTableLink));
	
		
		
	}

}
