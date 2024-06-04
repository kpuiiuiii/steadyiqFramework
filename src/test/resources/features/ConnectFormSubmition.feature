Feature: Let's connect form feature

  # User story:
  # As a user, I should be able to fill and submit "Contact Us" form


  #@Max
  Scenario: Fill and submit the "Contact Us" form
    Given the user is on the "Contact Us" page
    When the user enters random test data for the form
    And the user presses the "Submit" button
    Then the user should see a message