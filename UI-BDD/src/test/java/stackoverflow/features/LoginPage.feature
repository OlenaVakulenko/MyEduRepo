@LoginPage
  Feature: LoginPage
    Scenario: 001 Social authorization blocks are present on a login page
      When I click on LoginButton in header
      Then I see google and facebook authorization block on a login page