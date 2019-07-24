Feature: Test Me Parameterization

Scenario Outline: Test Me login for multiple users

Given I am launching the test me application in chrome
And I click on SignIn link
When I provide username "<Uname>"
And I provide password  "<Pswrd>"
Then I click on login and verify the login status

Examples:  
           | Uname      | pswrd          |
           |Srinivas    | Password23112  |
           |Niranjan    | Password21323  |
           |Shenthan    | Password23144  |