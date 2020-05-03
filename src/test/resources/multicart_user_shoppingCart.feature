Feature: User shopping cart table feature
  

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    
    @WIP
    Scenario: User shopping cart table is available
    When I navigate to Accessories page
    And i try to buy something
    Then i see the shopping cart table is available