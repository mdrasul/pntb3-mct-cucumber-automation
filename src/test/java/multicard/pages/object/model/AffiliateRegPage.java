package multicard.pages.object.model;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class AffiliateRegPage extends MasterPage {


	String arUsernameField = "{xpath://input[@id='txtUserName']";
	String arPasswordField = "{xpath://input[@name='txtPassword']";
	String arCnfPasswordField = "{xpath://input[@name='txtCnfPassword']";
	String arFirstNameField = "{xpath://input[@name='txtFirstName']";
	String artLastNameField = "{xpath://input[@name='txtLastName']";
	String arAddress1Field = "{xpath://input[@name='txtAddress1']";
	String arAddress2Field = "{xpath://input[@name='txtAddress2']";
	String arCityField = "{xpath://input[@name='txtCity']";
	String arCountrySelectField = "{xpath://select[@id='billCountrySelect']";
	String arStateSelectField = "{xpath://input[@id='billStateSelect']";
	String arZipField = "{xpath://input[@name='txtZIP']";
	String arPhoneField = "{xpath://input[@name='txtPhone']";
	String arFaxField = "{xpath://input[@name='txtFAX']";
	String arEmailField = "{xpath://input[@name='txtEmail']";
	String arRegisterField = "{xpath://input[@name='btnRegister']";


	public AffiliateRegPage(WebDriver driver) {
		super(driver);
	}

	
	public void completeAffiliateReg() {

		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(1000); 
		String userValue = "testaffreg" + rand_int1;

		typeText(getWebElementBy(arUsernameField), "userdummy2");
		typeText(getWebElementBy(arPasswordField), "ABC123");
		typeText(getWebElementBy(arCnfPasswordField), "ABC123");		
		typeText(getWebElementBy(arFirstNameField), "La");
		typeText(getWebElementBy(artLastNameField), "Croix");
		typeText(getWebElementBy(arAddress1Field), "123 Fifth Ave");
		typeText(getWebElementBy(arAddress2Field), "");
		typeText(getWebElementBy(arCityField), "Water");
		typeText(getWebElementBy(arCountrySelectField), "United");
		typeText(getWebElementBy(arStateSelectField), "New York");
		typeText(getWebElementBy(arZipField), "12345");
		typeText(getWebElementBy(arPhoneField), "123-456-7890");
		typeText(getWebElementBy(arFaxField), "123-456-7890");
		typeText(getWebElementBy(arEmailField), userValue+"@gmail.com");
		clickElement(getWebElementBy(arRegisterField));
		
	}

}
