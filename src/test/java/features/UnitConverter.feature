Feature: I have test UnitConverter Mobile Application

  Scenario: To convert the length of a objects
    When I am on the home page of the application
    Then I click on the navigation drawer icon
    Then I click on the length category
    And I have enter the conversion entry as "Mile"
    And I have enter the conversion entry as "Kilometer"
    Then I have enter the conversion value as "50"
    Then I clear the result
