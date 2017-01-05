@SearchResultsPage
  Feature: SearchResultsPage
    Scenario: 001 If I enter "duck" to search input all results on Search Results page contain "duck"
      When I enter "duck" to search input
      And I click Search Button
      Then All search results contain query "duck"


     Scenario: 002 Number of search results in subcategory is less than number of search results in general search
       When I enter "duck" to search input
       And I click Search Button
       And I click on BabyProducts subcategory
       Then Number of search results in subcategory is less than number of search results in general search