package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class MyCatagoryPage extends MasterPage{
	
	String myCatagoryLink = "{xpath://html/body/div[2]/div/div/div/form/div[1]/section[2]/div[1]";

	public MyCatagoryPage(WebDriver driver) {
		super(driver); 
	}

	public boolean isCatagoryAvailable() {
		
		return isElementExist(getWebElementBy(myCatagoryLink));
		
	}
}