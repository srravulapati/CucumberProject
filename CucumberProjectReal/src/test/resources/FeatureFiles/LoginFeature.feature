Feature: Test the login functionality of Orange HRM

Scenario: Test the valid login details for user 1
Given user is in login page
When user enters the username and password
And user click on signIn button
Then user should login successfully

Scenario: Test the valid login details for user 1
Given user is in login page
When user enters the "admin" and "admin123"
And user click on signIn button
Then user should login successfully

Scenario: Test the valid login details for user 1
Given user is in login page
When user enters the <username> and <password>
And user click on signIn button
Then user should login successfully

Examples:
|username|password|
|admin|admin123|
|admin1|admin1234|