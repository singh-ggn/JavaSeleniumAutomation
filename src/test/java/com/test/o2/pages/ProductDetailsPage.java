package com.test.o2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.o2.base.WebConnector;

public class ProductDetailsPage {
	WebConnector webConnector;
	
	public void selectViewOurTariffs(String itemToChoose){
		WebElement elementToBuy=webConnector.getWebDriver().findElement(By.id(itemToChoose));
		elementToBuy.click();
	}
	

}
