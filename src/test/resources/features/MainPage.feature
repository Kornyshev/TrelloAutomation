Feature: Check basic elements on Main Page
  In order to check presence of login form and main banners
  As a new user

  Scenario: Check page title
    Given I open Trello Main Page
    Then page title should be 'Trello'