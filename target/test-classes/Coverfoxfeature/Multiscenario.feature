Feature: CoverFox Heath Insurance test

  Background:
    Given I am on homepage
    Given I login to application
   @regression
  Scenario: TC01: validate Coverfox Health  Insurance for single Person
    When I click on getStarted button
    And I click on Next button
    And I provide age as "34",click on Next button
    And I provide pincode as "411046",MobNum as "8888888888"and click on continue button
    Then matching Health Insurance Plans should be displayed as "48"

  Scenario: TC02: validate Coverfox car  Insurance
    When I click on car insurance tab
    And I provide Vehicle number,click on view quotes button
    And I provide valid details and click on view quotes button
    Then I should get plan details

	@regression
  Scenario: TC03:validate coverfox bike insurance details
    When I click on bike insurance button
    And I provide Vehicle number,click on view quotes button
    And I provide valid details and click on view quotes button
    Then I should get plan details
