Feature: To check Login Functionality

Scenario Outline: Check login is successful with valid credentials

Given user is on login page
When user enters <username> and <password>
And click on Login button
Then user should navigate home page
