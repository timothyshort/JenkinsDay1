$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "The SDET Training Page",
  "description": "As a user of the SDET Training application\r\nI should be able to see a welcome message",
  "id": "the-sdet-training-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2953741259,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should see the home page",
  "description": "",
  "id": "the-sdet-training-page;user-should-see-the-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the user navigates to our home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user should see the message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_user_navigates_to_our_home_page()"
});
formatter.result({
  "duration": 1836163731,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.the_user_should_see_the_message()"
});
formatter.result({
  "duration": 76988547,
  "status": "passed"
});
formatter.after({
  "duration": 2605635503,
  "status": "passed"
});
});