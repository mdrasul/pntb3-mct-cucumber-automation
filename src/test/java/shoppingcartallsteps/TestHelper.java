package shoppingcartallsteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import shoppingcartallpages.BillingPage;
import shoppingcartallpages.ProceedPage;
import shoppingcartallpages.CategoryPage;

public class TestHelper {
	
	public WebDriver driver;
	public CategoryPage categorypage;
	public BillingPage billingpage;
	public ProceedPage proceedpage;
	

	
	public WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "Users/mohammadrumel/Desktop/shoppingcart/chromedriver.exe");
			driver=new ChromeDriver();
		}		
		return driver;
	}


	public BillingPage getBillingpage() {
		if(billingpage==null) {
			billingpage=new BillingPage(getDriver());
		}	
		return billingpage;
	}

	
	public CategoryPage getCategorypage() {
		if(categorypage==null) {
			categorypage=new CategoryPage(getDriver());
		}	
		return categorypage;
	}



	public ProceedPage getProceedpage() {
		if(proceedpage==null) {
			proceedpage=new ProceedPage( getDriver());
		}	
		return proceedpage;
	}
		
}
