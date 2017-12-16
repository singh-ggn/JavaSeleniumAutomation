$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/test/xyz/features/getBasketItemCount.feature");
formatter.feature({
  "line": 2,
  "name": "Login into application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login into sales force",
  "description": "",
  "id": "login-into-application;login-into-sales-force",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on O2UK Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Choose to buy iPhoneX",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I Choose View our tariffs",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Choose product tarrif insrance and accessories",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Choose to go to Basket",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefination.I_go_to_o2uk_home_page()"
});
formatter.result({
  "duration": 57995781772,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefination.i_choose_to_buy()"
});
formatter.result({
  "duration": 20887654044,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsStepDefination.i_choose_view_our_tariffs()"
});
formatter.result({
  "duration": 448034,
  "error_message": "java.lang.NullPointerException\r\n\tat com.test.o2.pages.ProductDetailsPage.selectViewOurTariffs(ProductDetailsPage.java:12)\r\n\tat com.test.o2.stepdefination.productdetails.ProductDetailsStepDefination.i_choose_view_our_tariffs(ProductDetailsStepDefination.java:17)\r\n\tat ✽.And I Choose View our tariffs(src/test/resources/com/test/xyz/features/getBasketItemCount.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChooseYourTariffStepDefination.i_choose_product_tariff_and_accessorie()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChooseYourTariffStepDefination.I_choose_to_go_to_basket()"
});
formatter.result({
  "status": "skipped"
});
});