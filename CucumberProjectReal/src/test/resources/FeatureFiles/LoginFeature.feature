Feature: Test the login functionality of Orange HRM

Scenario: Test the valid login details for user 1
Given user is in login page
When user enters the valid username and password
And user click on signIn button
Then user should login successfully

Scenario: Test the valid login details for user2
Given user is in login page
When user enters the valid username and password
And user click on signIn button
Then user should login successfully