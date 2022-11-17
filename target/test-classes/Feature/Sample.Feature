Feature: Testing the adactin Webpage
Scenario Outline: validating the login page and home page
Given user should be in the login page with credentials
When user is entering the "<username>" and "<password>"
And clicking login button
Then verifying the success message

Examples: 
| username  | password |
| vigneshRN | password |

Scenario Outline: Verifying the search hotel page 
Given user is on the home page of adactin
When user is entering the "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adults>","<children>"
And user is clicking the search button	
And user is clicking continue in the next page
Examples:
| location  | hotels | roomtype  | noofrooms | checkin  | checkout | adults  | children |
| Sydney | Hotel Creek | Deluxe | 2 | 09/09/2022 | 10/09/2022 | 3 | 1 |
