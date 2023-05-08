Feature: Amazon Search
  Scenario: Search a product
    Given I have a search filed on Amazon page
    When I search for a product "Apple Macbook Pro" and price 120000
    Then Product with name "Apple Macbook Pro" should be displayed