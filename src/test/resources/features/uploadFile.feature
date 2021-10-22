@testo
Feature: Upload file
  Background:
    Given the user is on homepage

  Scenario: verify that user can upload file
    When the user navigates on "Upload Files" sub-page
    And the user should land on "Upload File" sub-page successfully
    Then the user should be able to upload file successfully