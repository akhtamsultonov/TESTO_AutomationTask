
Feature: Edit

  Background:
    Given the user is on homepage
  @wip
  Scenario: verify that user can edit
    When the user navigates on "Edit" sub-page
    Then the user should land on "Work with Edit Fields" sub-page successfully
    Then the user should be able to enter email address
    Then the user should be able to append text and press Tab
    Then the user should be able to get default text
    Then the user should be able to clear the text
    Then the user should be able to confirm that edit field is disabled

