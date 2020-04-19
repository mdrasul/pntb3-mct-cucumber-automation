Feature: User MyCatalog Create post
  I want post a new accessories

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails

  
  Scenario: User should see all dashboard page options
    When I select seller dashboard
    Then I expect to land on seller page and click on "MyCatalog"
    And I slould be able click on "Accessories"
    And I should be able to List items
