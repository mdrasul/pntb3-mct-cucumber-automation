Feature: User Orders Mechanism
  As a User I want to perform all orders related activity
    So I can see my Orders , History, All those stuff

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    
@mcttest
  Scenario: Order Page Header Check
    When I navigate to order page
    Then I expect Order page header is availablee

@mcttest
   Scenario: Order History Table Aviable 
    When I navigate to order page
    Then I expect Order History Table Avaiable
    