Feature: user should be able to search product by name or SKU
  Background:
    Given open browser and go to home page
    Scenario: unauthenticated user can search products
      When user enter invalid product number as "bla bla"
      Then user is redirected to a page with no products
      When enter valid product full name as "Apple MacBook Pro 13-inch" and click enter
      Then user is redirected to a page has the searched product
      When enter valid product partial name as "Apple" and click enter
      Then user is redirected to a page has the searched product
      When enter SKU: "AP_MBP_13" and click enter
      Then user is redirected to a page has the searched product



  Scenario: newly registered can search product
    When choose register from header
    And register "mahmoud" "ali" "mahmoud1@ali.com" "123456" "123456"
    And  register and continue pressed
    When user enter invalid product number as "bla bla"
    Then user is redirected to a page with no products
    When enter valid product full name as "Apple MacBook Pro 13-inch" and click enter
    Then user is redirected to a page has the searched product
    When enter valid product partial name as "Apple" and click enter
    Then user is redirected to a page has the searched product
    When enter SKU: "AP_MBP_13" and click enter
    Then user is redirected to a page has the searched product

  Scenario: authenticated can search product
    When choose login from header
    And  login  "mahmoud1@ali.com" "123456"
    And  login pressed
    When user enter invalid product number as "bla bla"
    Then user is redirected to a page with no products
    When enter valid product full name as "Apple MacBook Pro 13-inch" and click enter
    Then user is redirected to a page has the searched product
    When enter valid product partial name as "Apple" and click enter
    Then user is redirected to a page has the searched product
    When enter SKU: "AP_MBP_13" and click enter
    Then user is redirected to a page has the searched product
