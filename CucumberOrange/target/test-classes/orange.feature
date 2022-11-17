Feature: Testing the orange Webpage




Scenario Outline: validating the login page and home page
Given user should be in the login page with valid credentials
When user is entering "<username>" and "<password>"
And clicking login button
Then verifying the success message


Examples:
|username|password|
| vigneshRN | password |



Scenario Outline: validating the login page and home page
Given user should be in the login page with invalidcredentials
When user is entering "<username>" and "<password>"
And clicking login button
Then verifying the error message

Examples:
|username|password|
|Admin123|admin123|
