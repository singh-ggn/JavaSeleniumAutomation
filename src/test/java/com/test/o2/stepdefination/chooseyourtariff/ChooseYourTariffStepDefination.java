package com.test.o2.stepdefination.chooseyourtariff;

import com.test.o2.pages.ChooseYourTariffsPage;
import cucumber.api.java.en.Then;

public class ChooseYourTariffStepDefination {
	
	ChooseYourTariffsPage chooseYourTariffsPage ;

	public ChooseYourTariffStepDefination(ChooseYourTariffsPage chooseYourTariffsPage) {
		this.chooseYourTariffsPage = chooseYourTariffsPage;
	}

	@Then("^I Choose product tarrif insrance and accessories$")
	public void i_choose_product_tariff_and_accessorie() throws InterruptedException{
		chooseYourTariffsPage.chooseProductTariffs();
		chooseYourTariffsPage.chooseProductInsurance();
		chooseYourTariffsPage.chooseProductAccessories();
	}
	
	@Then("^I Choose to go to Basket$")
	public void I_choose_to_go_to_basket(){
		chooseYourTariffsPage.goToBasket();
	}
}
