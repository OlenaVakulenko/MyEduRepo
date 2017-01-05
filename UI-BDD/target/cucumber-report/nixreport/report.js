$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CartPageTest.feature");
formatter.feature({
  "line": 2,
  "name": "CartPage",
  "description": "",
  "id": "cartpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CartPage"
    }
  ]
});
formatter.before({
  "duration": 32568362368,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "001 When I add products to cart they appear in cart with correct price",
  "description": "",
  "id": "cartpage;001-when-i-add-products-to-cart-they-appear-in-cart-with-correct-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I add product1 to cart",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I add product2 to cart",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I see titles of these products in the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Total price equals to product1 price plus product2 price",
  "keyword": "And "
});
formatter.match({
  "location": "CartPageStepdefs.iAddProduct1ToCart()"
});
formatter.result({
  "duration": 18853250560,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStepdefs.iAddProduct2ToCart()"
});
formatter.result({
  "duration": 18180305576,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStepdefs.iSeeTitlesOfTheseProductsInTheCart()"
});
formatter.result({
  "duration": 3769564055,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStepdefs.totalPriceEqualsToProductPriceProductPrice()"
});
formatter.result({
  "duration": 408944350,
  "status": "passed"
});
formatter.after({
  "duration": 4478075589,
  "status": "passed"
});
formatter.before({
  "duration": 22176751715,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "002 When I delete product from cart it disappears from cart",
  "description": "",
  "id": "cartpage;002-when-i-delete-product-from-cart-it-disappears-from-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I add product1 to cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I add product2 to cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I add product3 to cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I delete third product from cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "This product is not present in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "CartPageStepdefs.iAddProduct1ToCart()"
});
formatter.result({
  "duration": 15072587032,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStepdefs.iAddProduct2ToCart()"
});
formatter.result({
  "duration": 15758551817,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStepdefs.iAddProduct3ToCart()"
});
formatter.result({
  "duration": 13495461173,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStepdefs.iDeleteThirdProductFromCart()"
});
formatter.result({
  "duration": 5246685752,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStepdefs.thisProductIsNotPresentInTheCart()"
});
formatter.result({
  "duration": 2044113949,
  "status": "passed"
});
formatter.after({
  "duration": 1928578393,
  "status": "passed"
});
formatter.uri("LoginTest.feature");
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
  "duration": 21951859519,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "001 When I login with certain credentials I see username in header",
  "description": "",
  "id": "loginpage;001-when-i-login-with-certain-credentials-i-see-username-in-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I go to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I set email to \"lena-test-01@ya.ru\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I set password to \"gfhjkm13\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click LoginButton",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see username \"olena\" in page header",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepdefs.iGoToLoginPage()"
});
formatter.result({
  "duration": 794779764,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lena-test-01@ya.ru",
      "offset": 16
    }
  ],
  "location": "LoginPageStepdefs.iSetEmailTo(String)"
});
formatter.result({
  "duration": 4573162617,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gfhjkm13",
      "offset": 19
    }
  ],
  "location": "LoginPageStepdefs.iSetPasswordTo(String)"
});
formatter.result({
  "duration": 409670745,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepdefs.iClickLoginButton()"
});
formatter.result({
  "duration": 3962940177,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "olena",
      "offset": 16
    }
  ],
  "location": "LoginPageStepdefs.iSeeUsernameInPageHeader(String)"
});
formatter.result({
  "duration": 806097041,
  "status": "passed"
});
formatter.after({
  "duration": 2281619986,
  "status": "passed"
});
formatter.uri("SearchResultsPageTest.feature");
formatter.feature({
  "line": 2,
  "name": "SearchResultsPage",
  "description": "",
  "id": "searchresultspage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SearchResultsPage"
    }
  ]
});
formatter.before({
  "duration": 17186306601,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "001 If I enter \"duck\" to search input all results on Search Results page contain \"duck\"",
  "description": "",
  "id": "searchresultspage;001-if-i-enter-\"duck\"-to-search-input-all-results-on-search-results-page-contain-\"duck\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I enter \"duck\" to search input",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "All search results contain query \"duck\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "duck",
      "offset": 9
    }
  ],
  "location": "SearchResultsPageStepdefs.iEnterSmtToSearchInput(String)"
});
formatter.result({
  "duration": 1093939849,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepdefs.iClickSearchButton()"
});
formatter.result({
  "duration": 7487815210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "duck",
      "offset": 34
    }
  ],
  "location": "SearchResultsPageStepdefs.allSearchResultsContainQuery(String)"
});
formatter.result({
  "duration": 207754066,
  "error_message": "java.lang.AssertionError: Search result cloudnine kid backpack animal design does not contain duck\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat amazone.stepdefinitions.SearchResultsPageStepdefs.allSearchResultsContainQuery(SearchResultsPageStepdefs.java:54)\r\n\tat ✽.Then All search results contain query \"duck\"(SearchResultsPageTest.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1832792908,
  "status": "passed"
});
formatter.before({
  "duration": 17190750496,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "002 Number of search results in subcategory is less than number of search results in general search",
  "description": "",
  "id": "searchresultspage;002-number-of-search-results-in-subcategory-is-less-than-number-of-search-results-in-general-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I enter \"duck\" to search input",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on BabyProducts subcategory",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Number of search results in subcategory is less than number of search results in general search",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "duck",
      "offset": 9
    }
  ],
  "location": "SearchResultsPageStepdefs.iEnterSmtToSearchInput(String)"
});
formatter.result({
  "duration": 934804065,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepdefs.iClickSearchButton()"
});
formatter.result({
  "duration": 4930202233,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepdefs.iClickOnBabyProductsSubcategory()"
});
formatter.result({
  "duration": 6590153073,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepdefs.numberOfSearchResultsInSubcategoryIsLessThanNumberOfSearchResultsInGeneralSearch()"
});
formatter.result({
  "duration": 64429,
  "status": "passed"
});
formatter.after({
  "duration": 1577541512,
  "status": "passed"
});
});