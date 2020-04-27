package multicard.pages.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class SellerPage extends MasterPage{

	String leftAlignOptions_label="{xpath://*[@id=\"layout\"]/div[2]/div[1]/div";
//	String AllOptions_label="{xpath://*[@id=\"layout\"]/div[2]/div[1]/div";
			//div[@class='links_container']//div";
	//div[@class='links_container']//div[@class='left']/a";
	public SellerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		}
public boolean countElementInleftAlignOptions() {
	return getElementsCount(leftAlignOptions_label);

}

public List<String> getWebelementsListtable() {
	// TODO Auto-generated method stub
return getElementsTextAsList(getWebElements(leftAlignOptions_label));
}
}
	
	

