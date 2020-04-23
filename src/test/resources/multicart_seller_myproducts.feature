
Feature: As a Seller I want to perform all products related activities
    So I can see my products, and can add product

  
  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    Then I navigate to my DASHBORD page
  	When I complite login for Seller valid credentials
    
  
  @wip
  Scenario: Product Table
    And I navigate to product page
    Then I expect to see product table
    
	
    