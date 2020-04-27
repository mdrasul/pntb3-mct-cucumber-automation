package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class DashBoardAccessoriespage extends MasterPage {

	public DashBoardAccessoriespage(WebDriver driver) {
		super(driver);

	}

	// XPATH LOCATION PAGE 1
	String navigate_to_Dashboard_page = "{xpath://a[contains(text(),'Seller Dashboard')]";
	String my_catalog_btn = "{xpath://a[contains(text(),'My Catalog')]";
	String accessories_link = "{xpath://tr[2]//td[1]//a[1] ";
	String product_name_box = "{xpath://input[@id='txtProductName'] ";
	String product_description_box = "{xpath://iframe[@class='cke_wysiwyg_frame cke_reset']";
	String price_text_box = "{xpath://input[@id='txtPrice']";
	String proceed_link = "{xpath://button[@id='primery_btt_tab_1']";

	// string description PAGE 1
	String prduct_name = "TEE SHIRT";
	String product_description = "RED TEE SHIRT";
	String product_price = "100";

	// XPATH LOCATORS PAGE 2
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
	String product_in_stock_qty = "5";
	String product_weight = "1";
	String product_length = "10";
	String product_width = "20";
	String product_height = "100";
	String image = "C:\\Users\\User\\hasan.file";

	public void clickCatalogbtn() {
		clickElement(getWebElementBy(my_catalog_btn));
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
		clickElement(getWebElementBy(proceed_link));

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
//		WebElement chooseFile = driver.findElement(By.xpath("image_link")).sendKeys(image);
//		chooseFile.sendKeys("/Users/ankita/Downloads/edureka.png");
		typeText(getWebElementBy(image_link), image);
		// driver.findElement(By.xpath(image_link)).sendKeys(image);
		uglyWaitFor(3000);
		clickElement(getWebElementBy(add_product_link));

	}

	public void navigateToDashBoardPage() {

		clickElement(getWebElementBy(navigate_to_Dashboard_page));
	}

}
