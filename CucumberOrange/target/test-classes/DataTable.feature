Feature: Testing the adactin Webpage

  Scenario: validating the login page and home page
    Given user should be in the login page with credentials
    When user is entering username and password
      |  username  | password|
      |  vigneshRN  | rammy |
      | vigneshR  | surabhi |
      | vignesh   | fathima |
    And clicking login button
    Then verifying the success message
