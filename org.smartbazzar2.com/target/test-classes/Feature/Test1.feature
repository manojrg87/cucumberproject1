Feature: Test the title of the application
  Scenario: User want to check the title of the application
    Given User opens the browser
    Then User enters the "https://www.smartbazaar.co.uk/"
    And User verifies the title of the application
    Then User close the browser