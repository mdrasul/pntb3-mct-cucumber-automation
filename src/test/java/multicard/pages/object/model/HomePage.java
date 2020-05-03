package multicard.pages.object.model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage  extends MasterPage{
		
	// Locators 
	String profileNameLink ="{xpath://*[@id=\"dLabel\"]/span";
	String myAccountLink  = "{xpath://*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
	String passwordErrorLabel = "{xpath://label[@id='password_error']";
	String noUserErrorLabel = "{xpath://label[@id='name_error']";

	String loginLink = "{xpath://*[@id='dLabellogin']";
	String userNameTextBox = "{xpath://*[@id='username']";
	String passwordTextBox = "{xpath://*[@id='password']";
	String loginButton = "{xpath://*[@id='jqLogin']";
	String signUpButton = "{xpath://button[@id='jqSignup']";
	
	
	
	//***Rownak Bootcamp Locators**************************
	String aboutUsFooter = "{xpath://*[@id=\"footersection\"]/section/div[1]/div/ul/li[1]/a";
	String fAQFooter = "{xpath://*[@id=\"footersection\"]/section/div[1]/div/ul/li[2]/a";
	String helpFooter = "{xpath://*[@id=\"footersection\"]/section/div[1]/div/ul/li[3]/a";
	String siteFeedbackFooter = "{xpath://*[@id=\"footersection\"]/section/div[1]/div/ul/li[4]/a";
	String termsAndCondFooter = "{xpath://*[@id=\"footersection\"]/section/div[1]/div/ul/li[5]/a";
	String contactUsFooter = "{xpath://*[@id=\"footersection\"]/section/div[1]/div/ul/li[6]/a";
	
	//***Rownak Bootcamp Locators**************************
	String comboProdFooter = "{xpath://*[@id=\"footersection\"]/section/div[2]/div/ul/li[1]/a";
	String newProductsFooter = "{xpath://*[@id=\"footersection\"]/section/div[2]/div/ul/li[2]/a";
	String featuredProductsFooter = "{xpath://*[@id=\"footersection\"]/section/div[2]/div/ul/li[3]/a";
	String categoriesFooter = "{xpath://*[@id=\"footersection\"]/section/div[2]/div/ul/li[4]/a";
	String viewCartFooter = "{xpath://*[@id=\"footersection\"]/section/div[2]/div/ul/li[5]/a";
	String giftCertFooter = "{xpath://*[@id=\"footersection\"]/section/div[2]/div/ul/li[6]/a";
	
	
	
	/** Constructor */
	public HomePage(WebDriver driver) {
		super(driver); // Master Please Use this Driver
	}

	public void gotoHomePage() {
		
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

	}
	
	
	// Page Specific Actions 
	public void doLogin(String id, String password) {
		clickElement(getWebElementBy(loginLink));
		typeText(getWebElementBy(userNameTextBox),id);
		typeText(getWebElementBy(passwordTextBox),password);
		clickElement(getWebElementBy(loginButton));
		//uglyWaitFor(2000);
	}

	public String getProfileName() {
		return getElementText(getWebElementBy(profileNameLink));
	}

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

	
	
	//********************************************************
	public void scrollToBottom() {
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");		
	}
	
	//********************************************************
	public boolean validateAboutUs() {
		return isElementExist(getWebElementBy(aboutUsFooter));
	}
	//********************************************************
	public boolean validateFAQ() {
		return isElementExist(getWebElementBy(fAQFooter));
	}
	//********************************************************

	public boolean validateHelp() {
		return isElementExist(getWebElementBy(helpFooter));
	}
	//********************************************************

	public boolean validateSiteFeedback() {
		return isElementExist(getWebElementBy(siteFeedbackFooter));
	}
	//********************************************************
	
	public boolean validateTermsCond() {
		return isElementExist(getWebElementBy(termsAndCondFooter));
	}
	//********************************************************	
	public boolean validateContact() {
		return isElementExist(getWebElementBy(contactUsFooter));
	}
	//********************************************************
	public boolean validatecomboProd() {
		return isElementExist(getWebElementBy(comboProdFooter));
	}
	//********************************************************
	public boolean validatenewProducts() {
		return isElementExist(getWebElementBy(newProductsFooter));
	}
	//********************************************************
	public boolean validatefeaturedProducts() {
		return isElementExist(getWebElementBy(featuredProductsFooter));
	}
	//********************************************************
	public boolean validatecategories() {
		return isElementExist(getWebElementBy(categoriesFooter));
	}
	//********************************************************
	public boolean validateviewCart() {
		return isElementExist(getWebElementBy(viewCartFooter));
	}
	//********************************************************
	public boolean validategiftCert() {
		return isElementExist(getWebElementBy(giftCertFooter));
	}


}
