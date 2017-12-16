package com.test.o2.stepdefination.home;

import com.test.o2.base.WebConnector;
import com.test.o2.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDefination {
	
	
		WebConnector webConnector = WebConnector.getWebConnector();
		HomePage homePage=new HomePage();
	
	@Given("^I am on O2UK Home Page$")
	public void I_go_to_o2uk_home_page() {
		webConnector.openBrowser();
		webConnector.launchApplication();
	}
	
	@When("^I Choose to buy iPhoneX$")
	public void i_choose_to_buy(){
		homePage.chooseToBuyProduct();
	}
	

}
