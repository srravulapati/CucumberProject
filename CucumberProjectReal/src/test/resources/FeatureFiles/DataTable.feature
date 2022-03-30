Feature: Test the login functionality of Orange HRM using DataTable

Scenario: Test the valid login using DataTable
Given user is in login page
When user enters the credentials using DataTable
|admin|admin123|
And user click on signIn button
Then user should login successfully

