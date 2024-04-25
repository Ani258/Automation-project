Feature: To check login functionality

Scenario: Check login is successful with valid credentials

Given user is on home page
When user click on login/sign up popup 
And user enter mobile number 
And click on arrow button 
And After entering OTP click on arrow button
And user enters first name and last name and dateofbirth and gender and email and refferal code
Then user click on submit button

