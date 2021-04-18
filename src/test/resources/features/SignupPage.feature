Feature: Check basic elements on Sign Up page
  In order to check presence of all elements, fields and validations
  As a new user

  Background: Open Sign Up page
    Given I open Trello Main Page
    When click on Sigh-Up button in Header on Main Page

  Scenario: The Sign Up Button leads to correct Sign Up page
    Then Sign Up page has text 'Sign up for your account' in Main Header
    Then page title should be 'Create a Trello Account'

  Scenario Outline: Localization checking on the Sign Up Page
    When choose '<Language>' in Language dropdown on Sign Up Page
    Then Sign Up page has text '<Header>' in Main Header
    Examples:
      | Language   | Header                              |
      | Italiano   | Iscriviti per creare il tuo account |
      | Suomi      | Rekisteröidy tilillesi              |
      | English    | Sign up for your account            |

  Scenario: Redirect to Log In page
    When user clicks Log In link on Sign Up page
    Then Log In page has text 'Log in to Trello' in Main Header