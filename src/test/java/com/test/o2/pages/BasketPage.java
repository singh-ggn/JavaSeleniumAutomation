package com.test.o2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.o2.base.WebConnector;

public class BasketPage {
	WebConnector webConnector = WebConnector.getWebConnector();
	
	public void selectViewOurTariffs(String itemToChoose) throws InterruptedException {
		WebElement elementToBuy=webConnector.getWebDriver().findElement(By.id(itemToChoose));
		elementToBuy.click();
	}
	

}
