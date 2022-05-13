Feature: user should be able to login successfully
Background:
  Given user open browser and navigates to home page

  Scenario: user login with invalid email and password
    When user enter "m@m.com" and "invalid"
    And user click on login button
    Then error message login was unsuccessful

  Scenario: user enter invalid email format
    When user enter "m" and ""
    And user click on login button
    Then error message wrong email

  Scenario: user enter no data
    When user enter "" and ""
    And user click on login button
    Then error message please enter email

  Scenario: user login with valid email and password
    When user enter "m666245@gmail.com" and "password"
    And user click on login button
    Then user log in successfully and redirected to homepage