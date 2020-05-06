Feature: Validate Favorite Product Page
  As a User I want to validate My Favorite Products Page after pressing Add to Favorites button for a product

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails

  @mctfav
  Scenario: Favorite Products Page Header Check
    When I click on shop now and click on digital
    And I validate the items
