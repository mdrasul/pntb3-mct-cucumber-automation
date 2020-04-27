Feature: User MyCatlog create post
  i want to post a new accessory

 
	Background: Langing on MCT Home Page 
    Given I open browser chrome
    And I land on multicart landing page
    When I complete login with James valid credentails

  @hip
  Scenario: user should see all dash board page options
    Given I navigate to  account page
    When I select seller dashbosrd
     Given i click on my catalog and navigate to catalog page
    When I see catalog i click on Accessories link
    Then i fill out accessories new product page one
    Then I select proceed and land on varient details
    When I land on varient details I must fill out shipping  detail and item photo and add product
