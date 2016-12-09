@Square
Feature: Square

  Scenario: 001 The area of a square is side^2
    Given I create Square with side 9 and coordinates 0,0
    Then Area of Square equals 81

  Scenario: 002 When I move the Square it changes coordinates by certain step
    Given I create Square with side 9 and coordinates 0,0
    When I move Square by 1,2
    Then New Square coordinates are 1,2

  Scenario: 003 When I resize Square its side changes by coefficient
    Given I create Square with side 9 and coordinates 0,0
    When I resize square by coefficient 0.5
    Then Side equals 4.5

  Scenario: 004 Square is instance of Figure
    Given I create Square with side 9 and coordinates 0,0
    Then Square is instance of Figure