Feature: Multiple data test

  Scenario Outline: TC01: validate Coverfox Health  Insurance for single Person
    Given I am on homepage
    When I click on getStarted button
    And I click on Next button
    And I provide age as "<age>",click on Next button
    And I provide pincode as "<pincode>",MobNum as "<mobnum>"and click on continue button
    Then matching Health Insurance Plans should be displayed as "<result>"

    Examples:
      | age | pincode | mobnum     | result |
      | 26  | 411234  | 2413423424 | 70     |
      | 32  | 434561  | 3423435455 | 60     |
      | 50  | 235355  | 3545455645 | 34     |
