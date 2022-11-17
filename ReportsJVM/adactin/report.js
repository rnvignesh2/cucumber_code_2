$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Singa/Downloads/Eclipse/workspace/CucumberSample/src/test/resources/Feature/Sample.Feature");
formatter.feature({
  "name": "Testing the adactin Webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validating the login page and home page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in the login page with credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "user is entering the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicking login button",
  "keyword": "And "
});
formatter.step({
  "name": "verifying the success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "vigneshRN",
        "password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validating the login page and home page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in the login page with credentials",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is entering the \"vigneshRN\" and \"password\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicking login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verifying the success message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Verifying the search hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the home page of adactin",
  "keyword": "Given "
});
formatter.step({
  "name": "user is entering the \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomtype\u003e\",\"\u003cnoofrooms\u003e\",\"\u003ccheckin\u003e\",\"\u003ccheckout\u003e\",\"\u003cadults\u003e\",\"\u003cchildren\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user is clicking the search button",
  "keyword": "And "
});
formatter.step({
  "name": "user is clicking continue in the next page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location",
        "hotels",
        "roomtype",
        "noofrooms",
        "checkin",
        "checkout",
        "adults",
        "children"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Deluxe",
        "2",
        "09/09/2022",
        "10/09/2022",
        "3",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the search hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the home page of adactin",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is entering the \"Sydney\",\"Hotel Creek\",\"Deluxe\",\"2\",\"09/09/2022\",\"10/09/2022\",\"3\",\"1\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is clicking the search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is clicking continue in the next page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});