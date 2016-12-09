@Snail
Feature: Snail

      Scenario: 002 Position of Max element in Matrix with odd size
        Given I start program Snail
        When I create matrix with side value 5
        Then current position of maximum element is 0,4

      Scenario: 003 Position of Max element in Matrix with even size
        Given I start program Snail
        When I create matrix with side value 4
        Then current position of maximum element is 3,0

      Scenario: 004 Snail returns Martix with particular size
        Given I start program Snail
        When I create matrix with size 3
        Then program returns Matrix with size 3

@SnailSpecial
      Scenario: 001 Max element in Matrix
        Given I create matrix with side value 5
        Then current maximum element is 25