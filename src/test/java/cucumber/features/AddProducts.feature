Feature: Add Products to Shopping Cart

  Scenario: Adding Products to the Shopping Cart Using standard_user
    Given list product of standard_user
    When user click product
    And user click "Add to cart" button
    Then icon cart showing number

  Scenario: Adding Products to the Shopping Cart Using problem_user
    Given list product of problem_user
    When user click product
    And user click "Add to cart" button
    Then icon cart not showing number
