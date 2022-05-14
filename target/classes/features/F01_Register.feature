Feature: new user should register to the website successfully
  Background:
    Given user open browser and navigates to home page for registration

  Scenario: user enter no data
    When user navigate to register page and enter first name "" last name "" email "" password "" confirm pass ""
    And  click REGISTER
    Then error message with the required fields
  Scenario: user enter wrong email
    When user navigate to register page and enter first name "m" last name "m" email "m" password "123456" confirm pass "123456"
    And  click REGISTER
    Then  wrong email message
  Scenario: user enter password less than 6 characters
    When user navigate to register page and enter first name "m" last name "m" email "m@m.m" password "123" confirm pass "123"
    And  click REGISTER
    Then  error the password should be at least 6 characters
  Scenario: user enter confirm password don't match the password
    When user navigate to register page and enter first name "m" last name "m" email "m@m.m" password "123456" confirm pass "7891011"
    And  click REGISTER
    Then  error confirm password don't match the password
  Scenario: user enter valid information
    When user navigate to register page and enter first name "mahmoud" last name "ali" email "mahmoudali@example.com" password "password" confirm pass "password"
    And  click REGISTER
    Then  registered successfully then click on logout
  Scenario: user enter already existing email
    When user navigate to register page and enter first name "mahmoud" last name "ali" email "mahmoudali@example.com" password "123456" confirm pass "123456"
    And  click REGISTER
    Then error already registered email