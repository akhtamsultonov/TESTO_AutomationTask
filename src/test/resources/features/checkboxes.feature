@testo
Feature: Checkboxes

  Background:
    Given the user is on homepage

  Scenario Outline: verify that user can interact with checkboxes
    When the user navigates on "Checkbox" sub-page
    Then the user should land on "Interact with Checkboxes" sub-page successfully
    Then the user should be able to select the "<language>"
    Then the user should be able to confirm "<checked>" is checked
    Then the user should be able to deselect the "<deselect>"
    Then the user should be able to select all
    Examples:
      | language | checked   | deselect      |
      | Java     | Selenium | I am Selected |