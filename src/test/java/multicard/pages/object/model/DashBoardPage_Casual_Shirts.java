//@Author-Jebril_Mohammad
package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class DashBoardPage_Casual_Shirts extends MasterPage {
	// xpath for casual shirts
	String Caual_Shirts_link = "{xpath://a[contains(text(),'Casual shirts')] ";

	// XPATH LOCATION PAGE 1
	String product_name_box = "{xpath://input[@id='txtProductName'] ";
	String product_description_box = "{xpath://iframe[@class='cke_wysiwyg_frame cke_reset']";
	String price_text_box = "{xpath://input[@id='txtPrice']";
	String publish_status = "{xpath://input[@id='jQPublish_Y']";
	String proceed_link = "{xpath://button[@id='primery_btt_tab_1']";

	// string description PAGE 1
	String prduct_name = "POLO SHIRT";
	String product_description = "POLO COOLAR SHIRT,100% COTTON";
	String product_price = "50";

	// PAGE 2
	String products_header_Exist = "{xpath://h2[contains(text(),'Products under this category')]";
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
	String product_in_stock_qty = "100";
	String product_weight = "5";
	String product_length = "30";
	String product_width = "20";
	String product_height = "50";
	String image = "/Users/mohammadjebril/Desktop/Screen Shot 2020-03-30 at 7.45.48 PM.png";
	
	//constructor
	public DashBoardPage_Casual_Shirts(WebDriver driver) {
		super(driver);
	}
//	//product to select
//	public void clickOnCaualShirts() {
//		clickElement(getWebElementBy(Caual_Shirts_link));
//
//	}
//	//page 1 product info
	public void addCasualProductPage1() {
		uglyWaitFor(7000);
		typeText(getWebElementBy(product_name_box), prduct_name);
		typeText(getWebElementBy(product_description_box), product_description);
		uglyWaitFor(3000);
		typeText(getWebElementBy(price_text_box), product_price);
		clickElement(getWebElementBy(publish_status));
		clickElement(getWebElementBy(proceed_link));
	}
	//page 2
	public void addCasualproductPage2() {

		clickElement(getWebElementBy(proceed_link_2ndPge));

	}
	// PAGE2 header validation
	public boolean isProductsCategoryHeadrerExist() {
		return isElementExist(getWebElementBy(products_header_Exist));
	}
	//page 3 product info
	public void addNewCausalProductPage3() {
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
