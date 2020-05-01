package homeworkmulticartallpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import homeworkmulticartallpages.LandTopPage;

public class ProductPage extends MasterPage {
	//WebDriver driver;
	String content_area_xpath= "//div[@class='contentarea']//div[3]//div[1]//a[1]//div[1]";
	String sleeve_pnk_shirt=  "{xpath://a[contains(text(),\"Sleeve Solid Women\\'...\")]";
	//String buy_now_xpath= "{xpath://div[@id='63']//a[@class='adtocart'][contains(text(),'Shop Now')]";
	

	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public LandTopPage getPinkShirt() {
		// TODO Auto-generated method stub

		Actions action=new Actions(driver);// Mouse Hover
		action.moveToElement(driver.findElement(By.xpath(content_area_xpath))).build().perform();
		uglyWaitFor(3000);
		
		//clickElement(getWebElementBy(buy_now_xpath));
		
       clickElement(getWebElementBy(sleeve_pnk_shirt));
		//driver.findElement(By.xpath(sleeve_pnk_shirt)).click();
		//uglyWaitFor(2000);
		return new LandTopPage(driver);
	}

	
		
	}


