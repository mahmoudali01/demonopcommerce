Feature: user should be able to login successfully
  Background:
    Given user open browser and navigates to home page

  Scenario: user enter no data
    When user navigate to login page and enter email "" password ""
    And user click on login button
    Then error message please enter email

  Scenario: user login with invalid email and password
    When user navigate to login page and enter email "m@m.m" password "invalid"
    And user click on login button
    Then error message login was unsuccessful

  Scenario: user enter invalid email format
    When user navigate to login page and enter email "m" password ""
    And user click on login button
    Then error message wrong email

  Scenario: user login with valid email and password
    When user navigate to login page and enter email "mahmoudali@example.com" password "password"
    And user click on login button
    Then user log in successfully and redirected to homepage