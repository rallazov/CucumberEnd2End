$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "Validating login page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "Verifying login functionalities with positive test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "User launches \"http://fidelity.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launches(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.LoginSteps.user_launches(LoginSteps.java:38)\n\tat ✽.User launches \"http://fidelity.com\"(file:Features/login.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters Username \"megalodongroupi\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_Username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters password as \"ramin456In\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Get the Title of Page and Close",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.get_the_Title_of_Page_and_Close()"
});
formatter.result({
  "status": "skipped"
});
});