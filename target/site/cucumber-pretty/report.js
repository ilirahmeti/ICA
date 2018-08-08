$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky.feature");
formatter.feature({
  "line": 3,
  "name": "HomePage verifications",
  "description": "",
  "id": "homepage-verifications",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@Darksky"
    },
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 4135201978,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Given I am on Darksky home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "Verify timline is displayed in correct format",
  "description": "",
  "id": "homepage-verifications;verify-timline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Darksky-1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.timelieneDisplaysTwoHoursIncrement()"
});
formatter.result({
  "duration": 517291396,
  "status": "passed"
});
formatter.after({
  "duration": 3201439134,
  "status": "passed"
});
formatter.before({
  "duration": 2350391888,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Given I am on Darksky home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 12,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "homepage-verifications;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Darksky-2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I expand todays timeline",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.iExpandTodaysTimeline()"
});
formatter.result({
  "duration": 466644114,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.verifyTemp()"
});
formatter.result({
  "duration": 347121449,
  "status": "passed"
});
formatter.after({
  "duration": 3197921389,
  "status": "passed"
});
formatter.before({
  "duration": 2243421539,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Given I am on Darksky home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Time Machine Calendar",
  "description": "",
  "id": "homepage-verifications;verify-time-machine-calendar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Darksky-3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I click on Time Machine",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I verify date is selected to todays date",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.iclickOnTimeMachine()"
});
formatter.result({
  "duration": 475567631,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.verifyTodayDateIsSelected()"
});
formatter.result({
  "duration": 109185609,
  "status": "passed"
});
formatter.after({
  "duration": 3147720113,
  "status": "passed"
});
});