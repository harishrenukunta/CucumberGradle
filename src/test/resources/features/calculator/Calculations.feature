Feature: User should be able to perform operations

  Scenario: User should be able to perform all operations
    Given user has access to calculator
    When add 5 and 6
    Then verify addition of two numbers in calculator is 11