Feature: User MyCatlog create post
  i want to post a new accessory

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    Given I navigate to  account page
    When I select seller dashbosrd
    Then i expect to see Buyer dashBoard link
    Given i click on my catalog and navigate to catalog page
    Then i expect to see catalog existing categories

  @mcttest
  Scenario: user should see all dash board page options
    When I see catalog i click on Accessories link
    Then i fill out accessories new product page one
    And I Expect to see variants page link on page two
    Then I select proceed and land on varient details
    When I land on varient details I must fill out shipping  detail and item photo and add product
@mcttest
  Scenario: Casual shirts accessories
  When i see catalog i click on caual shirts link
  Then I fill out Casual shirts new product page one
  And i Expect to see product under this category header on page two
  Then i select proceed and land on varient details
  When i land on Varient details i fill out shipping details