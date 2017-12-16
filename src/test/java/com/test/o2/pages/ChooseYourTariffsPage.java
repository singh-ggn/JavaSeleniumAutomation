package com.test.o2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.o2.base.WebConnector;

public class ChooseYourTariffsPage {

	public static By productTariff = By.xpath("//button[@id='callToAction']");
	public static By productInsurance = By.xpath("(//input[@value='Select'])[1]");
	public static By productAccessorie = By.xpath("(//input[@value='Add'])[2]");
	public static By goToBasket = By.xpath("//input[@id='qa-proceed-to-basket-dock-header']");

	WebConnector webConnector;

	public ChooseYourTariffsPage() {
		this.webConnector = WebConnector.getWebConnector();
	}

	public void chooseProductTariffs() {
		WebElement elementTariff = webConnector.getWebDriver().findElement(productTariff);
		elementTariff.click();
	}

	public void chooseProductAccessories() throws InterruptedException {
		WebElement elementAccessories = webConnector.getWebDriver().findElement(productAccessorie);
		Thread.sleep(3000);
		elementAccessories.click();
	}

	public void chooseProductInsurance() {
		WebElement elementInsurance = webConnector.getWebDriver().findElement(productInsurance);
		elementInsurance.click();
	}

	public void goToBasket() {
		WebElement elementBasket = webConnector.getWebDriver().findElement(goToBasket);
		elementBasket.click();
	}

}
