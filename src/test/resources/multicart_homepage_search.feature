Feature: Searching Item in Home page
 

	Background: Langing on MCT Home Page 
    Given I open browser chrome
    And I land on multicart landing page

    @wip
  Scenario: Successfull Saerch on Home page
  And I complete search with Cream Laber Bag
  Then I expect search result contains Cream Laber Bag