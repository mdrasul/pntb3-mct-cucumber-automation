Feature: Searching Item in Home page 


	Background: Langing on MCT Home Page 
    Given I open browser chrome
    And I land on multicart landing page
    
   @wip
  Scenario: Successfull Search on home page 
  And I complete search with Black Kajal
  Then I expect search result contains black kajal 
    