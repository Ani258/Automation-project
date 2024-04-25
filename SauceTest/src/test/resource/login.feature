Feature: Login with valid & invalid inputs

Scenario Outline: Login page with <username> & <password>
    Given user should enter login credentials<username> and <password>
    Then user should submit login button
    

Examples: 
      | username      | password     | 
      | name1         | standard    | 
      | standard_user | secret_sauce |
      | standard_user |     -     | 