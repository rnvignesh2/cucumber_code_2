Feature: testing the login page of Adactin

Scenario: testing the login page with valid and invalid credentials
Given user should be in the loginpage with username and password box displayed
When user should enter the username and password.
|Admin123|admin|
|Admin|admin123|
|Admin1234|admin|
And user should click the login button
Then verifying whether successful login or failed login.

