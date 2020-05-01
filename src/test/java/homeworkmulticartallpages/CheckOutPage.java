package homeworkmulticartallpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends MasterPage {
	//WebDriver driver;
	String buttonguest_xpath= "{xpath://input[@name='btn_guest']";
	public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public BillingPage selectcheckoutasaguest() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(buttonguest_xpath));
	
		//driver.findElement(By.xpath(buttonguest_xpath)).click();
		
	

		uglyWaitFor(2000);
		return new BillingPage(driver);
	}


}
