Feature: User Login Mechanism
  In order to get all membership benefit from multicart ecommerce 
  As a User I want to perform a online login


	Background: Langing on MCT Home Page 
    Given I open browser chrome
    And I land on multicart landing page

@mcttest
  Scenario: Successfull login
    When I complete login with James valid credentails
    Then I expect to seee profile Name as James Williams
@mcttest    
   Scenario: Login with blanc password
   		 When I complete login with James No Password credentails
   		 Then I expect to seee no password error text
  @mcttest 		 
   Scenario: Login with blanc id
   		 When I complete login with James No Id credentails
   		 Then I expect to seee enter user Name error text
   		
    