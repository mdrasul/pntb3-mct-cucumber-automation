package homeworkmulticartallsteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import homeworkmulticartallpages.BillingPage;
import homeworkmulticartallpages.CheckOutPage;
import homeworkmulticartallpages.HomePage;
import homeworkmulticartallpages.LandTopPage;
import homeworkmulticartallpages.ProceedPage;
import homeworkmulticartallpages.ProductPage;
import homeworkmulticartallpages.ShoppingCartPage;


public class TestHelper {
	public  WebDriver driver;
	public  HomePage homepage;
	public  ProductPage productpage;
	public  LandTopPage landtoppage;
	public CheckOutPage checkoutpage;
	public  ShoppingCartPage shoppingcartpage;
	public  BillingPage billingpage;
	public ProceedPage proceedpage;
	
	
	
	public WebDriver getDriver() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sayee\\\\eclipse-workspace\\\\bootcamp\\\\chromedriver.exe");
			driver=new ChromeDriver();
		}		
		return driver;
	}



	public HomePage getHomepage() {
		if(homepage==null) {
			homepage=new HomePage(  getDriver());
		}	
		return homepage;
	}



	public ProductPage getProductpage() {
		if(productpage==null) {
			productpage=new ProductPage( getDriver());
		}	
		return productpage;
	}



	public LandTopPage getLandtoppage() {
		if(landtoppage==null) {
			landtoppage=new LandTopPage( getDriver());
		}	return landtoppage;
	}



	public CheckOutPage getCheckoutpage() {
		if(checkoutpage==null) {
			checkoutpage=new CheckOutPage( getDriver());
		}	
		return checkoutpage;
	}



	public ShoppingCartPage getShoppingcartpage() {
		if(shoppingcartpage==null) {
			shoppingcartpage=new ShoppingCartPage( getDriver());
		}	
		return shoppingcartpage;
	}



	public BillingPage getBillingpage() {
		if(billingpage==null) {
			billingpage=new BillingPage( getDriver());
		}	
		return billingpage;
	}



	public ProceedPage getProceedpage() {
		if(proceedpage==null) {
			proceedpage=new ProceedPage( getDriver());
		}	
		return proceedpage;
	}
		
	
}
