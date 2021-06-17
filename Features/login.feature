@Regression
Feature: Validating login page
@run
  Scenario: Verifying login functionalities with positive test
    Given User launches "http://fidelity.com"
    When User enters Username "megalodongroupi"
    And User enters password as "ramin456In"
    And User clicks on Login button
    Then Get the Title of Page and Close