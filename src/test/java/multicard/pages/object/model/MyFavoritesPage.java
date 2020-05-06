package multicard.pages.object.model;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;

public class MyFavoritesPage extends MasterPage {
	
	MyaccountPage myaccountPage;
	
	String bag = "{xpath://a[contains(text(),'Sky vanity bag')]";
	String bagfavo = "{xpath://div[@class='fav_detaila_icon addtowishlish_btn']";
	String shopNowLik = "{xpath://li[2]//div[1]//div[1]//a[1]";
	String degital = "{xpath://a[contains(text(),'Digital> (1)')]";
	String media = "{xpath://a[contains(text(),'Media')]";
	String mediafav = "{xpath://span[@id='btn_wish']";
	String clickonfavo = "{xpath://div[@class='fav_detaila_icon addtowishlish_btn']";
	
	String myfavpage = "{xpath://a[contains(text(),'My Favorite Sellers')]";
	String yespoppup = "{xpath://button[contains(text(),'Yes')]";
	public MyFavoritesPage(WebDriver driver) {
		
		super(driver);
	}
	
	public void clickonShopNow() {
		clickElement(getWebElementBy(shopNowLik));
		clickElement(getWebElementBy(degital));
		clickElement(getWebElementBy(media));
	}
	
	public boolean ismediaexist() {
		return isElementExist(getWebElementBy(media));
		
	}
	
//	public void addtofavo() {
//		clickElement(getWebElementBy(clickonfavo));
//		alertAccept();
//	}

//	public MyFavoritesPage navigatetomyfavopage() {
//		clickElement(getWebElementBy(myfavpage));
//		return new MyFavoritesPage(driver);
//		
//	}

}
