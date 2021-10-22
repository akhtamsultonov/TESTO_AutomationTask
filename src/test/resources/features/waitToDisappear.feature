@testo
Feature: Wait to Disappear

  Background:
    Given the user is on homepage

  Scenario: verify that user can get disappeared text
    When the user navigates on "Wait to Disappear" sub-page
    And the user should land on "Explicit Wait for Element Disappearance" sub-page successfully
    Then the user should be able get the disappear text successfully