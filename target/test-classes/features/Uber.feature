Feature: Uber booking feature
  Scenario: Booking cab
    Given User wants to select a car type "sedan" from uber app
    When user select car "sedan" and pickup point "Banglore" and drop location "pune"
    Then Driver starts the jouney
    And Driver ends the journey
    Then User pays 5000 INR