Feature: Validate my favorite sellers
Checking if my favorite sellers tab works and if theres any of them available

  Background: Landing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    When I navigate to my Account page

  Scenario: To see if there are any favorite sellers available
    Then I navigate to my favorite sellers tab
    Then I validate if there are any favorite sellers present
