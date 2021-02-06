Feature: User should be able to perform operations

  Scenario: User should be able to perform add operations
    Given user has access to calculator
    When add 5 and 6
    Then verify addition of two numbers in calculator is 11

  Scenario: User should be able to perform substract operations
    Given user has access to calculator
    When substract 7 and 2
    Then verify addition of two numbers in calculator is 5