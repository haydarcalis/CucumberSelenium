$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Account.feature");
formatter.feature({
  "name": "Account Type",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Driver user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user logged in as a \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ContactsStepDefs.theUserLoggedInAsA(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigates to \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ContactsStepDefs.the_user_navigates_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The title contains \"Activities\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefinition.theTitleContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});