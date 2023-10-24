Feature: Remove Products from Shopping Cart

  Scenario: Remove Products from Shopping Cart Using standard_user
    Given list product of standard_user
    When user click "Add to cart" button in inventory page
    And user click Remove button
    Then icon cart not showing number

  Scenario: Remove Products from Shopping Cart Using problem_user
    Given list product of problem_user
    When user click "Add to cart" button in inventory page
    And user click Remove button
    Then icon cart showing number