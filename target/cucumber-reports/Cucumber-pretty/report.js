$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FlipkartMobileSearchScenario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Sampa Roy"
    }
  ],
  "line": 4,
  "name": "Mobile Price validation",
  "description": "I want to use this template for my feature file",
  "id": "mobile-price-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Validation of searched mobile price with the total price",
  "description": "",
  "id": "mobile-price-validation;validation-of-searched-mobile-price-with-the-total-price",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user is on Flipkart home page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#   And user close the login pop up"
    }
  ],
  "line": 11,
  "name": "user enter search criteria",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate mobile search screen is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "capture the price of first mobile",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on the first mobile",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click on Add to cart option",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify the total price with the previous search page price",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.user_is_on_Flipkart_home_page()"
});
formatter.result({
  "duration": 15766235000,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.user_enter_search_criteria()"
});
formatter.result({
  "duration": 503326900,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.user_click_on_search_button()"
});
formatter.result({
  "duration": 98055400,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.validate_mobile_search_screen_is_displayed()"
});
formatter.result({
  "duration": 2307613200,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.capture_the_price_of_first_mobile()"
});
formatter.result({
  "duration": 44657700,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.click_on_the_first_mobile()"
});
formatter.result({
  "duration": 244774000,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.Add_To_Cart()"
});
formatter.result({
  "duration": 5117299300,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartMobileStepDefinition.Verify_Cart_price()"
});
formatter.result({
  "duration": 2324615400,
  "status": "passed"
});
});