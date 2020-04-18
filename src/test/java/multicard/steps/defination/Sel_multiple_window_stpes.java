package multicard.steps.defination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import multicard.steps.support.MctTestHelper;

public class Sel_multiple_window_stpes {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Sel_multiple_window_stpes(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@Given("^I am on multi window test Page$")
	public void i_am_on_multi_window_test_Page() {
		testHelper.getDriver().get("http://the-internet.herokuapp.com/windows");
	}

	@Given("^I click on new window button$")
	public void i_click_on_new_window_button() {
		testHelper.getDriver().findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	}

	@Given("^I can get the text from new window$")
	public void i_can_get_the_text_from_new_window() {

		// It will return the parent window name as a String
		String mainWindow = testHelper.getDriver().getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = testHelper.getDriver().getWindowHandles();

		// Need Unload the parent so we can start from the First Child
		set.remove(mainWindow);

		Iterator<String> itr = set.iterator(); // 2 Items [ 1 Parent, 2 child
		while (itr.hasNext()) {

			String childWindow = itr.next(); // Give First Child Reference

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {
				
				//Switching to Child 
				testHelper.getDriver().switchTo().window(childWindow);
				
				String childText = testHelper.getDriver().findElement(By.xpath("//h3[contains(text(),'New Window')]"))
						.getText();

				System.out.println(childText);
				testHelper.getDriver().close(); // Closed the Switched Child
			}

		}

		// This is to switch to the main window
		testHelper.getDriver().switchTo().window(mainWindow);

	}

	@Given("^I get back to parent & print parents Heeading$")
	public void I_get_back_to_parent_print_parents_Heeading() {
		
		String parentHeading = testHelper.getDriver()
				               .findElement(By
				               .xpath("//h3[contains(text(),'Opening a new window')]"))
				                .getText();
		System.out.println(parentHeading);
		
	}
	
}
