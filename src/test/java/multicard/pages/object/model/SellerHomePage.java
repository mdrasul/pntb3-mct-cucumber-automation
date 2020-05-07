package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class SellerHomePage extends MasterPage{
	
	String sellerProfileNameLink = "{xpath://*[@id=\"layout\"]/div[1]/div[2]/b";
	
	
	
	String myProductsLinks = "{xpath://*[@id=\"layout\"]/div[2]/div[1]/div[9]/a";
	//String myCatalogLinks = "{xpath://*[@id=\"layout\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a/span";
	
	public SellerHomePage(WebDriver driver) {
		super(driver);
	}
	

	public String getProfileName() {
		
		return getElementText(getWebElementBy(sellerProfileNameLink));
	}

	public MyProductPage navigateToMyProductsPage() {
		
		clickElement(getWebElementBy(myProductsLinks));
		
		
		return new MyProductPage(driver);
		
	}


	
	

}
