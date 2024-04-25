Feature: Sauce lab

Scenario: Check Leader is successfully login or not

 Given User should be able to enter the url of the website
 When User should be able to enter the username
 And User should be able to enter the password
 And User should be able to login to Swag labs home page successfully
 And User should be able to add 3rd product to the cart
 And User should be displayed with cart page
 And User should be able to view the selected item in the cart and price must be same as it is displaye in home page 
 And User should be able to click on Continue shopping button
 Then User should be navigated back to Home Page