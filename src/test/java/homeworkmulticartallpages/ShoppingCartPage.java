package homeworkmulticartallpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends MasterPage{
	//WebDriver driver;
String checkout_button_xpath="{xpath://*[@id='btnCheckout']";
	public ShoppingCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}


	public CheckOutPage selectcheckoutbutton() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(checkout_button_xpath));
		//driver.findElement(By.xpath(checkout_button_xpath)).click();
		uglyWaitFor(2000);
		return new CheckOutPage(driver);
	}

}
