@QuestionPage

  Feature: QuestionPage
    Scenario: 001 Top questions are asked today
      When I click on a top question from the start page
      Then Date of issue on the question page is "today"