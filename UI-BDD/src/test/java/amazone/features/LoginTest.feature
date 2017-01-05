@LoginPage
Feature: LoginPage

  Scenario: 001 When I login with certain credentials I see username in header
    When I go to login page
    And I set email to "lena-test-01@ya.ru"
    And I set password to "gfhjkm13"
    And I click LoginButton
    Then I see username "olena" in page header