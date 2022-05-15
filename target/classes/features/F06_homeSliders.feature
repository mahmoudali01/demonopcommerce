Feature: user should be able to switch between sliders and click them

  Scenario: user switch between sliders and click

    Given browser opened and in home page
    When user enter slider control
#    Then user is switched to that slider
    When user enter the other slider control
#    Then user is switched to that slider
    When user click slider
    Then the page is refreshed