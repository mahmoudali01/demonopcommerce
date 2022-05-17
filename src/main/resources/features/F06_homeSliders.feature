@regression
Feature: user should be able to switch between sliders

  Scenario: user switch between sliders and click

    Given browser opened and in home page
    When user click slider control "1"
    Then user is switched to slider image "https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg"
    When user click slider control "2"
    Then user is switched to slider image "https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg"
