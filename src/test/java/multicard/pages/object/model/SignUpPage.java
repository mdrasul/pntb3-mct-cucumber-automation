package multicard.pages.object.model;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class SignUpPage extends MasterPage {

	// Locators 
	String profileNameLink ="{xpath://*[@id=\"dLabel\"]/span";
	String emailField = "{xpath://input[@id='txtEmail']";
	String regUserNameField = "{xpath://input[@id='txtUserName']";
	String regPasswordField = "{xpath://input[@id='txtPassword']";
	String regConfPasswordField = "{xpath://input[@id='txtCnfPassword']";
	String firstNameField = "{xpath://input[@id='txtFirstName']";
	String lastNameField = "{xpath://input[@id='txtLastName']";
	String addressField = "{xpath://input[@placeholder='Address *']";
	String createAcctButton = "{xpath://input[@id='btnRegister']";

	
	/** Constructor */
	public SignUpPage(WebDriver driver) {
		super(driver); // Super Please Use this Driver
	}

	public void completeSignUp() {
		
		// Generating A Random Number For Sample user
        Random rand = new Random(); 
        int rand_int1 = rand.nextInt(1000); 
		String userValue = "testuser" + rand_int1;
		
		typeText(getWebElementBy(emailField), userValue+"@gmail.com");
		typeText(getWebElementBy(regUserNameField), userValue);
		typeText(getWebElementBy(regPasswordField), "ABC123");
		typeText(getWebElementBy(regConfPasswordField), "ABC123");		
		typeText(getWebElementBy(firstNameField), "MR");
		typeText(getWebElementBy(lastNameField), userValue);
		typeText(getWebElementBy(addressField), "123 Fifth Ave");
		clickElement(getWebElementBy(createAcctButton));
	}
	
}
