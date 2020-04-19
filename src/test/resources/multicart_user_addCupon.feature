Feature: Add cupon for buyer
  I want to add cupon for the buyer

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    When I select seller dashboard

  @Hip
  Scenario: Adding cupon to the cupon option
    Then I expect to land on seller page and click on Coupon Codes
    And I should be able to add coppon
