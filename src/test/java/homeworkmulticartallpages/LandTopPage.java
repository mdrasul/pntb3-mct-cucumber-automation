package homeworkmulticartallpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import homeworkmulticartallpages.MasterPage;
import homeworkmulticartallpages.ShoppingCartPage;

public class LandTopPage extends MasterPage {
//	WebDriver driver;
String buynow_button_xpath=	"{xpath://button[@class='detail_page_buynow_btt']";
	public LandTopPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public ShoppingCartPage selectBuyNow() {
		clickElement(getWebElementBy(buynow_button_xpath));
	 // driver.findElement(By.xpath(buynow_button_xpath)).click();
	 uglyWaitFor(2000);
	 
		return new ShoppingCartPage(driver);
	}

}
