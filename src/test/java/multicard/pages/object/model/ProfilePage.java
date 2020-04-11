package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class ProfilePage extends MasterPage {

	// Locators
	String countryDropDown = "{xpath://select[@id='billCountrySelect']";
	String stateDropDown = "{xpath://select[@id='billStateSelect']";

	/** Constructor */
	public ProfilePage(WebDriver driver) {
		super(driver); // Super Please Use this Driver
	}

	public void selectCountry(String countryName) {

		selectImteFromDropDown(getWebElementBy(countryDropDown), countryName);

	}

	public void selectState(String stateName) {

		selectImteFromDropDown(getWebElementBy(stateDropDown), stateName);

	}

}
