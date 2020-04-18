Feature: User My Account Activities
  As a User I want to check all my accounts realtd options
  SO i can perform all activities

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails

  #Scenario: User Sees individual account option
  #When I navigate to my Account page
  #Then I see options "My Orders" available
  #Then I see options "Profile" available
  #Then I see options "My Return Requests" available
  #Then I see options "Change Password" available
 
 @wip 
 @mcttest
  Scenario: User Sees all Account Options
    When I navigate to my Account page
    Then I see all aviable options below
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password-X-   |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
