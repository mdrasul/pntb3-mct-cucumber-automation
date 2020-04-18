package multicard.steps.defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class Sel_Wait_Learning_Steps {

	
	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Sel_Wait_Learning_Steps(MctTestHelper testHelper ){
		this.testHelper=testHelper;
	}

	
	@Given("^I am on dynamic web element loadin page$")
	public void i_am_on_dynamic_web_element_loadin_page(){
		
		testHelper.getDriver().get("http://localhost:8887/Sample-Web/dynamicWebElementLoading.htm");
	}

	
	/** For Element 1 ( Take 1 Second )  */

	@When("^I click button load element One$")
	public void i_click_button_load_element_One(){
		testHelper.getDriver().findElement(By.xpath("//button[contains(text(),'Load Element 1')]")).click();
	}
	
	@Then("^I Expect Hellow World One Displayed in Page$")
	public void i_Expect_Hellow_World_One_Displayed_in_Page(){

		
		boolean isHelloWordDisplayed = testHelper.getDriver().
				                       findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).
				                       isDisplayed();
		
		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}

	
	/** For Element 2 ( Takes 2 Second )   */
	@When("^I click button load element Two$")
	public void i_click_button_load_element_Two(){
		testHelper.getDriver().findElement(By.xpath("//button[contains(text(),'Load Element 2')]")).click();		
	}
	
	@Then("^I Expect Hellow World Two Displayed in Page$")
	public void i_Expect_Hellow_World_Two_Displayed_in_Page(){

		
		boolean isHelloWordDisplayed = testHelper.getDriver().
				                       findElement(By.xpath("//h4[contains(text(),'Hello World2!')]")).
				                       isDisplayed();
		
		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}


	
	/** For Element 3 ( Takes 3 Second )   */
	@When("^I click button load element Three$")
	public void i_click_button_load_element_Three(){
		testHelper.getDriver().findElement(By.xpath("//button[contains(text(),'Load Element 3')]")).click();		
	}
	
	@Then("^I Expect Hellow World Three Displayed in Page$")
	public void i_Expect_Hellow_World_Three_Displayed_in_Page(){

		
		boolean isHelloWordDisplayed = testHelper.getDriver().
				                       findElement(By.xpath("//h4[contains(text(),'Hello World3!')]")).
				                       isDisplayed();
		
		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}

	

	/** For Element 4 ( Takes 2-3-4 Second )   */
	@When("^I click button load element four$")
	public void i_click_button_load_element_Four(){
		testHelper.getDriver().findElement(By.xpath("//button[contains(text(),'Load Element 4')]")).click();		
	}
	
	@Then("^I Expect Hellow World four Displayed in Page$")
	public void i_Expect_Hellow_World_four_Displayed_in_Page(){

		// Expcilitly Waiting for One Specific Elements 
		WebDriverWait wait = new WebDriverWait(testHelper.getDriver(), 10);
		WebElement targetElement4 = 
			      wait.until(ExpectedConditions.visibilityOfElementLocated(
			       By.xpath("//h4[contains(text(),'Hello World4!')]")));

	
		boolean isHelloWordDisplayed = testHelper.getDriver().
				                       findElement(By.xpath("//h4[contains(text(),'Hello World4!')]")).
				                       isDisplayed();
		
		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}

	
	
	
}
