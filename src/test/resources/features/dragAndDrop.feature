@testo
Feature: Droppable

  Background:
    Given the user is on homepage


  Scenario: verify that user can drag and drop
    When the user navigates on "Droppable" sub-page
    And the user should land on "Play with Droppable" sub-page successfully
    Then the user should be able to drag and drop successfully