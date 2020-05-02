package multicard.pages.object.model;

import java.util.List;

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
    
	// Locators For Footers

		String allFooterLinks = "{xpath://div[@class='footersep_inner']";

		String aboutUsLink = "{xpath://a[contains(text(),'About Us')]";

		String ViewCartLink = "{xpath://a[contains(text(),'View Cart')]";

		String affiliatesLink = "{xpath://a[contains(text(),'Affiliates')]";

		// Locators For Social Links

		String twitterLink = "{xpath://a[@title = 'Twitter']";
		String multicartTwitterPage = "https://twitter.com/multicart";

		String facebookLink = "{xpath://a[@title = 'Facebook']";
		String multicartFacebookPage = "https://www.facebook.com/iscripts";


	
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
	

	/** Methods for all Footer Links Availability And Assertion **/

	public List<String> getallFooterLinksText() {
		return getElementsTextAsList(getWebElements(allFooterLinks));

	}

	public boolean isAllFooterLinksAvailable() {
		return isElementExist(getWebElementBy(allFooterLinks));
	}

	/** Methods for Footer Links Activity **/

	public void checkAboutUsLink() {
		clickElement(getWebElementBy(aboutUsLink));
	}

	public void checkViewCartLink() {
		clickElement(getWebElementBy(ViewCartLink));

	}

	public void checkAffiliatestLink() {
		clickElement(getWebElementBy(affiliatesLink));
	}

	/** Methods for Footer Social Links Activity And Assertion **/

	public void clickTwitterLink() {
		clickElement(getWebElementBy(twitterLink));
	}

	public String redirectToTwitterPage() {
		driver.navigate().to(multicartTwitterPage);
		return driver.getCurrentUrl();

	}

	public void clickFacebookLink() {
		clickElement(getWebElementBy(facebookLink));
	}

	public String redirectToFacebookPage() {
		driver.navigate().to(multicartFacebookPage);
		return driver.getCurrentUrl();

	}




}
