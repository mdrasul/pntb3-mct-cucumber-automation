package homeworkmulticartallpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedPage extends MasterPage {
	//String proceed_xpath ="{xpath://*[@class='button']";

	String proceed_click= "{name:proceed";
    String gift_code="{xpath://form[@name='frmGiftCertificate']//input[@id='couponCode']";
	String gift_code_button="{xpath://input[@name='btngiftCode']";
	String gift_error_text="{xpath://div[@class='text_information']";
	String coupon_code= "{xpath://form[@name='couponCodeForm']//input[@id='couponCode']";
	String coupon_code_button="{xpath://input[@name='couponCodeButn']";
	String coupon_error_text="{xpath://div[@class='text_information']";
	public ProceedPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public void getForFinalCheckOut() {

		//	typeText(getWebElementBy(proceed_xpath),"1264567890");
		clickElement(getWebElementBy(proceed_click));
		//  driver.findElement(By.xpath(proceed_xpath)).sendKeys("1264567890");
	   typeText(getWebElementBy(gift_code),"12345");
	   clickElement(getWebElementBy(gift_code_button));
	  
	
	   
	}

	public String getErrortext() {
		// TODO Auto-generated method stub
		return  getElementText(getWebElementBy( gift_error_text));
	}

	public void getcoupontext() {
		// TODO Auto-generated method stub
		   typeText(getWebElementBy(coupon_code),"12345");
		   clickElement(getWebElementBy(coupon_code_button));

		
		
	}

	public String getCouponErrortext() {
		// TODO Auto-generated method stub
		uglyWaitFor(2000);

		return  getElementText(getWebElementBy(coupon_error_text));
	}
	
	
	
}
