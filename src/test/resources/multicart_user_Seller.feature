Feature: Looking for some product in search Box
  I want to use this template for my feature file

  Background: Landing on Multicart Home Page
    Given I open browser chrome
    And I land on multicart landing page

  @Manir
  Scenario: Navigate to the seller Page
    When I want to go to Seller login option
    And I want to login as as seller and landing seller Page
    Then I want to check All WebElement available
      | Home                 |
      | My Profile           |
      | My Plans             |
      | My Themes            |
      | My Portfolio         |
      | Change Password      |
      | My Catalog           |
      | My Products          |
      | Combo Products       |
      | Coupon Codes         |
      | Bulk Products Upload |
      | Shipping Settings    |
      | Orders               |
      | Refund Requests      |
      | Email Templates      |
      | Payment History      |
      | Product Reviews      |
      | Mail Admin           |
      | My Messages          |
      | RSS Feeds            |
      | Help                 |
