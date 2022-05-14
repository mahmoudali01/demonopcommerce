Feature: user should be able to switch between currencies
  Background:
    Given user open browser then navigate to home page

  Scenario: unauthenticated user could switch between currencies
    When user select "Euro" then the featured product prices is switched to Euro
    And user select "US Dollar" then the featured product prices is switched US dollar

  Scenario: new registered user could switch between currencies
    And user click on register from top menu
    And enter first name "mahmoud" last name "ali" email "mahmoud@aliii.com" password "password" confirm pass "password"
    And press REGISTER
    And user click on continue button
    When user select "Euro" then the featured product prices is switched to Euro
    And  user select "US Dollar" then the featured product prices is switched US dollar

  Scenario: authenticated user could switch between currencies
    And user click on login button then enter email "mahmoud@aliii.com" password "password"
    And press login button
    When user select "Euro" then the featured product prices is switched to Euro
    And user select "US Dollar" then the featured product prices is switched US dollar

