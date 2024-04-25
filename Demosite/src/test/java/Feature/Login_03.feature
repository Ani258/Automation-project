
Feature: Remove Product from the cart
  
Scenario: Check Leader is successfully login or not

 Given User should be able to lauch the saucelab demosite
 When User should enters the username
 And User should enters the password
 And User should be able to login the home page 
 And User should add 3rd product to the cart
 And User should add 1st product to the cart
 And User navigates to cart page
 And User should be able to view the selected item in the cart 
 And User should be able to click on remove button of 2nd product from the cart
 Then User should be able to remove 2nd item from the cart
