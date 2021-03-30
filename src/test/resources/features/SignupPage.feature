Feature: Check basic elements on Sign Up page
  In order to check presence of all elements, fields and validations
  As a new user

  Scenario: The Sign Up Button leads to correct Sign Up page
    Given I open Trello Main Page
    When click on Sigh-Up button in Header on Main Page
    Then Sign Up page have correct 'Sign up for your account' in Main Header
    Then page title should be 'Create a Trello Account'

  Scenario Outline: Localization checking on the Sign Up Page
    When choose '<Language>' in Language dropdown on Sign Up Page
    Then Sign Up page have correct '<Header>' in Main Header
    Examples:
      | Language   | Header                              |
      | Italiano   | Iscriviti per creare il tuo account |
      | Suomi      | Rekisteröidy tilillesi              |
      | English    | Sign up for your account            |