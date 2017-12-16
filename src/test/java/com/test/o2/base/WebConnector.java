package com.test.o2.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebConnector {

	private ConfigLoader configLoader;
	WebDriver driver = null;
	private static WebConnector webConnector = null;
	
	private WebConnector() {
		configLoader = new ConfigLoader();
		configLoader.onLoad();
	}
	
	public static WebConnector getWebConnector() {
		if(webConnector == null)
			webConnector = new WebConnector();
		
		return webConnector;
	} 

	public void openBrowser() {
		if (configLoader.config.getProperty("browserType").equalsIgnoreCase("chrome")) {
			initChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	private void initChromeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + WebConnectorConstants.CHROME_EXE);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		setWebDriver(new ChromeDriver(options));
	}
	
	private void setWebDriver(WebDriver webDriver) {
		this.driver = webDriver;
	}

	public WebDriver getWebDriver() {
		return this.driver;
	}
	
	public void launchApplication() {
		driver.get(configLoader.config.getProperty("URL"));
	}

	public void closeApplication() {
		driver.quit();
	}
}
