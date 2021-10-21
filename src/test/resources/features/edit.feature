
Feature: Edit

  Background:
    Given the user is on homepage

  Scenario: verify that user can edit
    When the user navigates on "Edit" sub-page
    And the user should land on "Work with Edit Fields" sub-page successfully
    And the user should be able to enter email address
    And the user should be able to append text and press Tab
    And the user should be able to get default text
    And the user should be able to clear the text
    And the user should be able to confirm that edit field is disabled
    Then the user should be able to do all steps successfully
