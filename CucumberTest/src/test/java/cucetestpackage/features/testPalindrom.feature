@Palindrom

  Feature: Palindrom

    Scenario: 001 When I reverse string I get string written backwards
      Given I reverse string "abcdef"
      Then Reversed string is "fedcba"

    Scenario Outline: 002 Check if the Word is Palindrom
      Given I check string with value "<string>"
      Then I get the result "<result>"
      Examples:
        | string | result |
        | pop    | True  |
        | Level  | True  |
        | moon   | False |

     Scenario Outline: 003 Check if the Phrese is Palindrom
       Given I check phrase with value "<phrase>"
       Then I get the output "<output>"
       Examples:
         | phrase                      | output |
         | A man a plan a canal Panama | True   |
         | Man a plan a canal Panama   | False  |
