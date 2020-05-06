package multicard.pages.object.model;

import java.util.Random;

import org.openqa.selenium.WebDriver;



public class SellerSignUpPage extends MasterPage{
	
	String userNameField = "{xpath://input[@id='txtUserName']";
	String passwordField = "{xpath://input[@name='txtPassword']";
	String confirmPasswordField = "{xpath://input[@name='txtConfirmPassword']";
	String storeNameField = "{xpath://input[@id='txtStore']";
	String companyField = "{xpath://input[@id='txtCompany']";
	String firstNameField = "{xpath://input[@name='txtFirstName']";
	String lastNameField = "{xpath://input[@name='txtLastName']";
	String addressLine1Field = "{xpath://input[@name='txtAddress1']";
	String countryField = "{xpath://select[@id='billCountrySelect']";
	String stateField = "{xpath://input[@id='billStateSelect']";
	String cityField = "{xpath://input[@name='txtCity']";
	String zipField = "{xpath://input[@name='txtZIP']";
	String phoneField = "{xpath://input[@name='txtPhone']";
	String emailField = "{xpath://input[@name='txtEmail']";
	String timeZoneField = "{xpath://select[@id='txtTimeZone\"']";
	String paypalEmailField = "{xpath://input[@name='txtPaypalEmail']";
	String registerButton = "{xpath://input[@name='btnRegister']";
	
	
	/** Constructor */
	public SellerSignUpPage(WebDriver driver) {
		super(driver); // Super Please Use this Driver
	} 

	public void sellerSignUp() {
		// Generating A Random Number For Sample user
        Random rand = new Random(); 
        int rand_int1 = rand.nextInt(1000); 
		String userValue = "testuser" + rand_int1;
		
		typeText(getWebElementBy(userNameField), userValue);
		typeText(getWebElementBy(passwordField), "ABC123");
		typeText(getWebElementBy(confirmPasswordField), "ABC123");
		typeText(getWebElementBy(storeNameField), "Superstore19283");		
		typeText(getWebElementBy(companyField), "SuperStoreInc");
		typeText(getWebElementBy(firstNameField), "Mr");
		typeText(getWebElementBy(lastNameField), "Smith");
		typeText(getWebElementBy(addressLine1Field), "123 Fifth Ave");
		typeText(getWebElementBy(countryField), "United");
		typeText(getWebElementBy(stateField), "New Carolina");
		typeText(getWebElementBy(cityField), "Corona Virus");
		typeText(getWebElementBy(zipField), "11111");
		typeText(getWebElementBy(phoneField), "1111111111");
		typeText(getWebElementBy(emailField), userValue+"@gmail.com");
		typeText(getWebElementBy(timeZoneField), "Eastern");
		typeText(getWebElementBy(paypalEmailField), userValue+"@gmail.com");
		clickElement(getWebElementBy(registerButton));
		
	}
	
}

