@StartPage

  Feature: StartPage

    Scenario: 001 Number of featured questions is greater than 300
      Given I am on a start page
      Then  Number of featured questions is greater than 300

    Scenario: 002 Max salary in advertisement block is greater than 60k
      Given I am on a start page
      Then Max salary in advertisement block is greater than 60k

