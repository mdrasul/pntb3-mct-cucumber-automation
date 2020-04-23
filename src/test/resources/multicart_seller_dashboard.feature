Feature: Seller DASHBOARD Activities
  As a Seller I want to go to my DASHBOARD
  SO i can perform all activities

	@wip
  Scenario: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    Then I navigate to my DASHBORD page
    Then I see Seller Login option 
 
