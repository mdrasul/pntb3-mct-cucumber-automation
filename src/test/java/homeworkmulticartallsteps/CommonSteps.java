package homeworkmulticartallsteps;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import homeworkmulticartallpages.HomePage;

public class CommonSteps {
//
//	CommonSteps(){
//		
//        	}
	@Given("^I open browser chrome$")
	public void i_open_browser_chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayee\\eclipse-workspace\\homework.multicart.pnt\\chromedriver.exe");

		TestHelper.driver= new ChromeDriver();
		TestHelper.driver.manage().window().maximize();
		TestHelper.driver.manage().deleteAllCookies();
	}

	@Given("^I land on multicart landing page$")
	public void i_land_on_multicart_landing_page() throws InterruptedException {
		TestHelper.driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		Thread.sleep(2000);

	}
	

}