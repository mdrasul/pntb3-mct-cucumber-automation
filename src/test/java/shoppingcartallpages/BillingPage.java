package shoppingcartallpages;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import shoppingcartallpages.ProceedPage;

public class BillingPage extends MasterPage {
	String first_name_xpath="{xpath://input[@id='txtBillingFirstName']";
	String second_name_xpath="{xpath://input[@id='txtBillingLastName']";
	String billing_address1_xpath="{xpath://input[@id='txtBillingAddress1']";
	String billing_address2_xpath="{xpath://input[@id='txtBillingAddress2']";
	String billing_city_xpath= "{xpath://input[@id='txtBillingCity']";
	String billing_country_xpath="{xpath://select[@id='billCountrySelect']";
	
	//My billing state new xpath 
	String billing_state_xpath11="{xpath://select[@id='billStateSelect']";
	//My billing state old xpath 
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
		//RANDOM NUMBER
		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(1000); 
		String userValue = "rumel" + rand_int1;

		typeText(getWebElementBy(first_name_xpath), userValue);
		typeText(getWebElementBy(second_name_xpath),"xyz");
		typeText(getWebElementBy(billing_address1_xpath),"Grand Central");
		typeText(getWebElementBy(billing_address2_xpath),"Hillside");
		typeText(getWebElementBy(billing_city_xpath),"Jamaica");


       //DROP DOWN
		SelectFromDropDown(getWebElementBy(billing_country_xpath), "Australia");
		//SelectFromDropDown(getWebElementBy(billing_state_xpath11), "New York");

		typeText(getWebElementBy(billing_state_xpath11), "New York");



		typeText(getWebElementBy(billing_zipcode),"11442");
		typeText(getWebElementBy(billing_email),userValue+"@gmail.com");
		//typeText(getWebElementBy(special_billing_phone_xpath),"1234580");
		typeText(getWebElementBy(billing_phone_xpath),"1234580");

		// SHIPPING FORM :::

		typeText(getWebElementBy(shipping_first_name_xpath),"rumel");
		typeText(getWebElementBy(shipping_second_name_xpath),"xyz");
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
