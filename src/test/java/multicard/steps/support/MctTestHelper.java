package multicard.steps.support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import multicard.pages.object.model.CuponPages;
import multicard.pages.object.model.HomePage;
import multicard.pages.object.model.MyaccountPage;
import multicard.pages.object.model.OrderPage;
import multicard.pages.object.model.ProfilePage;
import multicard.pages.object.model.SellerDashboardPage;
import multicard.pages.object.model.SignUpPage;
import multicard.test.data.User;

public class MctTestHelper {
	
	private WebDriver driver;
	private User james; 
	private HomePage home;
	private MyaccountPage myaccount;
	private OrderPage order;
	private SignUpPage signUpPage;
	private ProfilePage profilePage;
	private SellerDashboardPage sellerDashboard;
	private CuponPages cuponCodes;



	// Single Ton Mthods 
	
	public WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();

			//Very Nice Thing to Work with 
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

			driver=new ChromeDriver(dc);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}		
		return driver;
	}
		
	public User getJames() {
		if(james==null) {
			james=new User();
		}		
		return james;
	}

	public HomePage getHome() {
		if(home==null) {
			home=new HomePage(getDriver());
		}		
		return home;
	}
	
	public SignUpPage getSignUpPage() {
		if(signUpPage==null) {
			signUpPage=new SignUpPage(getDriver());
		}		
		return signUpPage;
	}
	
	public ProfilePage getProfilePage() {
		if(profilePage==null) {
			profilePage=new ProfilePage(getDriver());
		}		
		return profilePage;
	}

	
	public MyaccountPage getMyaccount() {
		
		if(myaccount==null) {
			myaccount=new MyaccountPage(getDriver());
		}		
		
		return myaccount;
	}

	public OrderPage getOrder() {
		
		if(order==null) {
			order=new OrderPage(getDriver());
		}		
		
		return order;
	}
	
	public SellerDashboardPage getSellerDashboard() {
		if(sellerDashboard==null) {
			sellerDashboard=new SellerDashboardPage(getDriver());
		}
		return sellerDashboard;
	}
	
	public CuponPages getCuponPages() {
		if(cuponCodes==null) {
			cuponCodes=new CuponPages(getDriver());
		}
		return cuponCodes;
		
	}



}
