package homeworkmulticartallpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage {
	String clothingoption_xpath= "{xpath://a[contains(text(),'Clothing')]";
	//	WebDriver driver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}


	public ProductPage getItemSelect() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(clothingoption_xpath));
		//	driver.findElement(By.xpath(clothingoption_xpath)).click();



		uglyWaitFor(2000);
		return new ProductPage(driver);
	}

}
