package homeworkmulticartallpages;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage extends MasterPage {

	String first_name_xpath="{xpath://input[@id='txtBillingFirstName']";
	String second_name_xpath="{xpath://input[@id='txtBillingLastName']";
	String billing_address1_xpath="{xpath://input[@id='txtBillingAddress1']";
	String billing_address2_xpath="{xpath://input[@id='txtBillingAddress2']";
	String billing_city_xpath= "{xpath://input[@id='txtBillingCity']";
	String billing_country_xpath="{xpath://select[@id='billCountrySelect']";
	String billing_state_xpath="{xpath://input[@id='billStateSelect']";
	String billing_zipcode= "{xpath://input[@id='txtBillingZIP']";
	String billing_email="{xpath://input[@id='txtBillingEmail']";
	String special_billing_phone_xpath ="//*[@class='form-control']";
	String billing_phone_xpath="{xpath://input[@id='txtBillingPhone']";

	String shipping_first_name_xpath= "{xpath://input[@id='txtShippingFirstName']";
	String shipping_second_name_xpath= "{xpath://input[@id='txtShippingLastName']";
	String shipping_address1_xpath= "{xpath://input[@id='txtShippingAddress1']";
	String shipping_address2_xpath= "{xpath://input[@id='txtShippingAddress2']";
	String shipping_city_xpath= "{xpath://input[@id='txtShippingCity']";
	String shipping_country_xpath= "{xpath://select[@id='shipCountrySelect']";
	String shipping_state_xpath="{xpath://select[@id='shipStateSelect']";
	String shipping_zipcode= "{xpath://input[@id='txtShippingZIP']";
	String shipping_email="{xpath://input[@id='txtShippingEmail']";
	String shipping_phone_xpath="{xpath://*[@id=\"txtShippingPhone\"]";

	String confirm_order_xpath="{xpath://input[@id='btnConfirmOrder']";
	
	public BillingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public ProceedPage getAddresses() {
	
     	  Random rand = new Random(); 
	      int rand_int1 = rand.nextInt(1000); 
		 String userValue = "nabila" + rand_int1;
			
		typeText(getWebElementBy(first_name_xpath), userValue);
        typeText(getWebElementBy(second_name_xpath),"mehjabeen");
        typeText(getWebElementBy(billing_address1_xpath),"Grand Central Pkwy");
        typeText(getWebElementBy(billing_address2_xpath),"Briarwood");
        typeText(getWebElementBy(billing_city_xpath),"Jamaica");

//        driver.findElement(By.xpath(first_name_xpath)).sendKeys("nabila");
//		driver.findElement(By.xpath(second_name_xpath)).sendKeys("mehjabeen");
//		driver.findElement(By.xpath( billing_address1_xpath)).sendKeys("Grand Central Pkwy");
        
        SelectFromDropDown(getWebElementBy(billing_country_xpath), "Turkey");
        typeText(getWebElementBy(billing_state_xpath), "New York");

//		WebElement country= driver.findElement(By.xpath(billing_country_xpath));
//		WebElement state= driver.findElement(By.xpath(billing_state_xpath));
//		SelectFromDropDown(country,"United States");
//		SelectFromDropDown(state,"New York");
		
		typeText(getWebElementBy(billing_zipcode),"11442");
        typeText(getWebElementBy(billing_email),userValue+"@gmail.com");
       //typeText(getWebElementBy(special_billing_phone_xpath),"1234580");
        typeText(getWebElementBy(billing_phone_xpath),"1234580");

 // SHIPPING FORM :::
        
        typeText(getWebElementBy(shipping_first_name_xpath),"zabeen");
        typeText(getWebElementBy(shipping_second_name_xpath),"meh");
        typeText(getWebElementBy(shipping_address1_xpath),"Grand Central Pkwy");
        typeText(getWebElementBy(shipping_address2_xpath),"Briarwood");
        typeText(getWebElementBy(shipping_city_xpath),"Jamaica");

 
        SelectFromDropDown(getWebElementBy(shipping_country_xpath), "United States");

        typeText(getWebElementBy(shipping_state_xpath),"Florida");
        typeText(getWebElementBy(shipping_zipcode),"11442");
        typeText(getWebElementBy(shipping_email),userValue+"@gmail.com");
        //typeText(getWebElementBy(special_billing_phone_xpath),"1234580");
        typeText(getWebElementBy(shipping_phone_xpath),"1264567890");
		clickElement(getWebElementBy(confirm_order_xpath));
		uglyWaitFor(2000);

//ALERT POPUP
		
		Alert alert= driver.switchTo().alert(); //Alert popup
		System.out.println(alert.getText());
		alert.accept();

		uglyWaitFor(2000);

        typeText(getWebElementBy(billing_phone_xpath),"1234580");
        typeText(getWebElementBy(shipping_phone_xpath),"1264567890");
     	uglyWaitFor(2000);

        clickElement(getWebElementBy(confirm_order_xpath));
     	uglyWaitFor(2000);

		return new ProceedPage(driver);
	}
}
