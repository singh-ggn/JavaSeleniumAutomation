package com.test.o2.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"html:target/systemtest", "pretty" }, 
	features = "src/test/resources/com/test/xyz/features/getBasketItemCount.feature",
	glue = {"com.test.o2.stepdefination.home","com.test.o2.stepdefination.productdetails","com.test.o2.stepdefination.chooseyourtariff","com.test.o2.stepdefination.basket"},
	plugin = {"html:target/systemtest/cucumber-html-report", "json:target/systemtest/cucumber-json-report.json" },
	tags = {"@run", "~@ignore" }
	//monochrome = true,
)

public class GetBasketItemCountTest {
	
}
