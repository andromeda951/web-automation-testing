Feature: Login

  Scenario: User can login with valid credential
    Given user launch the app
    When user input registered user
    And user input registered password
    And user tap login button
    Then user redirected to inventory page

  Scenario: User can't login with invalid credential
    Given user launch the app
    When user input unregistered user
    And user input registered password
    And user tap login button
    Then user failed to login and system show message "Epic sadface: Username and password do not match any user in this service"
