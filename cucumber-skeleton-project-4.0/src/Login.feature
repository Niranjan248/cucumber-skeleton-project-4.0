Feature: Login

Rules- 
This Feature id to Test The Login Functionality.

Business Rules-
-user must be registered on TestMe.
-user sholud be logged in.

Background:
Given the user is on loggin page.

Scenario: Testing the login functionality.
When User enters valid credentials
And clicks on login button
Then home page should be displayed.s
