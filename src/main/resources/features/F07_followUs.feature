@regression
Feature: user should click any icon to follow us and redirect fine to the selected platform
  Scenario: user click on all follow us icons
    When user click rss icon from the footer
    Then user is redirected to rss

    When user click facebook icon from the footer
    Then user is redirected to facebook

    When user click twitter icon from the footer
    Then user is redirected to twitter

    When user click youtube icon from the footer
    Then user is redirected to youtube

