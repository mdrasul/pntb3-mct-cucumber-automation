package multicard.steps.defination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import multicard.steps.support.MctTestHelper;

public class Sel_Alert_Learning_Steps {

	// Dependency injection
	MctTestHelper testHelper;

	/** Constructor */
	public Sel_Alert_Learning_Steps(MctTestHelper testHelper ){
		this.testHelper=testHelper;
	}

	
	
	/** Alert Element TEsting   */

	
	@Given("^I am on page that loades Alert$")
	public void i_am_on_page_that_loades_Alert(){
		testHelper.getDriver().get("http://localhost:8887/Sample-Web/alertIWebPage.htm");
	}

	@When("^I click for js alert button$")
	public void i_click_for_js_alert_button(){
		
		try {
			
			// Alert That oNly SHow OK Button 
//			testHelper.getDriver().
//			findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"))
//			.click();

			
			// Alert That  SHow OK-Candel Button 
//			testHelper.getDriver().
//			findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"))
//			.click();


			// Alert That  SHow TExt box In it  
			testHelper.getDriver().
			findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"))
			.click();

			Alert alert = testHelper.getDriver().switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Alert data: " + alertText);
	        
	        alert.sendKeys("BLA BLA VLA BLA.....");
	        alert.accept(); 
	        //alert.dismiss();
	        	        
		} catch(Exception e) {
			
		}
	}

	@Then("^I can Accept the Alert and get result$")
	public void i_can_Accept_the_Alert() {

		String alertREsult = testHelper.getDriver()
						     .findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(alertREsult);
		
		
	}

}
