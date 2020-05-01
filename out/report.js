$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("clothingpurchase.feature");
formatter.feature({
  "line": 1,
  "name": "User Purchase Mechanism",
  "description": "As a User I want to perform checkout activity\r\n  So I can see my items for checking out",
  "id": "user-purchase-mechanism",
  "keyword": "Feature"
});
formatter.before({
  "duration": 446400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Purchasing Items",
  "description": "",
  "id": "user-purchase-mechanism;purchasing-items",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I land on multicart landing page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select clothing option for purchase",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select women pink shirt",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click buy now for checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I checkout as a guest",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "fill up Billing and Shipping address",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.i_open_browser_chrome()"
});
formatter.result({
  "duration": 9739545600,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.i_land_on_multicart_landing_page()"
});
formatter.result({
  "duration": 2891301200,
  "status": "passed"
});
formatter.match({
  "location": "SelectClothing.i_select_clothing_option_for_purchase()"
});
formatter.result({
  "duration": 4639896000,
  "status": "passed"
});
formatter.match({
  "location": "SelectPinkShirt.i_select_women_pink_shirt()"
});
formatter.result({
  "duration": 4470673600,
  "status": "passed"
});
formatter.match({
  "location": "BuyNowCheckoutSteps.i_click_buy_now_for_checkout()"
});
formatter.result({
  "duration": 6187220000,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSteps.i_checkout_as_a_guest()"
});
formatter.result({
  "duration": 3094466400,
  "status": "passed"
});
formatter.match({
  "location": "BillingShippinhSteps.fill_up_Billing_and_Shipping_address()"
});
formatter.result({
  "duration": 33825884600,
  "status": "passed"
});
formatter.after({
  "duration": 76496800,
  "status": "passed"
});
});