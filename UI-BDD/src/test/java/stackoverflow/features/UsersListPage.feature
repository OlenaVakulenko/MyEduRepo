@UsersListPage

  Feature: UsersListPage

    Scenario: When I search for "bot" on a user Users tab all search results contain string "bot"
      When I click on a Users tab
      And I enter "bot" to search input on a users tab
      Then all search results contain string "bot"

