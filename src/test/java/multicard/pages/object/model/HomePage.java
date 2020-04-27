package multicard.pages.object.model;

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
    String search_label="{xpath://input[@placeholder='Search']";
    String searchText_label="{xpath://*[@id=\"search_header_top\"]/form/input[4]";
    String search_label2="{xpath://*[@id=\"search_header_btt\"]";
    String slimFit_label="{xpath://a[contains(text(),'Slim Fit Solid Formal Shi..')]";
    String No_Results_Found_label="{xpath://*[@id=\"items_display_area\"]/div";
    String BuyNow_label="{xpath:/html/body/div[3]/div/div[1]/div/div[1]/div[2]/div[1]/div[6]/button";
    String seller_label="{xpath://*[@id=\"footersection\"]/section/div[3]/div/ul/li[2]/a";
    String sellerLog_label="{xpath:/html/body/div[2]/div[1]/div[1]/div[1]/div/form/section/div[2]/div/input[1]";
    String selleruser_label="{xpath://*[@id=\"txtUserName\"]";
    String sellerpwd_label="{xpath://*[@id=\"txtPassword\"]";
    String sellerlogin_label="{xpath://*[@id=\"item_details\"]/div[2]/div[3]/div/form/div/div[4]/div/input[1]";
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

	public void writeInSearch_SLIM_FIT_SOLID_FORMA(String write1) {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(search_label));
		typeText(getWebElementBy(searchText_label),write1);
		clickElement(getWebElementBy(search_label2));
		
	}

	public String getSlim_Fit_Solid_Forma() {
		// TODO Auto-generated method stub
	     return getElementText(getWebElementBy(slimFit_label));
		}

	
	public void writeInSearch_abcd(String write2) {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(search_label));
		typeText(getWebElementBy(searchText_label),write2);
		clickElement(getWebElementBy(search_label2));
		
	}
	public String getTextNo_Results_Found() {
		// TODO Auto-generated method stub
	     return getElementText(getWebElementBy(No_Results_Found_label));
		}

	public ShoppingCartPage NavigateToShoppingCartPage() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(slimFit_label));
		clickElement(getWebElementBy(BuyNow_label));
		
		return new ShoppingCartPage(driver);
	}

	public void writeInSearch_Slim_Fit(String write3) {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(search_label));
		typeText(getWebElementBy(searchText_label),write3);
		clickElement(getWebElementBy(search_label2));
	}

	public void goToSellerLoginoption() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(seller_label));
		clickElement(getWebElementBy(sellerLog_label));
	}

	public SellerPage NavigateToSellerPage(String uid,String pwd) {
		// TODO Auto-generated method stub
		typeText(getWebElementBy(selleruser_label),uid);
		typeText(getWebElementBy(sellerpwd_label),pwd);
		clickElement(getWebElementBy(sellerlogin_label));
		return new SellerPage(driver);
	}

	
}
