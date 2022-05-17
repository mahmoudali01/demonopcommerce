@regression
Feature: user should click any icon to follow us and redirect fine to the selected platform
  Scenario: user click on all follow us icons
    Given browser opened and redirected to home page
    When user click rss icon from the footer
    Then user is redirected to rss then close
    When user click facebook icon from the footer
    Then user is redirected to facebook then close
    When user click twitter icon from the footer
    Then user is redirected to twitter then close
    When user click youtube icon from the footer
    Then user is redirected to youtube then quit

