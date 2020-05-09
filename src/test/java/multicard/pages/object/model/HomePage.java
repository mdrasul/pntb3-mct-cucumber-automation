package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class HomePage  extends MasterPage{
		
	// Locators 
	//Rahman is not using the locators now- will use them in future.
	String profileNameLink ="{xpath://*[@id=\"dLabel\"]/span";
	String myAccountLink  = "{xpath://*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
	String passwordErrorLabel = "{xpath://label[@id='password_error']";
	String noUserErrorLabel = "{xpath://label[@id='name_error']";

	String loginLink = "{xpath://*[@id='dLabellogin']";
	String userNameTextBox = "{xpath://*[@id='username']";
	String passwordTextBox = "{xpath://*[@id='password']";
	String loginButton = "{xpath://*[@id='jqLogin']";
	String signUpButton = "{xpath://button[@id='jqSignup']";


	
	/** Constructor */
	public HomePage(WebDriver driver) {
		super(driver); // Master Please Use this Driver
	}

	public void gotoHomePage() {
		
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

	}
	
	
	// Page Specific Actions 

//		//Rahman's test

	public void doLogin(String id, String password) {
		
		TargetTag("LOGIN");
		keyboardClick();
		typeText(id);
		System.out.println(id);
		typeText(password);
		//Rahman's test
		keyboardClick();
		keyboardClicktoBody();
		TargetTag("JAMES WILLIAMS");
		keyboardClick();
		
		//uglyWaitFor(2000);
	}
	///////
	public String getProfileName() {
		return getnewElementText("JAMES WILLIAMS");
	}
	
	//////
//	public String getProfileName() {
//		return getElementText(getWebElementBy(profileNameLink));
//	}


	public String getPasswordErrorText() {
		return getElementText(getWebElementBy(passwordErrorLabel));
	}
	
	public String getnoUserErrorText() {
		return getElementText(getWebElementBy(noUserErrorLabel));
	}
	
	public MyaccountPage navigateToMyAccountPage() {
		clickElement(getWebElementBy(profileNameLink));
		clickElement(getWebElementBy(myAccountLink));
		return new MyaccountPage(driver);
	}

	public SignUpPage navigateToSignUpPage() {
		
		clickElement(getWebElementBy(loginLink));
		clickElement(getWebElementBy(signUpButton));
		return new SignUpPage(driver);
	}



}
