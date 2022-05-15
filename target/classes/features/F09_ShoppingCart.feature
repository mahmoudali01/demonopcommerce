Feature: user can add product to cart successfully
  Scenario: user add product to cart from featured products and product categories
    Given browser navigated to home page
    When user scroll to featured products and click on first product
    Then user is redirected to that product details page
    And  user click on add to cart button from featured product details page
    Then the product is added successfully and navigate to home page
    When user click on digital downloads from product category menu
    And click on first available product
    Then user is redirected to that product details page
    And  user click on add to cart button from category product details page
    Then the product is added successfully and navigate to home page
    And user select shopping cart
    And added products is there and quit
