package com.test.o2.stepdefination.productdetails;

import com.test.o2.base.WebConnector;
import com.test.o2.pages.ProductDetailsPage;
import cucumber.api.java.en.When;

public class ProductDetailsStepDefination {
	
	public static String View_our_tarriffs="deviceDetailsSubmit";
	
	WebConnector webConnector = WebConnector.getWebConnector();
	ProductDetailsPage productDetailsPage=new ProductDetailsPage();
	
	
	@When("^I Choose View our tariffs$")
	public void i_choose_view_our_tariffs(){
		productDetailsPage.selectViewOurTariffs(View_our_tarriffs);
	}

}
