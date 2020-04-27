Feature: Looking for some product in search Box
  I want to use this template for my feature file

  Background: Landing on Multicart Home Page
    Given I open browser chrome
    And I land on multicart landing page
#@Manir
  Scenario: look for abcd in Search Box
    Then I type abcd in Search Box
    And I validate  No Results Found !! in the Search page
#@Manir
  Scenario: look for SLIM FIT SOLID FORMA in Search Box
    Then I type SLIM FIT SOLID FORMA in Search Box
    And I validate  Slim Fit Solid Formal Shi.. in the Search page
#@Manir
  Scenario: Add Slim Fit Solid Formal Shirt in Shopping cart
    Then I type SLIM FIT  in Search Box
    And I want to navigate to Shopping Cart page
    When I want to buy two Shirt and checkout
    And I want to check Product Total available
#@Manir
   Scenario: Navigate to the seller Page
    When I want to go to Seller login option
    And I want to login as as seller and landing seller Page
    Then I want to count left align WebElement avaiable
    
    