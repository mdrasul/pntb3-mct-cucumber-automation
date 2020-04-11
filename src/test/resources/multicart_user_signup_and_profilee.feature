Feature: User Sign Up & Profile Management
  As a User I want to check all my accounts realtd options
  SO i can perform all activities

  Background: Langing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page

@mcttest
  Scenario: Successfull Sign Up
    Given I start signUp Process
    When I Complete Registration
    Then I Can navigate to profile page
    And I Can select a Country
    And I can select a state
