Feature: User Purchase Mechanism
  As a User I want to perform checkout activity
    So I can see my items for checking out 
    
@WIP
  Scenario: Purchasing Items
   Given I open browser chrome
    And I land on multicart landing page
    When I select more now
    Then I click on shoe
    And I checkout as a guest
   