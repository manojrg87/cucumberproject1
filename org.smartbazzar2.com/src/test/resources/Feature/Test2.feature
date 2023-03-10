Feature: To check the functionality of the search
  Scenario Outline: User wants to search the products
    Given User opens the browser
    Then User enters the "https://www.smartbazaar.co.uk/"
    And User enters the '<search>' data in the search bar
    When User clicks on the search icon
    And User verifies the '<search>' results
    Then User selects the '<product>' from the list
    And User verifies the '<product>' result
    Then User close the browser

    Examples:
    |search|product|
    |rice  |ASALI KAATU YANAM RICE (1KG)|
    |flowers|MARIGOLD FLOWERS – YELLOW (100G)|
    