Feature: user can add product to wishlist successfully
  Scenario: user add product to wishlist from featured products and product categories
    Given browser open to home page
    When user scroll down to featured products and click "Build your own computer" product
    And  user click on add to wishlist button from featured product details page
    Then go back to home page
    When user click on digital downloads from product category top menu
    And click on "If You Wait (donation)" product
    And  user click on add to wishlist button from category product details page
    Then  go back to home page
    And user select wishlist
    And check "Build your own computer" and "If You Wait (donation)"  products are added to wish list and quit
