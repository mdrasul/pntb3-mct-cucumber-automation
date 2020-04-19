package multicard.steps.support;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import multicard.pages.object.model.HomePage;
import multicard.pages.object.model.MyaccountPage;
import multicard.pages.object.model.OrderPage;
import multicard.pages.object.model.ProfilePage;
import multicard.pages.object.model.SignUpPage;
import multicard.test.data.User;
import multicard.util.SharedConfig;

public class MctTestHelper {

	private WebDriver driver;
	private User james;
	private HomePage home;
	private MyaccountPage myaccount;
	private OrderPage order;
	private SignUpPage signUpPage;
	private ProfilePage profilePage;

	// Single Ton Mthods

	public WebDriver getDriver() {
		if (driver == null) {
			if(SharedConfig.config.get("seleniumEnvironment").equals("Local")) {
				// == Local where the Code is creating driver there
				WebDriverManager.chromedriver().setup();
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
				driver=new ChromeDriver(dc);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			} else if(SharedConfig.config.get("seleniumEnvironment").equals("Grid")) {
				
				// == Creeate REmote Driver and send the test to Sauce Lab
				String username = SharedConfig.config.get("Sauce-username");
				String accesskey = SharedConfig.config.get("Sauce-accesskey");

				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
				capabilities.setCapability(CapabilityType.VERSION, "latest");
				capabilities.setCapability(CapabilityType.PLATFORM, "macOS 10.14");

				// capabilities.setCapability("commandTimeout","599");
				// capabilities.setCapability("idleTimeout","1000");

				try {
					driver = new RemoteWebDriver(
							 new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com:443/wd/hub"),
							 capabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				
				// To  DO  Add:  the Implicitt Wait For Sauce REmote Driver 
			}
			
		}
		
		return driver;
	}

	public User getJames() {
		if (james == null) {
			james = new User();
		}
		return james;
	}

	public HomePage getHome() {
		if (home == null) {
			home = new HomePage(getDriver());
		}
		return home;
	}

	public SignUpPage getSignUpPage() {
		if (signUpPage == null) {
			signUpPage = new SignUpPage(getDriver());
		}
		return signUpPage;
	}

	public ProfilePage getProfilePage() {
		if (profilePage == null) {
			profilePage = new ProfilePage(getDriver());
		}
		return profilePage;
	}

	public MyaccountPage getMyaccount() {

		if (myaccount == null) {
			myaccount = new MyaccountPage(getDriver());
		}

		return myaccount;
	}

	public OrderPage getOrder() {

		if (order == null) {
			order = new OrderPage(getDriver());
		}

		return order;
	}

}
