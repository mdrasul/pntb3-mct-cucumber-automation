Feature: Validate checkout feature

  Background: Landing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails

  Scenario: Checkout on accessories page
    Then I navigate to the accesories page
    And I select a product
    Then I click buy now on the product page
    Then I click checkout on my cart