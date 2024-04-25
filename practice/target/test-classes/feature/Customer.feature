Feature: XYZ bank portal for customer and bank manager 

Scenario: Bank manager login in xyz bank
    Given user should on login page
    When user should navigate to bank manager login page
    And user should add customer details and validate the newly added customer
    And user should select the added customer in open account field and validate it  
    And user should search the customer in customers field
    Then Delete the customer
