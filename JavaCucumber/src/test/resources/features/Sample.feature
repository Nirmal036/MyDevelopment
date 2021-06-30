Feature: Selenium Code to fill the given form
  Description : Writing the Selenium code to fill all the given fields in the form

  Scenario: Completing the given form
    Given User launches the Chrome browser
    When User enters the website url
      | website                                                |
      | https://www.seleniumeasy.com/test/input-form-demo.html |
    And User should be able to access the webpage
    Then User completes the input form
