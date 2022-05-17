@regression
Feature: user can add product to cart successfully
  Scenario: user add product to cart from featured products and product categories
    Given browser navigated to home page
    When user scroll to featured products and click "Build your own computer" product
    And  user click on add to cart button from featured product details page
    Then navigate to home page
    When user click on digital downloads from product category menu
    And click "If You Wait (donation)" product
    And  user click on add to cart button from category product details page
    Then  navigate to home page
    And user select shopping cart
    And check "Build your own computer" and "If You Wait (donation)"  products are added and quit
