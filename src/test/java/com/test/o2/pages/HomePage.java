package com.test.o2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.test.o2.base.WebConnector;

public class HomePage {
	
	public static By itemsName = By.xpath("//*[@component-name='promoM']");
	WebConnector webConnector;

	public HomePage() {
		this.webConnector = WebConnector.getWebConnector();
	}
	
	public void chooseToBuyProduct(){
		WebElement elementToBuy=webConnector.getWebDriver().findElement(itemsName);
		elementToBuy.click();
	}
	

}
