Feature: Validate Footer links

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page

 @mcttest
  Scenario: User validates footer links
    And I scroll to bottom of page
    Then I see all avaiable first column footer links
		Then I see all available second column footer link
    