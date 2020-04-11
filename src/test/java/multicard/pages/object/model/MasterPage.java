package multicard.pages.object.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MasterPage {

	WebDriver driver;

	public MasterPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Generic browser Action Types Methods All Those Below Mthods Will Supply to
	 * its Childs TO Fo COmmpn Action Like Type() Click() isElementExist()
	 */

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

	public void selectImteFromDropDown(WebElement targetWebElement, String itemToSelect) {
		Select selectElement = new Select(targetWebElement);
		selectElement.selectByVisibleText(itemToSelect);

//		List<WebElement> allitemInDropDown = selectElement.getOptions();
//		for(int i=0;i<allitemInDropDown.size();i++) {
//			System.out.println(allitemInDropDown.get(0).getText());
//		}

	}

	// Functions Returns A COmplete Array List Back to its Caller
	public List<String> getElementsTextAsList(List<WebElement> webElements) {

		List<String> tempReturnList = new ArrayList<String>();
		try {
			System.out.println("Friends Fount Totoal " + webElements.size());
			for (int i = 0; i < webElements.size(); i++) {
				tempReturnList.add(webElements.get(i).getText());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempReturnList;
	}

	public void alertAccept() {
		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alertDismiss() {
		try {

			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Helper Functions */

	public void explicitLookForElement(String locators) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement tempWebElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators.split(":")[1])));
	}

	public WebElement getWebElementBy(String locators) {

		// Local WebElment
		WebElement tempWebElement = null;

		// If this below code executed a Real WebElement will be ready to return
		if (locators.contains("{name")) {
			explicitLookForElement(locators);
			tempWebElement = driver.findElement(By.name(locators.split(":")[1]));
		} else if (locators.contains("{xpath")) {
			explicitLookForElement(locators);
			tempWebElement = driver.findElement(By.xpath(locators.split(":")[1]));
		} else if (locators.contains("{id")) {
			explicitLookForElement(locators);
			tempWebElement = driver.findElement(By.id(locators.split(":")[1]));
		}

		if (tempWebElement != null) {
			highlightElementBackground(tempWebElement, "pass");
		}

		return tempWebElement;
	}

	public List<WebElement> getWebElements(String locators) {
		// Local WebElment
		List<WebElement> tempWebElements = null;

		// If this below code executed a Real WebElement will be ready to return
		if (locators.contains("{name")) {
			explicitLookForElement(locators);
			tempWebElements = driver.findElements(By.name(locators.split(":")[1]));
		} else if (locators.contains("{xpath")) {
			explicitLookForElement(locators);
			tempWebElements = driver.findElements(By.xpath(locators.split(":")[1]));
		} else if (locators.contains("{id")) {
			explicitLookForElement(locators);
			tempWebElements = driver.findElements(By.id(locators.split(":")[1]));
		}

//		if(tempWebElement!=null) {
//			highlightElementBackground(tempWebElement, "pass");
//		}

		return tempWebElements;
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
			js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);
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

}
