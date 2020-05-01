Feature: User Purchase Mechanism
  As a User I want to perform checkout activity
    So I can see my items for checking out 
    
@WIP
  Scenario: Purchasing Items
   Given I open browser chrome
    And I land on multicart landing page
    When I select clothing option for purchase
    Then I select women pink shirt 
    And I click buy now for checkout
    Then I checkout as a guest
    Then fill up Billing and Shipping address