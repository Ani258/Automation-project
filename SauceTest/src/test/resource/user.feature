Feature: Login with valid & invalid inputs

  Background: User in Login page
    Given User should login and navigate to the home page

  Scenario Outline: Login page with <username> & <password>
    When user enters login credentials<username> and <password>
    Then user clicks login button

    Examples: 
      | username      | password     |
      | name1         | standard     |
      | standard_user | secret_sauce |
      | standard_user | -            |
