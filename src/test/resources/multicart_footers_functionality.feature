Feature: Footers Functionality
  
  In order to check that all the footers are available and 
  also all the footers links are active I use the following steps

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page

  Scenario: Check All Footer Links Availability
    When I check all the footers are available
    Then I varify all the footer links are available

  Scenario: Check Footer Links Are Active
    When I check about us link is active
    And I check view cart link is active
    And I check affiliates link is active
    

  Scenario: Check Twitter Link Is Active & Redirect To The Page
    When I check Twitter link is active
    And I verify the link redirect to Twitter page

  Scenario: Check Facebook Link Is Active & Redirect To The Page
    When I check Facebook link is active
    And I verify the link redirect to Facebook page
