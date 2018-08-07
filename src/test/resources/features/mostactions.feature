@mobile-regression @mobile-mostactions

Feature: Verify Home Page Features

  @mobile-mostactions-1
  Scenario: User should be able filter options
    Given I am on home page of the app
    When I click on filter button
    And I disable "Angular" option
    And I click on All Reset Filer button
    Then I verify all options are enabled

  @mobile-mostactions-2
  Scenario: Verify user should be able to view default main menu bar items
    Given I am on home page of the app
    When I click on hamburger menu
    Then I verify default main menu bar fields

  @mobile-mostactions-3
  Scenario: Verify user should be able to search for event
    Given I am on a splash page of the app
    When I click on Skip button on splash screen
    When Search for "Breakfast"
    Then I verify Event displayed with header, Duration, description





