Feature: Seller Login Mechanism
  	In order to get all membership benifit from multicart e-commerce
    As a seller I want to perform an online login


	Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    Then I navigate to my DASHBORD page
@wip
  Scenario: Landing on MCT Seller Home Page
  	
    When I complite login for Seller valid credentials
    Then I expect to see profile name as Seller

  
  