$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mostactions.feature");
formatter.feature({
  "line": 3,
  "name": "Verify Home Page Features",
  "description": "",
  "id": "verify-home-page-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mobile-regression"
    },
    {
      "line": 1,
      "name": "@mobile-mostactions"
    },
    {
      "line": 1,
      "name": "@mobile"
    }
  ]
});
formatter.scenario({
  "line": 20,
  "name": "Verify user should be able to search for event",
  "description": "",
  "id": "verify-home-page-features;verify-user-should-be-able-to-search-for-event",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@mobile-mostactions-3"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am on a splash page of the app",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on Skip button on splash screen",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Search for \"Breakfast\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I verify Event displayed with header, Duration, description",
  "keyword": "Then "
});
formatter.match({
  "location": "MostActionsSD.iAmOnsplashPage()"
});
formatter.result({
  "duration": 20154413357,
  "status": "passed"
});
formatter.match({
  "location": "MostActionsSD.clickOnSkip()"
});
formatter.result({
  "duration": 115348657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Breakfast",
      "offset": 12
    }
  ],
  "location": "MostActionsSD.searchForBreakfast(String)"
});
formatter.result({
  "duration": 2292341588,
  "status": "passed"
});
formatter.match({
  "location": "MostActionsSD.iVerifyEventDisplayed()"
});
formatter.result({
  "duration": 574091062,
  "error_message": "java.lang.AssertionError: THE BREAKFAST EVENT VARIFICATION FAILED expected [Breakfast] but found []\n\tat org.testng.Assert.fail(Assert.java:93)\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:134)\n\tat org.testng.Assert.assertEquals(Assert.java:115)\n\tat org.testng.Assert.assertEquals(Assert.java:189)\n\tat stepdefinition.MostActionsSD.iVerifyEventDisplayed(MostActionsSD.java:33)\n\tat ✽.Then I verify Event displayed with header, Duration, description(mostactions.feature:24)\n",
  "status": "failed"
});
});