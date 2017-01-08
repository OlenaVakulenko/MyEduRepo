$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "LoginPage",
  "description": "",
  "id": "loginpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPage"
    }
  ]
});
formatter.before({
  "duration": 28948129180,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "001 Social authorization blocks are present on a login page",
  "description": "",
  "id": "loginpage;001-social-authorization-blocks-are-present-on-a-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I click on LoginButton in header",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I see google and facebook authorization block on a login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepdefs.iClickOnLoginButtonInHeader()"
});
formatter.result({
  "duration": 523464570,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepdefs.iSeeGoogleAndFacebookAuthorizationBlockOnALoginPage()"
});
formatter.result({
  "duration": 1050890124,
  "status": "passed"
});
formatter.after({
  "duration": 2361958814,
  "status": "passed"
});
formatter.uri("QuestionPage.feature");
formatter.feature({
  "line": 3,
  "name": "QuestionPage",
  "description": "",
  "id": "questionpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@QuestionPage"
    }
  ]
});
formatter.before({
  "duration": 22173844846,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "001 Top questions are asked today",
  "description": "",
  "id": "questionpage;001-top-questions-are-asked-today",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I click on a top question from the start page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Date of issue on the question page is \"today\"",
  "keyword": "Then "
});
formatter.match({
  "location": "QuestionPageStepdefs.iClickOnATopQuestionFromTheStartPage()"
});
formatter.result({
  "duration": 294099234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "today",
      "offset": 39
    }
  ],
  "location": "QuestionPageStepdefs.dateOfIssueOnTheQuestionPageIs(String)"
});
formatter.result({
  "duration": 3165993579,
  "status": "passed"
});
formatter.after({
  "duration": 2489680173,
  "status": "passed"
});
formatter.uri("StartPage.feature");
formatter.feature({
  "line": 3,
  "name": "StartPage",
  "description": "",
  "id": "startpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@StartPage"
    }
  ]
});
formatter.before({
  "duration": 22064245260,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "001 Number of featured questions is greater than 300",
  "description": "",
  "id": "startpage;001-number-of-featured-questions-is-greater-than-300",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on a start page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Number of featured questions is greater than 300",
  "keyword": "Then "
});
formatter.match({
  "location": "StartPageStepdefs.iAmOnAStartPage()"
});
formatter.result({
  "duration": 27939,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "300",
      "offset": 45
    }
  ],
  "location": "StartPageStepdefs.numberOfFeaturedQuestionsIsGreaterThan(int)"
});
formatter.result({
  "duration": 130857305,
  "status": "passed"
});
formatter.after({
  "duration": 1762301031,
  "status": "passed"
});
formatter.before({
  "duration": 22074348137,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "002 Max salary in advertisement block is greater than 60k",
  "description": "",
  "id": "startpage;002-max-salary-in-advertisement-block-is-greater-than-60k",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on a start page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Max salary in advertisement block is greater than 60k",
  "keyword": "Then "
});
formatter.match({
  "location": "StartPageStepdefs.iAmOnAStartPage()"
});
formatter.result({
  "duration": 30789,
  "status": "passed"
});
formatter.match({
  "location": "StartPageStepdefs.maxSalaryInAdvertisementBlockIsGreaterThanK()"
});
formatter.result({
  "duration": 105023956,
  "status": "passed"
});
formatter.after({
  "duration": 1444446725,
  "status": "passed"
});
formatter.uri("UsersListPage.feature");
formatter.feature({
  "line": 3,
  "name": "UsersListPage",
  "description": "",
  "id": "userslistpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UsersListPage"
    }
  ]
});
formatter.before({
  "duration": 21399254900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "When I search for \"bot\" on a user Users tab all search results contain string \"bot\"",
  "description": "",
  "id": "userslistpage;when-i-search-for-\"bot\"-on-a-user-users-tab-all-search-results-contain-string-\"bot\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I click on a Users tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"bot\" to search input on a users tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "all search results contain string \"bot\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UsersListPageStepdefs.iClickOnAUsersTab()"
});
formatter.result({
  "duration": 343924277,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bot",
      "offset": 9
    }
  ],
  "location": "UsersListPageStepdefs.iEnterToSearchInputOnAUsersTab(String)"
});
formatter.result({
  "duration": 6509936671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bot",
      "offset": 35
    }
  ],
  "location": "UsersListPageStepdefs.allSearchResultsContainString(String)"
});
formatter.result({
  "duration": 930458412,
  "status": "passed"
});
formatter.after({
  "duration": 2236949763,
  "status": "passed"
});
});;