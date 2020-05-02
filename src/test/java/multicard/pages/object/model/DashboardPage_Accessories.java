//@Author-Jebril_Mohammad
package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class DashboardPage_Accessories extends MasterPage {

	// XPATH LOCATION PAGE 1
	String buyer_Dashboard = "{xpath://a[contains(text(),'Buyer Dashboard')]";
	String my_catalog_btn = "{xpath://a[contains(text(),'My Catalog')]";
	String header_Exist = "{xpath://h1[contains(text(),'Catalog')]";
	String accessories_link = "{xpath://tr[2]//td[1]//a[1] ";
	String product_name_box = "{xpath://input[@id='txtProductName'] ";
	String product_description_box = "{xpath://iframe[@class='cke_wysiwyg_frame cke_reset']";
	String price_text_box = "{xpath://input[@id='txtPrice']";
	String publish_status = "{xpath://input[@id='jQPublish_Y']";
	String proceed_link = "{xpath://button[@id='primery_btt_tab_1']";
	
	// string description PAGE 1
	String prduct_name = "Apple watch";
	String product_description = "APPLE WATCH SMART WATCH";
	String product_price = "500";
	
	//XPATH LOCATORS PAGE 2
	String variants_link_Exist = "{xpath://a[@id='ui-id-2']";
	String proceed_link_2ndPge = "{xpath://button[@id='primery_btt_tab_2']";

	// XPATH LOCATION PAGE 3
	String product_in_stock_box = "{xpath://input[@id='product_stock[]']";
	String product_weight_box = "{xpath://input[@id='product_shipping_weight[]']";
	String product_length_box = "{xpath://input[@id='product_length[]']";
	String product_width_box = "{xpath://input[@id='product_width[]']";
	String product_height_box = "{xpath://input[@id='product_height[]']";
	String image_link = "{xpath://div[@class='variant_detail_bottom_outer']//label[@class='btn-bs-file btn btn-lg btn-info upload_image'][contains(text(),'Choose File')]";
	String add_product_link = "{xpath://button[@name='btnAddProduct']";

	// STRING DESCRIPTION PAGE 3
	String product_in_stock_qty = "10";
	String product_weight = "5";
	String product_length = "30";
	String product_width = "20";
	String product_height = "50";
	String image = "/Users/mohammadjebril/Desktop/Screen Shot 2020-03-30 at 7.45.48 PM.png";

	public DashboardPage_Accessories(WebDriver driver) {
		super(driver);

	}

	public boolean isHeaderExist() {
		return isElementExist(getWebElementBy(buyer_Dashboard));
	}

	public void clickCatalogbtn() {
		clickElement(getWebElementBy(my_catalog_btn));
	}

	public boolean isCatalogCatagoriesExist() {
		return isElementExist(getWebElementBy(header_Exist));
	}

	public void clickOnAccessoriesLink() {
		clickElement(getWebElementBy(accessories_link));
	}

	public void addNewProductPage_1() {
		uglyWaitFor(7000);
		typeText(getWebElementBy(product_name_box), prduct_name);
		typeText(getWebElementBy(product_description_box), product_description);
		uglyWaitFor(3000);
		typeText(getWebElementBy(price_text_box), product_price);
		clickElement(getWebElementBy(publish_status));
		clickElement(getWebElementBy(proceed_link));

	}

	public boolean isVariantspage2Exizt() {
		return isElementExist(getWebElementBy(variants_link_Exist));
	}

	public void addNewProductPage_2() {

		clickElement(getWebElementBy(proceed_link_2ndPge));
	}

	public void addnewProductPage3() {
		uglyWaitFor(3000);
		typeText(getWebElementBy(product_in_stock_box), product_in_stock_qty);
		typeText(getWebElementBy(product_weight_box), product_weight);
		typeText(getWebElementBy(product_length_box), product_length);
		typeText(getWebElementBy(product_width_box), product_width);
		typeText(getWebElementBy(product_height_box), product_height);
		uglyWaitFor(3000);
		typeText(getWebElementBy(image_link), image);
		uglyWaitFor(3000);
		clickElement(getWebElementBy(add_product_link));

	}

	
}
