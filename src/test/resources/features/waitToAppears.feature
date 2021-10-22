@testo
Feature: Wait to Appear

  Background:
    Given the user is on homepage

  Scenario: verify that user can get the hidden text
    When the user navigates on "Wait to Appear" sub-page
    And the user should land on "Explicit Wait for Element to Appears" sub-page successfully
    Then the user should be able get the "Voila! I'm here Guys" text successfully