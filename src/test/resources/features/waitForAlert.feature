@testo
Feature: Wait for Alert
  Background:
    Given the user is on homepage

  Scenario: verify that user can upload file
    When the user navigates on "Wait for Alert" sub-page
    And the user should land on "Explicit Wait for Alert Appearance" sub-page successfully
    Then the user should be able to get handle alert successfully
