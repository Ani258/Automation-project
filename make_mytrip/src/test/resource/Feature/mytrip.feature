
Feature: To check the annotation in cucumber
  

@regression
Scenario: Annotation in cucumber BDD
    Given user is logged in
    When user clicks on ‘Add to Cart’ button
    Then product is displayed in the cart
   

@smoke
Scenario Outline: To check the user is logged in 
    Given I want to check the username with <name>
    Then I check for the password with <value> 
     

Examples: 
      | name          | value | 
      | standard_user | secret_sauce | 
      | locked_out_user| secret_sauce | 
