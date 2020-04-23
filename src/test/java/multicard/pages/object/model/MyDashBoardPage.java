package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class MyDashBoardPage extends MasterPage{
	
	String sellerLoginLink = "{xpath://*[@id=\"item_details\"]/div[2]/div[3]/div/form/div";
	
	String sellerNameBox = "{xpath://*[@id=\"txtUserName\"]";
	String sellerPasswordBox = "{xpath://*[@id=\"txtPassword\"]";
	String sellerLoginButton = "{xpath://*[@id=\"item_details\"]/div[2]/div[3]/div/form/div/div[4]/div/input[1]";
	
	
	
	
	
	
	
	

	public MyDashBoardPage(WebDriver driver) {
		super(driver);
	}

	public boolean isSellerLoginAvailable() {
		
		return isElementExist(getWebElementBy(sellerLoginLink));
	}
	
	public SellerHomePage doLogin(String id, String password) {
		
		typeText(getWebElementBy(sellerNameBox), id);
		typeText(getWebElementBy(sellerPasswordBox), password);
		clickElement(getWebElementBy(sellerLoginButton));
		
		return new SellerHomePage(driver);
		


		
	}
	
	
	
	
	
	
	
	
	

}
