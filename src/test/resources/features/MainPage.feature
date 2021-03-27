Feature: Check basic elements on Main Page
  In order to check presence of login form and main banners
  As a new user

  Scenario: Check page title and main header
    Given I open Trello Main Page
    Then page title should be 'Trello'
    Then header in Hero Section on Main Page has correct text 'Trello helps teams move work forward.'

  Scenario: Check Sign Up form in Hero section doesn't allow to navigate to the next page - text without '@'
    Given I open Trello Main Page
    When type 'incorrect_text' in E-Mail field in Hero section on Main Page
    When click on Sigh-Up button in Hero section on Main Page
    Then page title should be 'Trello'

  Scenario: Check Sign Up form in Hero section doesn't allow to navigate to the next page - text ends with '@'
    Given I open Trello Main Page
    When type 'incorrect_text@' in E-Mail field in Hero section on Main Page
    When click on Sigh-Up button in Hero section on Main Page
    Then page title should be 'Trello'

  Scenario: Check Sign Up form in Sign-Up section doesn't allow to navigate to the next page - text without '@'
    Given I open Trello Main Page
    When type 'incorrect_text' in E-Mail field in Sign-Up section on Main Page
    When click on Sigh-Up button in Sign-Up section on Main Page
    Then page title should be 'Trello'

  Scenario: Check Sign Up form in Sign-Up section doesn't allow to navigate to the next page - text ends with '@'
    Given I open Trello Main Page
    When type 'incorrect_text@' in E-Mail field in Sign-Up section on Main Page
    When click on Sigh-Up button in Sign-Up section on Main Page
    Then page title should be 'Trello'

  Scenario: The Log In Button leads to correct Log In page
    Given I open Trello Main Page
    When click on Log In button in Header on Main Page
    Then Log In page have correct 'Log in to Trello' in Main Header
    Then page title should be 'Log in to Trello'

  Scenario: The Sign Up Button leads to correct Sign Up page
    Given I open Trello Main Page
    When click on Sigh-Up button in Header on Main Page
    Then Sign Up page have correct 'Sign up for your account' in Main Header
    Then page title should be 'Create a Trello Account'

  Scenario Outline: The Sign Up Button leads to correct Sign Up page
    Given I open Trello Main Page
    When choose '<Language>' in Language dropdown on Main Page
    Then header in Hero Section on Main Page has correct text '<Header>'
    Then Language picker has correct value '<Language>'
    Examples:
      | Language   | Header                                               |
      | Deutsch    | Trello hilft Teams, ihre Arbeit voranzutreiben.      |
      | Italiano   | Trello aiuta i gruppi a far avanzare il lavoro.      |
      | Magyar     | A Trellóval a munka jobban halad.                    |
      | Nederlands | Trello helpt teams om werk sneller gedaan te krijgen |
      | Polski     | Trello pomaga zespołom posuwać pracę do przodu.      |