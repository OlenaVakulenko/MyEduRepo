@Matrix
Feature: Matrix

    Scenario: 001 When I create Matrix the program returns object Matrix
      Given I start program Matrix
      When I create matrix with size 5
      Then I returns Matrix

    Scenario: 003 Input Validation
      Given I start program Matrix
      When I validate string "j"
      Then Validation doesn't pass

    Scenario Outline: 002 When I create Matrix I receive Matrix of certain Pattern
      Given I start program Matrix
      When I create matrix with size 5
      Then I see on return matrix in row <row> and position <column> with value <item>
      Examples:
        | row | column | item |
        | 0   | 0      | 1    |
        | 0   | 1      | 2    |
        | 0   | 2      | 3    |
        | 0   | 3      | 4    |
        | 0   | 4      | 5    |
        | 1   | 0      | 6    |
        | 1   | 1      | 7    |
        | 1   | 2      | 8    |
        | 1   | 3      | 9    |
        | 1   | 4      | 1    |
        | 2   | 0      | 2    |
        | 2   | 1      | 3    |
        | 2   | 2      | 4    |
        | 2   | 3      | 5    |
        | 2   | 4      | 6    |
        | 3   | 0      | 7    |
        | 3   | 1      | 8    |
        | 3   | 2      | 9    |
        | 3   | 3      | 1    |
        | 3   | 4      | 2    |
        | 4   | 0      | 3    |
        | 4   | 1      | 4    |
        | 4   | 2      | 5    |
        | 4   | 3      | 6    |
        | 4   | 4      | 7    |




