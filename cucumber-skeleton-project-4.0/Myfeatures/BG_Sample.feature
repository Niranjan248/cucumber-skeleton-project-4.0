Feature: My Standard Charted bank account

Background: Launching of he bank Landing page
Given Niranjan has done with browser configuration
Then He launches the application in his favourite chrome browser

Scenario: Sign in for Niranjan
Given He clicks on signin link
Then He provides all the manditory data
And He clicks on submit buton


Scenario: Sign Up for the guest user
Given He clicks on signin link
When He provide all the manditory data
Then He clicks on the submit and Id is generated

Scenario: Niranjan needs to reset the password
Given He clicks on the forgot password link
Then He enters the mobile number
And he receives otp and the same he provides
Then He is able to reset his password