@regression
Feature: user should be able to switch between sliders and click them

  Scenario: user switch between sliders and click

    Given browser opened and in home page
    When user click inactive slider control "1"
    #Then user is switched to slider number "1"
    When user click the other slider control "2"
   # Then user is switched to slider number "2"
    When user click slider image
    Then the page is refreshed