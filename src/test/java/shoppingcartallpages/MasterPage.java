package shoppingcartallpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MasterPage {
WebDriver driver;
	
	public MasterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void typeText(WebElement targetWebElement, String texttobeWrite) {
		targetWebElement.sendKeys(texttobeWrite);
	}

	public void clickElement(WebElement targetWebElement) {
		targetWebElement.click();
	}

	public boolean isElementExist(WebElement targetWebElement) {
		try {
			return targetWebElement.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getElementText(WebElement targetWebElement) {
		return targetWebElement.getText();
	}
	

	public boolean getElementsCount(String locators) {

		try {
			List<WebElement> allFriendselement = driver.findElements(By.xpath(locators.split(":")[1])); // List
			System.out.println("Friends Fount Totoal " + allFriendselement.size());
			if (allFriendselement.size() > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	/** Helper Functions 
	 * @param string */
	
	
	public WebElement getWebElementBy(String locators) {
		
		// Local WebElment
		WebElement tempWebElement = null;
		
		// If this below code executed a Real WebElement will be ready to return 
		if (locators.contains("{name")) {
			tempWebElement = driver.findElement(By.name(locators.split(":")[1]));
		} else if (locators.contains("{xpath")) {
			tempWebElement = driver.findElement(By.xpath(locators.split(":")[1]));
		} else if (locators.contains("{id")) {
			tempWebElement = driver.findElement(By.id(locators.split(":")[1]));
		} 
		
		if(tempWebElement!=null) {
			highlightElementBackground(tempWebElement, "pass");
		}

		return tempWebElement;
	}
	
	public void uglyWaitFor(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void highlightElement(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (flag.equalsIgnoreCase("pass")) {
			js.executeScript("arguments[0].style.border='2px groove green'", element);
		} else {
			js.executeScript("arguments[0].style.border='2px solid red'", element);

		}
		uglyWaitFor(2000);
	}

	public void highlightElementBackground(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (flag.equalsIgnoreCase("pass")) {
			// js.executeScript("arguments[0].style.border='1px groove green'", element);
			js.executeScript("arguments[0].style.backgroundColor = '" + "orange" + "'", element);
		} else {
			// js.executeScript("arguments[0].style.border='4px solid red'", element);
			js.executeScript("arguments[0].style.backgroundColor = '" + "red" + "'", element);
		}

		uglyWaitFor(500);
	}

	public void highlightElementBorder(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (flag.equalsIgnoreCase("pass")) {
			js.executeScript("arguments[0].style.border='2px groove green'", element);
		} else {
			js.executeScript("arguments[0].style.border='2px solid red'", element);

		}
		uglyWaitFor(2000);
	}
	
	/**
	 * Cleaning Locators This Method will check if a Locator String contains any
	 * ${XXRPCLXX} in it If found method will replace the ${XXRPCLXX} value with
	 * Appropriate Argument/Value
	 */
	public String replaceLocatorsWith(String locatorString, String ReplaceCharacters) {
		if (locatorString.contains("${XXRPCLXX}")) {
			return locatorString.replace("${XXRPCLXX}", ReplaceCharacters);
		} else {
			return locatorString;
		}
	}

	public void SelectFromDropDown(WebElement targetWebElement, String value) {
		Select select=new Select(targetWebElement);
		select.selectByVisibleText(value);
	}
	
}
