@regression
Feature: user should be able to hover different categories and select any of them
Background:
  Given browser is opened and navigated to home page
  Scenario: unauthenticated user hover all categories then select computers
    Then user hover all categories
    And click on all menu items

  Scenario: newly registered user hover all categories then select computers
    When user click on register button from header menu
    And fill registration form with "mahmoud" "ali" "mahmoud@al1.com" "123456" "123456"
    And click REGISTER then click continue
    Then user hover all categories
    And click on all menu items

  Scenario: authenticated user hover all categories then select computers
    When user click on login button from header menu
    And fill login form with "mahmoud@al1.com" "123456"
    And  click Login
    Then user hover all categories
    And click on all menu items
