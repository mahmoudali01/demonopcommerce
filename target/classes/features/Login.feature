Feature: user should be able to login to the system
  Scenario: user login with valid email and password
    Given user navigates to login page
    When user enter a valid username and password
    And user click on login button
    Then user log in successfully and redirected to homepage

