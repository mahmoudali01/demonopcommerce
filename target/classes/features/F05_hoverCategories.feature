@regression
Feature: user should be able to hover different categories and select any of them

  Scenario: unauthenticated user hover all categories then select computers
    Then user hover all categories
    And click on all menu items

  Scenario: newly registered user hover all categories then select computers
    When user click on register button from header menu
    And fill registration form with "male" "mahmoud" "ali" "mahmoud1@ali1.com" "123456" "123456"
    And click REGISTER then click continue
    Then user hover all categories
    And click on all menu items

  Scenario: authenticated user hover all categories then select computers
    When user click on login button from header menu
    And fill login form with "mahmoud1@ali1.com" "123456"
    And  click Login
    Then user hover all categories
    And click on all menu items
