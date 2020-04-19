package multicard.pages.object.model;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class CuponPages extends MasterPage{
	String cCodesLink = "{xpath://*[@id=\"layout\"]/div[2]/div[1]/div[11]/a";
	String addCuponLink = "{xpath://*[@id=\"layout\"]/div[2]/div[2]/div[3]/form/table/tbody/tr/td[2]/a";
	String cuponCodeLink = "{xpath://input[@id='txtCouponCode']";
	String stsrtDate = "{xpath://tr[8]//td[3]//a[1]";
	String endDate = "{xpath://tr[9]//td[3]//a[1]";
	String persentageCupon = "{xpath://input[@id='txtCouponDiscount']";
	String addButtonLink = "{xpath://input[@name='add']";
	
	//Value
	String cCode="565565";
	String sDate = "{xpath://font[contains(text(),'15')]";
	String eDate = "{xpath:/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]/a/font";
	//String eDate = "{xpath://font[contains(text(),'20')]";
	String persantage = "40";

	public CuponPages(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void navigateToCouponCodes() {
		
		clickElement(getWebElementBy(cCodesLink));
		clickElement(getWebElementBy(addCuponLink));
	}
	
	public void windowpopuphandler1() {
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String ParentsId1 = it.next();
		System.out.println("Parent window id1 is"+ParentsId1);	
		String childId1 = it.next();
		System.out.println("child window id1 is"+childId1);
		driver.switchTo().window(childId1);
		clickElement(getWebElementBy(sDate));
		driver.switchTo().window(ParentsId1);
		
	}
	public void windowpopuphandler2() {
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String ParentsId1 = it.next();
		System.out.println("Parent window id1 is"+ParentsId1);	
		String childId1 = it.next();
		System.out.println("child window id1 is"+childId1);
		driver.switchTo().window(childId1);
		uglyWaitFor(2000);
		clickElement(getWebElementBy(eDate));
		//driver.close();
		driver.switchTo().window(ParentsId1);
		
	}
	
	public void addingCupon() {
		typeText(getWebElementBy(cuponCodeLink),cCode);
		clickElement(getWebElementBy(stsrtDate));
		windowpopuphandler1();
		uglyWaitFor(3000);
		clickElement(getWebElementBy(endDate));
		windowpopuphandler2();
		uglyWaitFor(3000);
		typeText(getWebElementBy(persentageCupon),persantage);
		clickElement(getWebElementBy(addButtonLink));
		
	}

}
