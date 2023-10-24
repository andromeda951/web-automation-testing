Feature: Checkout

  Scenario: User successfully checkout step one
    Given list product of standard_user
    When user click "Add to cart" button in inventory page
    And user click cart icon
    And user click checkout button
    And user input first name
    And user input last name
    And user input postal code
    And user click continue button
    Then user redirected to Checkout: Overview page

  Scenario: User failed checkout step one
    Given list product of standard_user
    When user click "Add to cart" button in inventory page
    And user click cart icon
    And user click checkout button
    And user input first name
    And user input postal code
    And user click continue button
    Then system show message "Error: Last Name is required"

