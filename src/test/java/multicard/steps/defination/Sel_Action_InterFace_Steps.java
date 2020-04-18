package multicard.steps.defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import multicard.steps.support.MctTestHelper;

public class Sel_Action_InterFace_Steps {


	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Sel_Action_InterFace_Steps(MctTestHelper testHelper) {
		this.testHelper = testHelper;
	}


	@Given("^I am on Mouse Hover Page$")
	public void i_am_on_Mouse_Hover_Page(){
		testHelper.getDriver().get("http://the-internet.herokuapp.com/hovers");
	}

	@Given("^I move my mouse Over First Image$")
	public void i_move_my_mouse_Over_First_Image() {

		// When We are in the PAge 
		// We Need Perform a Special Mouse Hover Action 
		//div[@class='example']//div[1]//img[1]
		WebElement actionEle= testHelper.getDriver().findElement(By
							   .xpath("//div[@class='example']//div[1]//img[1]"));

		// Mouse Move On top of First Image 
		Actions act1=new Actions(testHelper.getDriver());
		act1.moveToElement(actionEle).build().perform();
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("^I can Click On Profile Link$")
	public void i_can_Click_On_Profile_Link(){
		
		testHelper.getDriver().findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Then("^I navigate to dragDrop Page$")
	public void I_navigate_to_dragDrop_Page(){
		
		
		testHelper.getDriver().get("http://the-internet.herokuapp.com/drag_and_drop");

	}
	
	@Then("^I perform some Drag Drop$")
	public void I_perform_some_Drag_Drop() throws InterruptedException{
		
		WebDriver lovalDriver;
		lovalDriver = testHelper.getDriver();
				
		WebElement SourceElement= lovalDriver.findElement(By.id("column-a"));
		WebElement TargetElement= lovalDriver.findElement(By.xpath("//div[@id='column-b']"));
		Actions action = new Actions(lovalDriver);
		Thread.sleep(3000);
		
		action.moveToElement(TargetElement).build().perform();  
		//action.dragAndDrop(SourceElement, TargetElement).build().perform();
	
		action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
		Thread.sleep(3000);

		

	}

}
