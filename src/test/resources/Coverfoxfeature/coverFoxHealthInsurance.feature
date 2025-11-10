Feature: CoverFox Heath Insurance test
	
	@retest
  Scenario: TC01: validate Coverfox Health  Insurance for single Person
    Given I am on homepage
    When I click on getStarted button
    And I click on Next button
    And I provide age as "34",click on Next button
    And I provide pincode as "411046",MobNum as "8888888888"and click on continue button
    Then matching Health Insurance Plans should be displayed as "48"

    
    Scenario: TC02: validate Coverfox address detail page error msg
    Given I am on homepage
    When I click on getStarted button
    And I click on Next button
    And I provide age as "34",click on Next button
    And I click on continue button
    Then Validate error msg