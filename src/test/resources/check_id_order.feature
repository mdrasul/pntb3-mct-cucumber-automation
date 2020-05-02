Feature: CHeck ID existence 
I want to  check IF ID orders differents ID exists

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complete login with James valid credentails
    And I navigate to order page
 @WIP
 @mcttest
Scenario Outline: validate Search feature
When I make a search by orderId  
Then I enter  "<ID>" in text box
Then I check existence of the "<ID>" in History order and click on it 
Then I see all the availaible options on check order  
      | Order Number         |
      | Order Date           |
      | Order Total          |
      | Order Status         |
           
Then  back to my order 
#Then go back to my account     
   Examples: 
        |ID |
        |65 |
        |54 |
@WIP      
@mcttest
#Scenario Outline: Check Non existence of the Id 
Scenario: Check Non existence of the Id 
When I make a search by orderId  
Then I enter  "04" in text box
Then I check  non existence of the "04" in History order 
Then go back to my account   
