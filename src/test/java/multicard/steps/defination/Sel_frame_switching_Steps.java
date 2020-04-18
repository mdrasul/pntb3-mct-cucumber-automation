package multicard.steps.defination;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class Sel_frame_switching_Steps {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Sel_frame_switching_Steps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}

	@Given("^I am on Frame Page$")
	public void i_am_on_Frame_Page() {

		testHelper.getDriver().get("http://the-internet.herokuapp.com/nested_frames");
	}

	@Then("^I can acccess the Left Frame Text$")
	public void i_can_acccess_the_Left_Frame_Text() {

		// Switching From Parent to frame-top
		testHelper.getDriver().switchTo().frame("frame-top");

		// Switching From frame-top to frame-Left
		testHelper.getDriver().switchTo().frame("frame-left");

		// Code to Find Out The Element
		String expText = testHelper.getDriver().findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();

		System.out.println(expText);

	}

	@Then("^I can acccess the Middle Frame Text$")
	public void i_can_acccess_the_Middle_Frame_Text() {

		// Lets Get Back to Parent
		testHelper.getDriver().switchTo().defaultContent();

		// Switching From Parent to frame-top
		testHelper.getDriver().switchTo().frame("frame-top");

		// Switching From frame-top to frame-Middle
		testHelper.getDriver().switchTo().frame("frame-middle");

		// Code to Find Out The Element
		String expText = testHelper.getDriver().findElement(By.xpath("//div[@id='content']")).getText();

		System.out.println(expText);

	}

	@Then("^I can acccess the Right Frame Text by switching one by one$")
	public void i_can_acccess_the_Right_Frame_Text() {

		// Lets Get Back to Parent
		testHelper.getDriver().switchTo().defaultContent();

		// Switching From Parent to frame-top
		testHelper.getDriver().switchTo().frame("frame-top");

		// Switching From frame-top to frame-Right
		testHelper.getDriver().switchTo().frame("frame-right");

		// Code to Find Out The Element
		String expText = testHelper.getDriver().findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();

		System.out.println(expText);

	}

	@Given("^I Navigate to Iframe Page$")
	public void I_Navigate_to_Iframe_Page() {

		testHelper.getDriver().get("http://the-internet.herokuapp.com/iframe");
	}

	@Then("^I Also can acccess  Iframe$")
	public void I_Also_can_acccess_Iframe() {

		int size = testHelper.getDriver().findElements(By.tagName("iframe")).size();
		System.out.println("How Many Iframe is there " + size);

		testHelper.getDriver().switchTo().frame("mce_0_ifr"); // Switched By ID ...

		System.out.println("No Issue Switched Happen .");

		// To Do : There is a WYSWYG Input Box Need to Know How to Automate it
	}

}
