package multicard.pages.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellerDashboardPage extends MasterPage {


	String myCatalogLink = "{xpath://a[contains(text(),'My Catalog')]";
	String accessories= "{xpath://tr[2]//td[1]//a[1]";
	String pName = "{xpath://input[@id='txtProductName']";
	String pDescription = "{xpath://iframe[@class='cke_wysiwyg_frame cke_reset']";
	String pPrice = "{xpath://input[@id='txtPrice']";
	String pStutas = "{xpath://input[@id='jQPublish_Y']";
	String firstButton = "{xpath://*[@id=\"primery_btt_tab_1\"]";
	String secondButton = "{xpath://*[@id=\"primery_btt_tab_2\"]";
	//String pPhoto = "{xpath://div[@class='variant_detail_bottom_outer']//label[@class='btn-bs-file btn btn-lg btn-info upload_image'][contains(text(),'Choose File')]";
	//String pPhoto ="{xpath://*[@id=\"tabs-3\"]/div[1]/div[2]/div[10]/label[2]";
	String pPhoto = "{xpath://*[@id='image_big[]";
	String pQuantity ="{xpath://*[@id=\"product_stock[]\"]";
	String pWeight = "{xpath://*[@id=\"product_shipping_weight[]\"]";
	String pLenght = "{xpath://*[@id=\"product_length[]\"]";
	String pWidth = "{xpath://*[@id=\"product_width[]\"]";
	String pHeight = "{xpath://*[@id=\"product_height[]\"]";
	String pAdd = "{xpath://button[@name='btnAddProduct']";

	//Product description 
	String description = " History of About Gucci: Founded in 1921, Gucci is one of the world's leading luxury fashion brands, with a renowned reputation for creativity, innovation and Italian craftsmanship.\n" + 
			"Gucci is part of the Kering Group, a world leader in apparel and accessories that owns a portfolio of powerful luxury and sport and lifestyle brands.";

	String title ="Gucci Men's Vintage Logo-Print Baseball Cap";
	String photo ="/Users/shakir/Desktop/gucci.png";
	String unitPrice ="495";
	String quantity ="50";
	String weight = "1";
	String lenght = "10";
	String width = "6";
	String height = "4";

	public SellerDashboardPage(WebDriver driver) {
		super(driver);
	}
	public void navegateToMyCatalog() {
		clickElement(getWebElementBy(myCatalogLink));

	}
	public boolean isOptionExist(String optionName) {
		return isElementExist(getWebElementBy(replaceLocatorsWith(myCatalogLink,optionName)));
	}
	public void navigateToAccessories() {
		clickElement(getWebElementBy(accessories));

	}

	public boolean isOptionCategoryExist(String optionCategory) {
		return isElementExist(getWebElementBy(replaceLocatorsWith(myCatalogLink,optionCategory)));

	}
	public void creatList() {

		typeText(getWebElementBy(pName),title);
		typeText(getWebElementBy(pDescription),description);
		typeText(getWebElementBy(pPrice),unitPrice);
		clickElement(getWebElementBy(pStutas));
		clickElement(getWebElementBy(firstButton));
		clickElement(getWebElementBy(secondButton));
		typeText(getWebElementBy(pQuantity),quantity);
		typeText(getWebElementBy(pWeight),weight);
		typeText(getWebElementBy(pLenght),lenght);
		typeText(getWebElementBy(pWidth),width);
		typeText(getWebElementBy(pHeight),height);
		typeText(getWebElementBy(pPhoto),photo);
		clickElement(getWebElementBy(pAdd));

	}


}
