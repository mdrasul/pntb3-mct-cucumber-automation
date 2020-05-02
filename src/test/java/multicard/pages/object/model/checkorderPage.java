package multicard.pages.object.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class checkorderPage extends MasterPage {
	String Dropdown= "{xpath://select[@name='cmbSearchType']";
String NumId = "{xpath:(//input[@name='txtSearch'])[2]";
String Go = "{xpath://input[@class='primary_btt']";
String noresult="{xpath://td[@class='text_information']" ;
//String result ="{xpath://div[@class='col-xs-12 col-sm-6 col-md-8 col-lg-8 vieworder_box_R_outer']";
//String result ="{xpath:(//a[@href='vieworder.php?orderid=65'])[2]";
String result ="{xpath:(//a[contains(@href,'vieworder.php?orderid')])[2]";
String btnBack="{xpath://button[@name='btnBack']";
String btnBackorder="{xpath://input[@class='button']";

String orderid;
String orderINF="{xpath://div[@class='text_information']" ;
//div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer'][1]" // order number 
//div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer'][2]"// order date
//div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer'][3]" // order total

 String ordnumb ="{xpath:( div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer'])[1]";
 String orddate ="{xpath:( div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer'])[2]";
 String ordtotal ="{xpath:( div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer'])[3]";
 String ordstatus ="{xpath:( div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer'])[4]";
String innerform ="{xpath://div[@class='inner_page_container']//div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4 vieworder_box_L_outer']";
 public String Id;
 
	public checkorderPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize(); // Extend the page 

		// TODO Auto-generated constructor stub
	}
/*public void selectsearch(){
//WebElement TypeOrder=	getWebElementBy(Dropdown);
WebElement Typeorder = getWebElementBy(Dropdown);
	Select TypeOrderV =  new Select(Typeorder);
	// highlightElementBackground(TypeOrderV);
	 TypeOrderV.selectByIndex(1);
	 uglyWaitFor(2000);
}*/
	
	/*public void selectsearch(){
		selectsearch1(Dropdown);
	}*/
	public void selectsearch(){	
		 selectImteFromDropDown (getWebElementBy(Dropdown),"Order ID" ); 
			highlightElementBorder(getWebElementBy(Dropdown), "Order ID");// ADD by Meriem
			//					

		 uglyWaitFor(1000);
}

public String TypeId(String Id) {
	this.Id=Id;
	typeText(getWebElementBy(NumId), Id);
	 uglyWaitFor(1000);
	clickElement(getWebElementBy(Go));
return Id;
}
public void displayM(String Id) {
	this.Id=Id;
	System.out.println( "Variable is TEST " +Id);
	
}
public String   checkexistence() {

	String X=getWebElementBy(result).getText();
	 uglyWaitFor(1000);

	//getWebElementBy("result").click();
	System.out.println( "Xpath value Result  is TEST " +X);
 return X;
	
}
	
public List<String> getAlltitle() {
	uglyWaitFor(3500);
	return getElementsTextAsList(getWebElements(innerform));
}

public String Nocheckexistence() {
	String Y = getWebElementBy(noresult).getText();
	System.out.println( "Xpath value Result  is TEST " +Y);
	return Y;
}
public void Goback( ) {
	//uglyWaitFor(2000);
	clickElement(getWebElementBy(btnBack));
}
public void Gobackorder( ) {
	//uglyWaitFor(2000);
	clickElement(getWebElementBy(btnBackorder));
}

public void clickondetail( ) {
	clickElement(getWebElementBy(result));
}

}



