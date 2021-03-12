Feature: BornoPoricoi Learning Steps

  Background:
    Given I am on the home mobile view
    Then I click on borno poricoi category


  Scenario: I want to navigate sorborno features
    Then I click on sorborno item
    Then I click on next button and previous button
    And I close the sorborno poricoi


  Scenario: I want to navigate banjon borno features
    Then I click on benjonborno item
    Then I navigate next and previous screen
    And I close the banjon borno screen

    Scenario: I want to navigate likhoni sorborno features

      Then I click on likhoni item
      Then I click on sorborno text item
      Then I have perform sorborno board writting task
      And I close the sorborno likhoni



  Scenario: I want to navigate likhoni banjon borno features

    Then I click on likhoni item
    Then I click on banjon borno text item
    Then I have perform banjon borno board writing
    And I close the banjon borno likhoni




