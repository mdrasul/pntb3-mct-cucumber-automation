package shoppingcartallpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CategoryPage extends MasterPage {

	//WebDriver driver;
	String more_click_xpath= "{xpath://a[contains(text(),'More..')]";
String new_shoe_xpath	="{xpath:/html/body/div[2]/div/div/div/form/div[1]/section[2]/div[1]/div[6]/div/h5/a";
	//String foot5_click_xpath="{xpath://a[contains(text(),'Foot wears>�(5)')]";
	//String sandal_click_xpath="{xpath://a[contains(text(),'Sandals(2)')]";
	String sandal_new_click_xpath="{xpath://*[@id=\"item_details\"]/div/div[3]/div/h5/a";
	String mousehover_click_xpath="//a[contains(text(),'blue')]";
	String shop_now_xpath= "{xpath://div[@id='127']//a[@class='adtocart'][contains(text(),'Shop Now')]";
	String button_checkout_xpath="{xpath://input[@id='btnCheckout']";
	String buttonguest_xpath= "{xpath://input[@name='btn_guest']";
	//a[contains(text(),'Sandals (2)')]
	//*[@id="item_details"]/div/div[3]/div/h5/a
	public CategoryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public void getclickonmore() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(more_click_xpath));

		//SCROLL DOWN
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		uglyWaitFor(2000);
	}

	public void clickonshoe() {
		// TODO Auto-generated method stub
		clickElement(getWebElementBy(new_shoe_xpath));
		uglyWaitFor(2000);
		clickElement(getWebElementBy(sandal_new_click_xpath));


		Actions action=new Actions(driver);// Mouse Hover
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'blue')]"))).build().perform();
		clickElement(getWebElementBy(shop_now_xpath));



	}

	public BillingPage moveforBilling() {
		clickElement(getWebElementBy(button_checkout_xpath));
		uglyWaitFor(2000);
		clickElement(getWebElementBy(buttonguest_xpath));

		return new BillingPage(driver);
	}	


}
