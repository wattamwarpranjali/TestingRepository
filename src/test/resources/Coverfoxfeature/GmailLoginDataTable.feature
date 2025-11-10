Feature: Study datatable in BDD

  Scenario: Test Gmail Login
    Given I am on Login page
    When I provide details and click on login button
      | username | password  | msg              |
      | test123  | login12   | login successful |
      | test234  | login1234 | welcome          |
    Then i should navigate to inbox
