@UI
Feature: As a new user I want to be able to register successfully


  Scenario:   Scenario: Successful register with correct credentials
    Given I go to the SuT home page
    When I click on the homepage Register button
    And I check Mrs.
    And I enter First name "Yoana"
    And I enter Sir name "Stefanova"
    And I enter email "yoana.stefanova@endavaaaaa.com"
    And I enter registration password "pass123"
    And I enter country "Bulgaria"
    And I enter city "Sofia"
    And I check the agreement checkbox
    And I click on the Register button
    Then I should see that I am successfully registered and logged in
